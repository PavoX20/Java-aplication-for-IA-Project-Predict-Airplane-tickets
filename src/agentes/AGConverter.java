/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;

import contenidoSerializado.*;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AGConverter extends Agent {

    @Override
    protected void setup() {
        addBehaviour(new Comportamiento());
    }

    class Comportamiento extends CyclicBehaviour {

        @Override
        public void action() {
            ACLMessage msj = blockingReceive();
            String idC = msj.getConversationId();
            if (idC.equalsIgnoreCase("CODAGReciver")) {
                try {
                    Datos datos = (Datos) msj.getContentObject();
                    String[] datosNum = new String[6];

                    Hashtable<String, String> airlines = new Hashtable<String, String>();
                    airlines.put("Air Asia", "0");
                    airlines.put("Air India", "1");
                    airlines.put("GoAir", "2");
                    airlines.put("IndiGo", "3");
                    airlines.put("Jet Airways", "4");
                    airlines.put("Jet Airways Business", "5");
                    airlines.put("Multiple carriers", "6");
                    airlines.put("Multiple carriers Premium economy", "7");
                    airlines.put("SpiceJet", "8");
                    airlines.put("Trujet", "9");
                    airlines.put("Vistara", "10");
                    airlines.put("Vistara Premium economy", "11");

                    Hashtable<String, String> source = new Hashtable<String, String>();
                    source.put("Banglore", "0");
                    source.put("Chennai", "1");
                    source.put("Delhi", "2");
                    source.put("Kolkata", "3");
                    source.put("Mumbai", "4");

                    Hashtable<String, String> destination = new Hashtable<>();
                    destination.put("Banglore", "0");
                    destination.put("Cochin", "1");
                    destination.put("Delhi", "2");
                    destination.put("Hyderabad", "3");
                    destination.put("Kolkata", "4");
                    destination.put("New Delhi", "5");

                    Hashtable<String, String> stops = new Hashtable<>();
                    stops.put("1 stop", "0");
                    stops.put("2 stops", "1");
                    stops.put("3 stops", "2");
                    stops.put("4 stops", "3");
                    stops.put("non-stop", "4");

                    Hashtable<String, String> months = new Hashtable<>();
                    months.put("January", "1");
                    months.put("Febrary", "2");
                    months.put("March", "3");
                    months.put("April", "4");
                    months.put("May", "5");
                    months.put("June", "6");
                    months.put("July", "7");
                    months.put("August", "8");
                    months.put("September", "9");
                    months.put("October", "10");
                    months.put("November", "11");
                    months.put("December", "12");

                    datosNum[0] = airlines.get(datos.getDatos()[0]);
                    datosNum[1] = source.get(datos.getDatos()[1]);
                    datosNum[2] = destination.get(datos.getDatos()[2]);
                    datosNum[3] = stops.get(datos.getDatos()[3]);
                    datosNum[4] = months.get(datos.getDatos()[4]);
                    datosNum[5] = datos.getDatos()[5];

                    datos.setDatosNum(datosNum);

                    Mensajes.enviarS(ACLMessage.INFORM, "AGModel", datos, "CODAGConverter", getAgent());
                } catch (UnreadableException ex) {
                    Logger.getLogger(AGConverter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
