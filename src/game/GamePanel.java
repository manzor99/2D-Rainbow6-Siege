package game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

	private BufferedImage image;
	
	public GamePanel() {
		super();
		try {                
	          image = ImageIO.read(new File("C:\\\\Users\\\\R\\\\Documents\\\\GitHub\\\\2D-Rainbow6-Siege\\\\src\\\\resources\\\\map1.png"));
	    } catch (IOException ex) {
	            // handle exception...
	    }
	}
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
    }
}
