import java.awt.*;
import java.awt.*;

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
