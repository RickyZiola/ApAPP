import java.awt.*;
import javax.swing.*;

class ApAPP {
  ApAPP() {
    JFrame f = new JFrame("ApAPP");
  }
  public static void main (String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        ApAPP app = new ApAPP();
      }
    });
  }
}
