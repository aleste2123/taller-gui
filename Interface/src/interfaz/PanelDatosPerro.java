package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class PanelDatosPerro extends JPanel {
	
	
	private JLabel etiquetaImg;
    private JLabel etiquetaName;
    private JLabel etiquetaRaza;
    private JLabel etiquetaPoints;
    private JLabel etiquetaAño;
    private JTextField Name;
    private JTextField Raza;
    private JTextField Año;
    private JTextField Altura;
	
	public PanelDatosPerro() {
		setLayout( new BorderLayout( ) );
        setBorder( new CompoundBorder( new EmptyBorder( 4, 3, 3, 3 ), new TitledBorder( "Datos Perro" ) ) );
        
        
        JPanel panelImagen = new JPanel( );
        etiquetaImg = new JLabel( );
        etiquetaImg.setBorder( new LineBorder( Color.BLACK, 5 ) );
        etiquetaImg.setPreferredSize( new Dimension( 200, 200 ) );
        panelImagen.add( etiquetaImg );
        add( panelImagen, BorderLayout.CENTER );
        
        JPanel panelDatos = new JPanel( new GridLayout( 2, 4 ) );

        etiquetaName = new JLabel( "Nombre: " );
        Name = new JTextField( );
        Name.setEnabled( false );
        panelDatos.add( etiquetaName );
        panelDatos.add( Name);

        etiquetaRaza = new JLabel( "Raza: " );
        etiquetaRaza.setBorder( new EmptyBorder( 0, 5, 0, 0 ) );
        Raza = new JTextField( );
        Raza.setEnabled( false );
        panelDatos.add( etiquetaRaza );
        panelDatos.add( Raza );

        etiquetaAño = new JLabel( "Edad: " );
        Año = new JTextField( );
        Año.setEnabled( false );
        panelDatos.add( etiquetaAño );
        panelDatos.add( Año );

        etiquetaPoints = new JLabel( "Puntos: " );
        etiquetaPoints.setBorder( new EmptyBorder( 0, 5, 0, 0 ) );
        Altura = new JTextField( );
        Altura.setEnabled( false );
        panelDatos.add( etiquetaPoints );
        panelDatos.add( Altura );

        add( panelDatos, BorderLayout.SOUTH );
	
	}
	

}