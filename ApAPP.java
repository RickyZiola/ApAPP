import java.awt.*;
import javax.swing.*;

class ApAPP {
  ApAPP() {
    JFrame f = new JFrame("ApAPP");
  }
  public static void main (String[] args) {
    swingUtilities.invokeLater(new Runnable() {
      ApAPP app = new ApAPP();
    });
  }
}
