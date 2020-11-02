package comportamiento;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class ComportamientoRecibirMensaje extends Behaviour {

    private Boolean acepto = false;

    @Override
    public void action() {
        ACLMessage mensaje = myAgent.receive();

        if (mensaje != null) {
            if (mensaje.getPerformative() == ACLMessage.ACCEPT_PROPOSAL)
                this.acepto = true;
            System.out.println(mensaje.getContent());
        } else
            block();
    }

    @Override
    public boolean done() {
        return acepto;
    }

}
