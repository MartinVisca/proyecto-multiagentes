import jade.core.Agent;
import jade.wrapper.*;

public class MiAgente extends Agent {

    @Override
    protected void setup() {
        MiComportamiento comportamiento = new MiComportamiento();
        comportamiento.setAgente(this);
        comportamiento.action();
    }

    public void crearAgenteAPartirDeAgente() {
        AgentContainer c = getContainerController();
        try {
            AgentController a = c.createNewAgent(c.getName() + "B", "MiAgente", null);
            a.start();
        } catch (StaleProxyException e) {}
    }

}
