//# proyecto1
import javax.swing.*;
import java.awt.*;

class ventana extends JFrame{
 JLabel user = new JLabel("User: ");
 JTextField userText = new JTextField(15);
 JLabel pass = new JLabel("Password: ");
 JPasswordField passField = new JPasswordField(15);
 JButton cancel = new JButton("Cancel");
 JButton ok = new JButton("Ok");

ventana(){
this.setLayout(new FlowLayout());
	add(user);
	add(userText);
	add(pass);
	add(passField);
	add(cancel);
	add(ok);
setVisible(true);
setSize(300,300);
setTitle("Ventana del Proyecto 1");
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String ar[]){
new ventana();
}
}
