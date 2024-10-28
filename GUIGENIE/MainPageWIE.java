import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class MainPageWIE extends JPanel {
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JButton jcomp3;
    private JButton jcomp4;
    private JButton jcomp5;
    private JButton jcomp6;
    private JButton jcomp7;
    private JButton jcomp8;
    private JButton jcomp9;
    private JButton jcomp10;
    private JButton jcomp11;

    public MainPageWIE() {
        // Construct components
        jcomp1 = new JLabel("WHERE IN EAFIT");
        jcomp2 = new JLabel("Bienvenido a WHERE IN EAFIT para ESTUDIANTES");
        jcomp3 = new JButton("Zonas de Descanso");
        jcomp4 = new JButton("Bloques");
        jcomp5 = new JButton("Zonas de Estudio");
        jcomp6 = new JButton("Otros puntos de interés");
        jcomp7 = new JButton("Entradas Vehiculares");
        jcomp8 = new JButton("Entradas Peatonales");
        jcomp9 = new JButton("Máquinas Expendedoras");
        jcomp10 = new JButton("Pago de Parqueaderos");
        jcomp11 = new JButton("Restaurantes");

        // Adjust size and set layout
        setPreferredSize(new Dimension(839, 562));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Add components with constraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(jcomp1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(jcomp2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(jcomp3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(jcomp4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(jcomp5, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(jcomp6, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        add(jcomp7, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        add(jcomp8, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        add(jcomp9, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        add(jcomp10, gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        add(jcomp11, gbc);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainPageWIE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MainPageWIE());
        frame.pack();
        frame.setVisible(true);
    }
}
