package comportamiento;

import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

import java.util.Random;

public class ComportamientoEnvioMensaje extends Behaviour {

    String[] peliculas = {"Fight Club", "The Prestige", "Interstellar", "Inception", "Pulp Fiction", "The Godfather I", "Midnight Run", "The Dark Knight", "Joker",
            "Forrest Gump", "Catch Me If You Can", "Men in Black", "Space Jam", "Ocean's Eleven", "Rocky Balboa", "Rocky IV", "Creed", "Hacksaw Ridge"};

    public String getPelicula() {
        int posicion = new Random().nextInt(this.peliculas.length);
        return this.peliculas[posicion];
    }

    @Override
    public void action() {
        ACLMessage msg = new ACLMessage(ACLMessage.PROPOSE);
        String pelicula = this.getPelicula();
        msg.addReceiver(new AID("Responder", AID.ISLOCALNAME));
        msg.setContent(pelicula);
        msg.setSender(myAgent.getAID());
        myAgent.send(msg);
    }

    @Override
    public boolean done() {
        return false;
    }

}
