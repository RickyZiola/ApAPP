package ApAPP;

import java.awt.*;
import javax.swing.*;
import java.io.*;

public class ApAPP {
  ApAPP() {
    JFrame f = new JFrame("ApAPP");
    JLabel greeting = new JLabel("Hello world!");
    f.getContentPane().add(greeting);
    f.pack();
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main () {
    BufferedReader fin = new BufferedReader(new FileReader("src/Updater.java"));
    int file = 0;
    while(file != -1) {
      file = fin.read();
      System.out.print(file);
    }
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        ApAPP app = new ApAPP();
      }
    });
  }
}
