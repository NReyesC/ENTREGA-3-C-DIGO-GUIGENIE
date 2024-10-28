import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Estudiantes extends JPanel {
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
    private JButton jcomp12;
    private JButton jcomp13;
    private JButton jcomp14;

    public Estudiantes() {
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
        jcomp12 = new JButton("Materias");
        jcomp13 = new JButton("Profesores");
        jcomp14 = new JButton("Monitorias");

        // Adjust size and set layout
        setPreferredSize(new Dimension(839, 562));
        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(jcomp1)
                .addComponent(jcomp2)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jcomp3)
                        .addComponent(jcomp4)
                        .addComponent(jcomp5)
                        .addComponent(jcomp6)
                        .addComponent(jcomp7)
                        .addComponent(jcomp8)
                        .addComponent(jcomp9)
                        .addComponent(jcomp10)
                        .addComponent(jcomp11)
                        .addComponent(jcomp12)
                        .addComponent(jcomp13)
                        .addComponent(jcomp14))
                )
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(jcomp1)
                .addComponent(jcomp2)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(jcomp3)
                .addComponent(jcomp4)
                .addComponent(jcomp5)
                .addComponent(jcomp6)
                .addComponent(jcomp7)
                .addComponent(jcomp8)
                .addComponent(jcomp9)
                .addComponent(jcomp10)
                .addComponent(jcomp11)
                .addComponent(jcomp12)
                .addComponent(jcomp13)
                .addComponent(jcomp14)
        );
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Estudiantes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Estudiantes());
        frame.pack();
        frame.setVisible(true);
    }
}