import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MAINPAGE extends JPanel {
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JTextField jcomp3;
    private JButton jcomp4;

    public MAINPAGE() {
        //construct components
        jcomp1 = new JLabel("WHERE IN EAFIT");
        jcomp2 = new JLabel("Ingrese su correo electrónico");
        jcomp3 = new JTextField(5);
        jcomp4 = new JButton("Enviar");

        //adjust size and set layout
        setPreferredSize(new Dimension(839, 562));
        setLayout(null);

        //add components
        add(jcomp1);
        add(jcomp2);
        add(jcomp3);
        add(jcomp4);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds(370, 40, 100, 25);
        jcomp2.setBounds(335, 70, 190, 35);
        jcomp3.setBounds(370, 110, 100, 25);
        jcomp4.setBounds(370, 145, 100, 25);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MAINPAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MAINPAGE());
        frame.pack();
        frame.setVisible(true);
    }
}