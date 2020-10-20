package agentes;

import jade.gui.GuiEvent;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GuiAgentFrame extends JFrame {

    private MiAgenteGui agente;

    public void actionPerformed(ActionEvent accion) {
        GuiEvent ge = new GuiEvent(this, 0);
        ge.addParameter(this);
        agente.postGuiEvent(ge);
    }

}
