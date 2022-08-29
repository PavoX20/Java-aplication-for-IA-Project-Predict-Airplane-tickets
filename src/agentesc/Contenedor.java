/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentesc;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import agentes.*;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Contenedor {

    AgentContainer agentContainer;

    public void contenedor() {
        jade.core.Runtime runtime = jade.core.Runtime.instance();
        Profile P = new ProfileImpl(null, 1099, null);
        agentContainer = runtime.createMainContainer(P);
        agregarAgentes();
    }

    private void agregarAgentes() {
        try {
            agentContainer.createNewAgent("AGReciver", AGReciver.class.getName(), null).start();
            agentContainer.createNewAgent("AGConverter", AGConverter.class.getName(), null).start();
            agentContainer.createNewAgent("AGModel", AGModel.class.getName(), null).start();
            
        } catch (StaleProxyException ex) {
            Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
