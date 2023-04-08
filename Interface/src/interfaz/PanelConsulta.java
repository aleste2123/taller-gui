package interfaz;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelConsulta extends JPanel {
	
	private JButton boton1;
    private JButton boton2;
    private JButton boton3;
	
	public PanelConsulta() {
		setLayout( new GridLayout( 4, 1, 10, 10 ) );
		setBorder( new CompoundBorder( new EmptyBorder( 4, 3, 3, 3 ), new TitledBorder( "Consultas Exposición" ) ) );
		boton1 = new JButton( "Ganador" );
		boton2 = new JButton( "Menor Puntaje" );
		boton3 = new JButton( "Más Viejo" );
 
        	add( boton1 );
        	add( boton2 );
        	add( boton3 );
		
	}
	

}
