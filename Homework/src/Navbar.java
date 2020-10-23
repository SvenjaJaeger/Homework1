import java.awt.*;
import java.awt.event.*;

public class Navbar extends MenuBar implements ActionListener {
		
	private Menu _menu; 
	
	public Navbar() {
		_menu = new Menu("Hintergrundfarbe"); 
		
		MenuItem schwarz = new MenuItem("Schwarz"); 
		schwarz.addActionListener(this);
		_menu.add(schwarz); 
		MenuItem weis = new MenuItem("Weis"); 
		weis.addActionListener(this);
		_menu.add(weis); 
		MenuItem grau = new MenuItem("Grau"); 
		grau.addActionListener(this);
		_menu.add(grau); 
		
		add(_menu); 
		
		
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand() == "Schwarz") {
			Surface.isSetColor.setBackgroundColor(Color.black); 

		}
		
		
		if (e.getActionCommand() == "Weis" ) {
			Surface.isSetColor.setBackgroundColor(Color.white); 

		}
		
		if (e.getActionCommand() == "Grau" ) {
			Surface.isSetColor.setBackgroundColor(Color.gray);  

		}
		
	}
}
