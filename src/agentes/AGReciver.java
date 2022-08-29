/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;

import contenidoSerializado.*;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import agentesc.*;
import jade.lang.acl.UnreadableException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AGReciver extends Agent {

    @Override
    protected void setup() {
        addBehaviour(new Comportamiento());
    }

    /*
    @Override
    protected void takeDown(){
        Contenedor c = (Contenedor)getArguments()[0];
        int i = Integer.parseInt(getArguments()[1].toString());
        i++;
        c.crearHijos("AgenteHijo"+i, new Object[]{c,i});
        System.out.println("Morir");
    }*/
    class Comportamiento extends Behaviour {

        boolean terminado = true;

        String[] datosGUI = new String[6];

        @Override
        public void action() {
            
            datosGUI[0] = main.gui.Airline.getSelectedItem().toString();
            datosGUI[1] = main.gui.Source.getSelectedItem().toString();
            datosGUI[2] = main.gui.Destination.getSelectedItem().toString();
            datosGUI[3] = main.gui.Stops.getSelectedItem().toString();
            datosGUI[4] = main.gui.Months.getSelectedItem().toString();
            datosGUI[5] = main.gui.Day.getSelectedItem().toString();
            datosGUI.toString();
            main.gui.Airline.setName("Not selected");
            main.gui.Source.setName("Not selected");
            main.gui.Destination.setName("Not selected");
            main.gui.Stops.setName("Not selected");
            main.gui.Months.setName("Not selected");
            main.gui.Day.setName("Not selected");
            //En el modelo hay que pasar la duración también 

            Datos datos = new Datos(datosGUI);

            Mensajes.enviarS(ACLMessage.INFORM, "AGConverter", datos, "CODAGReciver", getAgent());
            
            ACLMessage msj = blockingReceive();

            String idC = msj.getConversationId();
            if (idC.equalsIgnoreCase("CODModel")) {

                main.gui.setVisible(true);
            }
        }

        @Override
        public boolean done() {
            return terminado;
        }
    }
}
