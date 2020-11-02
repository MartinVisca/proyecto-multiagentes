package agentesPeliculas;

import comportamiento.ComportamientoReceive;
import jade.core.Agent;

public class Responder extends Agent {

    @Override
    protected void setup() {
        this.addBehaviour(new ComportamientoReceive());
    }
}
