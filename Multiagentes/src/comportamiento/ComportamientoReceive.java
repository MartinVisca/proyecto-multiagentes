package comportamiento;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class ComportamientoReceive extends Behaviour {

    @Override
    public void action() {
        ACLMessage msg = myAgent.receive();

        if (msg != null) {
            ACLMessage reply = msg.createReply();

            if (Math.random() > 0.2) {
                reply.setPerformative(ACLMessage.REJECT_PROPOSAL);
                reply.setContent("Película rechazada: " + msg.getContent());
            }
            else {
                reply.setPerformative(ACLMessage.ACCEPT_PROPOSAL);
                reply.setContent("Película aceptada: " + msg.getContent());
            }

            myAgent.send(reply);
        } else
            block();
    }

    @Override
    public boolean done() {
        return false;
    }

}