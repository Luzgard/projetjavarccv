package view;

import java.awt.Color;
import java.awt.GraphicsConfiguration;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.IModel;



class ViewFrame extends JFrame implements KeyListener {
	
	private Imodel model;
	private IController controller;
	private static final long serialVersionUID = 697358409737458175L;
	
	public ViewFrame(final Imode model) throw Headlessexception {
		
	}
	
	public ViewFrame(final Imodel model, final String title, final GraphicsConfiguration gc) {
		
	}
	private IController getController() {
		return this.controller;
	}
	
	protected void setController(final IController controller) {
		this.controller = controller;
	}
	
	protected IModel getModel() {
		return this.model;
	}
	
	private void setModel(final IModel model) {
		this.model = model;
	}
	
	private void buildViewFrame(final IModel model) {
	
	}
	
	public void printMessage(final String message) {
		
	}
	
	public void keyTyped(final KeyEvent e) {

	}
	
	public void keyPressed(final KeyEvent e) {
		this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
	}
	
	public void keyReleased(final KeyEvent e) {

	}


}
