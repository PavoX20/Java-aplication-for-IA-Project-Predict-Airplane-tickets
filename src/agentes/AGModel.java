/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;

import agentesc.main;
import contenidoSerializado.*;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AGModel extends Agent {

    @Override
    protected void setup() {
        addBehaviour(new Comportamiento());
    }

    class Comportamiento extends CyclicBehaviour {

        @Override
        public void action() {
            ACLMessage msj = blockingReceive();
            
            String idC = msj.getConversationId();
            if (idC.equalsIgnoreCase("CODAGConverter")) {
                
                try {
                    Datos datos = (Datos) msj.getContentObject();
                    String mostrar="";
                    for (int j=3; j<12; j++){
                        
                        
                        
                        try {
                        ProcessBuilder builder = new ProcessBuilder("/opt/homebrew/Caskroom/miniforge/base/bin/conda",
                                "run", "-n", "tensorflow", "python3",
                                "/Users/pavox20/Library/CloudStorage/OneDrive-EscuelaPolitécnicaNacional/Semestres/7mo Semestre/Inteligencia Artifical/Ejercicios Base de datos/Proyecto/proyecto.py",
                                datos.getDatosNum()[0], datos.getDatosNum()[1], datos.getDatosNum()[2], datos.getDatosNum()[3], datos.getDatosNum()[4], datos.getDatosNum()[5],
                                String.valueOf(j));
                        
                        Process process = builder.start();
                        
                        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                        
                        String resultado = null;
                        String prediccion[] = new String[11];
                        int i = 0;
                        while ((resultado = reader.readLine()) != null) {
                            prediccion[i] = resultado;
                            i++;
                        }
                        
                        
                        double value1= Math.round(Double.parseDouble(prediccion[4])*100.0)/100.0;
                        double value2= Math.round(Double.parseDouble(prediccion[5])*100.0)/100.0;
                        mostrar+="(SVR) Predicted Airline ticket with "+ j+ " hours of flight duration is:" + value1 +"$\n";
                        mostrar+="(ANN) Predicted Airline ticket with "+ j+ " hours of flight duration is:" + value2 +"$\n\n";
                        main.showdata.TextShowData.setText(mostrar);
                        main.showdata.setVisible(true);
                        
                             
                        datos.setPrediccion(prediccion);
                        Mensajes.enviarS(ACLMessage.INFORM, "AGReciver", "Puedes recibir más datos", "CODModel", getAgent());
                        
                    } catch (IOException ex) {
                        Logger.getLogger(AGModel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        
                        
                        
                    }
                    
                } catch (UnreadableException ex) {
                    Logger.getLogger(AGModel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
