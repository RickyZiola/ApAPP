package ApAPP;

import java.awt.*;
import javax.swing.*;

public class ApAPP {
  ApAPP() {
    JFrame f = new JFrame("ApAPP");
    f.pack();
    f.setVisible(true);
  }
  public static void main () {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        ApAPP app = new ApAPP();
      }
    });
  }
}
