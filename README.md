# ENTREGA-3
ENTREGA 3
Código del Gui genie
#MAIN PAGE
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MAINPAGE extends JPanel {
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JTextField jcomp3;
    private JButton jcomp4;

    public MAINPAGE() {
        //construct components
        jcomp1 = new JLabel ("WHERE IN EAFIT");
        jcomp2 = new JLabel ("Ingrese su correo electrónico");
        jcomp3 = new JTextField (5);
        jcomp4 = new JButton ("Enviar");

        //adjust size and set layout
        setPreferredSize (new Dimension (839, 562));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (370, 40, 100, 25);
        jcomp2.setBounds (335, 70, 190, 35);
        jcomp3.setBounds (370, 110, 100, 25);
        jcomp4.setBounds (370, 145, 100, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MAINPAGE");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MAINPAGE());
        frame.pack();
        frame.setVisible (true);
    }
}

#VISITANTES

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

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
        //construct components
        jcomp1 = new JLabel ("WHERE IN EAFIT");
        jcomp2 = new JLabel ("Bienvenido a WHERE IN EAFIT para ESTUDIANTES");
        jcomp3 = new JButton ("Zonas de Descanso");
        jcomp4 = new JButton ("Bloques");
        jcomp5 = new JButton ("Zonas de Estudio");
        jcomp6 = new JButton ("Otros puntos de interés");
        jcomp7 = new JButton ("Entradas Vehiculares");
        jcomp8 = new JButton ("Entradas Peatonales");
        jcomp9 = new JButton ("Máquinas Expendedoras");
        jcomp10 = new JButton ("Pago de Parqueaderos");
        jcomp11 = new JButton ("Restaurantes");

        //adjust size and set layout
        setPreferredSize (new Dimension (839, 562));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (370, 40, 100, 25);
        jcomp2.setBounds (270, 60, 325, 70);
        jcomp3.setBounds (340, 190, 155, 30);
        jcomp4.setBounds (95, 195, 100, 25);
        jcomp5.setBounds (560, 315, 180, 40);
        jcomp6.setBounds (90, 420, 195, 40);
        jcomp7.setBounds (345, 435, 160, 35);
        jcomp8.setBounds (575, 440, 165, 35);
        jcomp9.setBounds (320, 315, 195, 35);
        jcomp10.setBounds (80, 305, 175, 40);
        jcomp11.setBounds (585, 190, 145, 30);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MainPageWIE");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MainPageWIE());
        frame.pack();
        frame.setVisible (true);
    }
}
#ESTUDIANTES

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ESTUDIANTES extends JPanel {
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

    public ESTUDIANTES() {
        //construct components
        jcomp1 = new JLabel ("WHERE IN EAFIT");
        jcomp2 = new JLabel ("Bienvenido a WHERE IN EAFIT para ESTUDIANTES");
        jcomp3 = new JButton ("Zonas de Descanso");
        jcomp4 = new JButton ("Bloques");
        jcomp5 = new JButton ("Zonas de Estudio");
        jcomp6 = new JButton ("Otros puntos de interés");
        jcomp7 = new JButton ("Entradas Vehiculares");
        jcomp8 = new JButton ("Entradas Peatonales");
        jcomp9 = new JButton ("Máquinas Expendedoras");
        jcomp10 = new JButton ("Pago de Parqueaderos");
        jcomp11 = new JButton ("Restaurantes");
        jcomp12 = new JButton ("Materias");
        jcomp13 = new JButton ("Profesores");
        jcomp14 = new JButton ("Monitorias");

        //adjust size and set layout
        setPreferredSize (new Dimension (839, 562));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp12);
        add (jcomp13);
        add (jcomp14);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (370, 40, 100, 25);
        jcomp2.setBounds (270, 60, 325, 70);
        jcomp3.setBounds (235, 190, 155, 30);
        jcomp4.setBounds (95, 195, 100, 25);
        jcomp5.setBounds (585, 315, 180, 40);
        jcomp6.setBounds (15, 425, 195, 40);
        jcomp7.setBounds (225, 430, 160, 35);
        jcomp8.setBounds (415, 435, 165, 35);
        jcomp9.setBounds (375, 315, 195, 35);
        jcomp10.setBounds (185, 310, 175, 40);
        jcomp11.setBounds (585, 190, 145, 30);
        jcomp12.setBounds (450, 195, 100, 25);
        jcomp13.setBounds (55, 320, 100, 25);
        jcomp14.setBounds (635, 440, 100, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("ESTUDIANTES");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new ESTUDIANTES());
        frame.pack();
        frame.setVisible (true);
    }
}
