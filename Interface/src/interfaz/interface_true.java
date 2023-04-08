package interfaz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class interface_true extends JFrame{
	private PanelPerrosExposicion PanelPerrosExposicion;
	private PanelDatosPerro PanelDatosPerro;
	private PanelBusqueda PanelBusqueda;
	private PanelAgregar PanelAgregar;
	private PanelConsulta PanelConsulta;
	private PanelExtension PanelExtension;
	
	

	
	public interface_true() {
		super("GridBagLayout");
		this.setSize(new Dimension(800,600));
		this.setResizable(false);
		this.setTitle("Exposición Canina");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		PanelPerrosExposicion = new PanelPerrosExposicion();
		PanelDatosPerro = new PanelDatosPerro();
		PanelBusqueda = new PanelBusqueda();
		PanelAgregar = new PanelAgregar();
		PanelConsulta = new PanelConsulta();
		PanelExtension = new PanelExtension();
		
		
		

        	JPanel arriba = new JPanel( );
        	JPanel centro = new JPanel( );
        
        
        	arriba.setLayout( new GridBagLayout( ) );

        
        	gbc.gridx = 0;
        	gbc.gridy = 0;
        	gbc.fill = GridBagConstraints.BOTH;
        	gbc.ipadx = 170;
        	arriba.add( PanelPerrosExposicion, gbc );

        
        	gbc = new GridBagConstraints( );
        	gbc.gridx = 1;
        	gbc.gridy = 0;
        	gbc.ipadx = 100;
        	gbc.ipady = 200;
        	arriba.add( PanelDatosPerro, gbc );

   
        	gbc = new GridBagConstraints( );
        	gbc.gridx = 2;
        	gbc.gridy = 0;
        	gbc.ipadx = 10;
        	gbc.ipady = 120;
        	arriba.add( PanelBusqueda, gbc );

        	gbc = new GridBagConstraints( );
        	gbc.gridx = 0;
        	gbc.gridy = 0;
        	gbc.fill = GridBagConstraints.BOTH;
        	getContentPane( ).add( arriba, gbc );

        
        	centro.setLayout( new GridBagLayout( ) );

        
        	gbc = new GridBagConstraints( );
        	gbc.gridx = 0;
        	gbc.gridy = 0;
        	gbc.ipady = 35;
        	gbc.ipadx = 20;
        	centro.add( PanelAgregar, gbc );

		gbc = new GridBagConstraints( );
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.ipadx = 90;
		gbc.ipady = 10;
		centro.add( PanelConsulta, gbc );

		gbc = new GridBagConstraints( );
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.BOTH;
		getContentPane( ).add( centro, gbc );

        
        
        
		gbc = new GridBagConstraints( );
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.BOTH;
		getContentPane( ).add( PanelExtension, gbc );
	
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		interface_true vc = new interface_true();
	}
	
}
