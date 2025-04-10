import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class javaAplication {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);

        JButton jb = new JButton("Enviar");
        JLabel jl = new JLabel("Titulo");



        frame.add(jb, BorderLayout.SOUTH);
        frame.add(jl, BorderLayout.SOUTH);

        frame.setVisible(true);


    }
}