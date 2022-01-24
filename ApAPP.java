package ApAPP;

import java.awt.*;
import javax.swing.*;

class ApAPP {
  ApAPP() {
    JFrame f = new JFrame("ApAPP");
  }
  public static void main () {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        ApAPP app = new ApAPP();
      }
    });
  }
}
