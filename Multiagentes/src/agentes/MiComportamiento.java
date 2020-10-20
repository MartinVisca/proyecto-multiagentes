package agentes;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class MiComportamiento extends Behaviour {

    private Agent agente;

    public void setAgente(Agent agente) {
        this.agente = agente;
    }

    public Agent getAgente() {
        return agente;
    }

    @Override
    public void action() {
        System.out.println("El agente " + agente.getAID().getName() + " está activo.");
    }

    @Override
    public boolean done() {
        return true;
    }

}
