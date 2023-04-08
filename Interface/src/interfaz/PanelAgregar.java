package interfaz;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelAgregar extends JPanel {
	
	private JTextField Img;
    private JTextField Nom;
    private JTextField Raza;
    private JTextField Edad;
    private JTextField Puntos;
    private JLabel etImagen;
    private JLabel etNombre;
    private JLabel etRaza;
    private JLabel etPuntos;
    private JLabel etEdad;
    private JButton boton1;
    private JButton boton2;
	
	public PanelAgregar() {
		setLayout( new GridBagLayout( ) );
        setBorder( new CompoundBorder( new EmptyBorder( 4, 3, 3, 3 ), new TitledBorder( "Agregar Perro" ) ) );
        
        
        JPanel panel = new JPanel( new GridBagLayout( ) );
        
        
        etNombre = new JLabel( "Nombre:" );
        GridBagConstraints gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add( etNombre, gbc );
        
        Nom = new JTextField( "" );
        gbc = new GridBagConstraints( );
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 1;
        panel.add( Nom, gbc );

   
        etRaza = new JLabel( "Raza:" );
        etRaza.setBorder( new EmptyBorder( 0, 5, 0, 0 ) );
        gbc = new GridBagConstraints( );
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.EAST;
        panel.add( etRaza, gbc );
        
        Raza = new JTextField( "" );
        gbc = new GridBagConstraints( );
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add( Raza, gbc );

       
        etEdad = new JLabel( "Edad:" );
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add( etEdad, gbc );
        
        Edad = new JTextField( "" );
        gbc = new GridBagConstraints( );
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 1;
        panel.add( Edad, gbc );

        
        etPuntos = new JLabel( "Puntos:" );
        etPuntos.setBorder( new EmptyBorder( 0, 5, 0, 0 ) );
        gbc = new GridBagConstraints( );
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add( etPuntos, gbc );
        
        Puntos = new JTextField( "" );
        gbc = new GridBagConstraints( );
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.ipadx = 160;
        panel.add( Puntos, gbc );

  
        etImagen = new JLabel( "Imagen: " );
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add( etImagen, gbc );
        
        
        
        JPanel panelBt = new JPanel( );
        boton2 = new JButton( "Agregar Perro" );
        panelBt.add( boton2 );

        JPanel panelImg = new JPanel( new GridLayout( ) );
        
        Img = new JTextField( "" );
        boton1 = new JButton( "Examinar" );

        gbc = new GridBagConstraints( );
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 2;
        panelImg.add( Img );
        
        gbc = new GridBagConstraints( );
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 2;
        panelImg.add( boton1 );
        gbc = new GridBagConstraints( );
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add( panelImg , gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        add( panel, gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        add( panelBt, gbc );
	
	}
	
}
