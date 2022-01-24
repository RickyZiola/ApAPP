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
    BufferedReader fin = new BufferedReader(new FileInputStream("src/Updater.java"));
    String file = "";
    while(file != -1) {
      file = fin.readLine();
    }
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        ApAPP app = new ApAPP();
      }
    });
  }
}
