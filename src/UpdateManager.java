import javax.swing.*;
import java.net.*;
import java.awt.*;
import java.io.*;

import ApAPP.ApAPP;

public class UpdateManager {
  public static void main(String[] args) throws MalformedURLException {
    try {
      Desktop.getDesktop().browse(new URI("http://google.com"));
    }catch(Exception ex){
      System.out.println("Failed!" + ex);
    }
    URL url = new URL(
        "https://lh3.googleusercontent.com/a-/AOh14GgVdKz7GobE2FV7_dnjUarhmQhVcGqvdpBfr0nPFA=s288-p-rw-no");
    ImageIcon icon = new ImageIcon(url);
    JButton updateNotifier = new JButton("<html><center>Checking for<br>updates...</center></html>", icon);
    updateNotifier.setHorizontalTextPosition(JButton.CENTER);
    updateNotifier.setVerticalTextPosition(JButton.TOP);
    updateNotifier.setFont(new Font("roboto", Font.PLAIN, 20));
    JFrame f = new JFrame("ApAPP update manager");
    f.getContentPane().add(updateNotifier);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().setBackground(Color.white);
    f.pack();
    f.setLocationRelativeTo(null);
    f.setVisible(true);
    try {
      Runtime rt = Runtime.getRuntime();
      if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
        String[] commands = { "rm", "-r", "-rf", "ApAPP" };
        updateNotifier.setText("Removing current\n directory");
        for (int i = 0; i < commands.length; i++) {
          System.out.print(commands[i] + " ");
        }
        Process proc = rt.exec(commands);
      } else {
        String[] commands2 = { "rmdir", "/Q", "/S", "ApAPP" };
        System.out.print("Running command: ");
        for (int i = 0; i < commands2.length; i++) {
          System.out.print(commands2[i] + " ");
        }
        Process proc2 = rt.exec(commands2);
      }
      updateNotifier.setText("Downloading new code");
      String[] commands3 = { "git", "clone", "https://github.com/RickyZiola/ApAPP.git" };
      Process proc3 = rt.exec(commands3);
      System.out.print("Running command: ");
      for (int i = 0; i < commands3.length; i++) {
        System.out.print(commands3[i] + " ");
      }
      System.out.println();
      BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc3.getInputStream()));

      BufferedReader stdError = new BufferedReader(new InputStreamReader(proc3.getErrorStream()));
      String s = null;
      for (int i = 0; i < 10; i++) {
        s = stdError.readLine();
        if (s != null) {
          System.out.println(s);
        }
        s = stdInput.readLine();
        if (s != null) {
          System.out.println(s);
        }
      }

      updateNotifier.setText("Packaging main file");
      String[] packager = { "javac", "ApAPP/ApAPP.java" };
      Process process = rt.exec(packager);
    } catch (Exception ex) {
    }
    f.dispose();
    try {
      ApAPP.main();
    } catch (Exception ex) {

    }
  }
}
