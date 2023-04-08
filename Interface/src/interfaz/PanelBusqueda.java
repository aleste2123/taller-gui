package interfaz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelBusqueda extends JPanel {
	
	private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
	
	public PanelBusqueda() {
		
		setPreferredSize( new Dimension( 200, 0 ) );
        setBorder( new CompoundBorder( new EmptyBorder( 4, 3, 3, 3 ), new TitledBorder( "Búsqueda y ordenamientos" ) ) );
        setLayout( new GridBagLayout( ) );

        boton1 = new JButton( "Ordenar por Raza" );
        GridBagConstraints gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets( 0, 0, 10, 0 );
        gbc.fill = GridBagConstraints.BOTH;
        add( boton1, gbc );

        boton2 = new JButton( "Ordenar por Puntos" );
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets( 0, 0, 10, 0 );
        gbc.fill = GridBagConstraints.BOTH;
        add( boton2, gbc );

        boton3 = new JButton( "Ordenar por Edad" );
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets( 0, 0, 10, 0 );
        gbc.fill = GridBagConstraints.BOTH;
        add( boton3, gbc );

        boton4 = new JButton( "Buscar Perro" );
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets( 0, 0, 10, 0 );
        gbc.fill = GridBagConstraints.BOTH;
        add( boton4, gbc );
		
		
		
		
	}
	

}
