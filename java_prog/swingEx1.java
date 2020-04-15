import javax.swing.*;
class swingEx1{
	public static void main(String ar[]){
		JFrame se=new JFrame("SUDHEER'S FIRST");
		JLabel l=new JLabel("Click First to Complete First");
		l.setBounds(400,300,200,50);
		se.add(l);
		JButton b=new JButton("FIRST");
		b.setBounds(450,500,100,50);
		se.add(b);
		se.setSize(1000,800);
		se.setLayout(null); 
		se.setVisible(true);
	}
}

