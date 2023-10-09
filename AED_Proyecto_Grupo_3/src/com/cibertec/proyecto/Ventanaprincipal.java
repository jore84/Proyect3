package com.cibertec.proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;



public class Ventanaprincipal {

	private JFrame frmProyecto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanaprincipal window = new Ventanaprincipal();
					window.frmProyecto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventanaprincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProyecto = new JFrame();
		frmProyecto.setTitle("Proyecto_3");
		frmProyecto.setBounds(100, 100, 545, 374);
		frmProyecto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProyecto.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		frmProyecto.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Vendedores");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Ingreso");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Modificacion");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Consulta");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Eliminacion");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Listado");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("Clientes");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Ingreso");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Modificacion");
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Consulta");
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Eliminacion");
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Listado");
		mnNewMenu_2.add(mntmNewMenuItem_9);
		
		JMenu mnNewMenu_3 = new JMenu("Productos");
		mnNewMenu.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Ingreso");
		mnNewMenu_3.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Modificacion");
		mnNewMenu_3.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Consulta");
		mnNewMenu_3.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Eliminacion");
		mnNewMenu_3.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Listado");
		mnNewMenu_3.add(mntmNewMenuItem_14);
		
		JMenu mnNewMenu_4 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("Ventas");
		mnNewMenu_4.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("Reportes");
		menuBar.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Reportes General por productos");
		mnNewMenu_6.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Reporte General por Vendedores");
		mnNewMenu_6.add(mntmNewMenuItem_16);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Reporte Por Vendedor");
		mnNewMenu_6.add(mntmNewMenuItem_17);
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("Reporte Por Producto");
		mnNewMenu_6.add(mntmNewMenuItem_18);
		
		JMenuItem mntmNewMenuItem_19 = new JMenuItem("Reporte de Precios");
		mnNewMenu_6.add(mntmNewMenuItem_19);
	}
}
