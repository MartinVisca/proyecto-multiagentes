package agentesPeliculas;

import comportamiento.ComportamientoEnvioMensaje;
import comportamiento.ComportamientoRecibirMensaje;
import jade.core.Agent;

public class Initiator extends Agent {

    @Override
    protected void setup() {
        this.addBehaviour(new ComportamientoEnvioMensaje());
        this.addBehaviour(new ComportamientoRecibirMensaje());
    }

}
