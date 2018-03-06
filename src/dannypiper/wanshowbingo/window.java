/**
 * 
 */
package dannypiper.wanshowbingo;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.SliderUI;

import dannypiper.wanshowbingo.window;

/**
 * @author Danny
 *
 */
public class window {

	public boolean[] activated = {
			false, false, false,
			false, false, false,
			false, false, false
	};
	public String[] items;
	public boolean done = false;
	public JFrame frame = new JFrame();
	public JButton button1;
	public JButton button2;
	public JButton button3;
	public JButton button4;
	public JButton button5;
	public JButton button6;
	public JButton button7;
	public JButton button8;
	public JButton button9;
	public JButton finished = new JButton("You have won incase you didn't notice.");
    public JPanel panel = new JPanel();
	
	public void main() throws InterruptedException {
		this.finished.setBounds(0, 150, 300, 100);
		this.button1 = new JButton(this.items[0]);
		this.button1.addActionListener(new ActionListener() {	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				activated[0]=true;
		        button1.setForeground(Color.RED);
				System.out.print(0);
			}          
	      });
		this.button2 = new JButton(this.items[1]);
		this.button2.addActionListener(new ActionListener() {	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				activated[1]=true;
		        button2.setForeground(Color.RED);
				System.out.print(1);
			}          
	      });
		this.button3 = new JButton(this.items[2]);
		this.button3.addActionListener(new ActionListener() {	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				activated[2]=true;
		        button3.setForeground(Color.RED);
				System.out.print(2);
			}          
	      });
		this.button4 = new JButton(this.items[3]);
		this.button4.addActionListener(new ActionListener() {	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				activated[3]=true;
		        button4.setForeground(Color.RED);
				System.out.print(3);
			}          
	      });
		this.button5 = new JButton(this.items[4]);
		this.button5.addActionListener(new ActionListener() {	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				activated[4]=true;
		        button5.setForeground(Color.RED);
				System.out.print(4);
			}          
	      });
		this.button6 = new JButton(this.items[5]);
		this.button6.addActionListener(new ActionListener() {	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				activated[5]=true;
		        button6.setForeground(Color.RED);
				System.out.print(5);
			}          
	      });
		this.button7 = new JButton(this.items[6]);
		this.button7.addActionListener(new ActionListener() {	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				activated[6]=true;
		        button7.setForeground(Color.RED);
				System.out.print(6);
			}          
	      });
		this.button8 = new JButton(this.items[7]);
		this.button8.addActionListener(new ActionListener() {	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				activated[7]=true;
		        button8.setForeground(Color.RED);
				System.out.print(7);
			}          
	      });
		this.button9 = new JButton(this.items[8]);
		this.button9.addActionListener(new ActionListener() {	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				activated[8]=true;
		        button9.setForeground(Color.RED);
				System.out.print(8);
			}          
	      });
		boolean done = false;
		while (true) {
			this.render();
			TimeUnit.MILLISECONDS.sleep(100);
		}
	}
	
	public boolean checkActivated() {
		for(boolean a:this.activated) {
			if(a==false) {
				return false;
			}
		}
		return true;
	}
	
	public void init(String[] Items) {
		this.items = Items;
		this.frame.setName("WAN Show Bingo");
		this.frame.setLayout(new GridLayout(1, 10));
	}
	
	public void render() {
		this.frame.getContentPane().removeAll();
		this.frame.setName("WAN Show Bingo");	    
		if(checkActivated()) {
		    this.panel.add(finished);
		    if (!this.done) {
		    	JOptionPane.showMessageDialog(this.frame, "You Win!!");
		    	this.done = true;
		    }
		} else {
			this.panel.add(button1);
		    this.panel.add(button2);
		    this.panel.add(button3);
		    this.panel.add(button4);
		    this.panel.add(button5);
		    this.panel.add(button6);
		    this.panel.add(button7);
		    this.panel.add(button8);
		    this.panel.add(button9);
		}
	    this.frame.getContentPane().add(panel);
		this.frame.setBounds(100, 100, 300, 400);
		this.frame.setAlwaysOnTop(true);
		this.frame.setVisible(true);
		this.frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		this.frame.setName("WAN Show Bingo");	
	}
	
	public void activateButton1(){
		activated[0]=true;
	}
	
	public void activateButton2(){
		activated[1]=true;
	}
	
	public void activateButton3(){
		activated[2]=true;
	}
	
	public void activateButton4(){
		activated[3]=true;
	}
	
	public void activateButton5(){
		activated[4]=true;
	}
	
	public void activateButton6(){
		activated[5]=true;
	}
	
	public void activateButton7(){
		activated[6]=true;
	}
	
	public void activateButton8(){
		activated[7]=true;
	}
	
	public void activateButton9(){
		activated[8]=true;
	}
}