package interfaz;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelExtension extends JPanel {
	
	 private JButton boton1;
	 private JButton boton2;
	
	public PanelExtension() {
		setLayout( new FlowLayout( ) );
		TitledBorder border = BorderFactory.createTitledBorder("Puntos de extensión");
		setBorder(border);
		boton1 = new JButton("Opción 1");
		boton2 = new JButton("Opción 2" );
		add( boton1 );
        add( boton2 );
	}

}