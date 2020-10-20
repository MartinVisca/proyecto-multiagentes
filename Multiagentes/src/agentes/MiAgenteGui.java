package agentes;

import agentes.GuiAgentFrame;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;

public class MiAgenteGui extends GuiAgent {

    private GuiAgentFrame gui;
    private MiComportamiento comportamiento;

    @Override
    protected void setup() {
        comportamiento = new MiComportamiento();
        comportamiento.setAgente(this);
        gui = new GuiAgentFrame();
        gui.setVisible(Boolean.TRUE);
    }

    @Override
    protected void onGuiEvent(GuiEvent guiEvent) {
        comportamiento.action();
    }

}
