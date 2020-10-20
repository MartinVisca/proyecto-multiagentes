import jade.core.behaviours.Behaviour;

public class MiComportamiento extends Behaviour {

    private MiAgente agente;

    public void setAgente(MiAgente agente) {
        this.agente = agente;
    }

    public MiAgente getAgente() {
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
