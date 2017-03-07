import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class TelaMenu {

	static JFrame jfmenu;
	static JPanel jppainel;
	static JMenuBar jmenubar;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		jfmenu = new JFrame("Menu");
		jfmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfmenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
		jfmenu.show();
		jfmenu.setLocationRelativeTo(null);
		jfmenu.setResizable(false);
		jfmenu.setVisible(true);
		
		jppainel = new JPanel();
		jppainel.setLayout(null);
		jppainel.setBackground(Color.WHITE);
		jppainel.setVisible(true);
		jfmenu.add(jppainel);
		
		jmenubar = new JMenuBar();
		jmenubar.setSize(80, 100);
		jmenubar.setVisible(true);
		jmenubar.add(jppainel);

		
		
		
	}

}
