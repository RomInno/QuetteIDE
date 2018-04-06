package fr.wildcodeschool.idetest;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

import static java.lang.ProcessHandle.current;

public class Start {
    public static void main(String... args) throws IOException {
        System.out.println(current().pid());

        JFrame jf = new JFrame("Gotcha!");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.add(new JLabel(new ImageIcon(new URL("https://wildcodeschool.fr/wp-content/uploads/2017/01/deer.png"))));
        jf.pack();
        jf.setVisible(true);
    }
}

