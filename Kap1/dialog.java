import javax.swing.*;

public class dialog{
    public static void main(String[] arg) {
      JOptionPane.showMessageDialog(null, "Du k\u00f6r operativsystemet \n"  + System.getProperty("os.name") + " idag.");
    }
}
