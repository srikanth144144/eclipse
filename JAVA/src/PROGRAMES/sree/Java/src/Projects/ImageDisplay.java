package Projects;
import java.awt.*;
import javax.swing.JFrame;
public class ImageDisplay extends Canvas{	
	public void paint(Graphics g) {
		Toolkit t1=Toolkit.getDefaultToolkit();
		Image j=t1.getImage("D:\\1.jpg");
		g.drawImage(j, 72,72,this);			
	}
		public static void main(String[] args) {
		ImageDisplay i=new ImageDisplay();
		JFrame fm=new JFrame();
		fm.add(i);
		fm.setSize(450,450);
		//f.setLayout(null);
		fm.setVisible(true);
	}

}


