import javax.swing.*;

public class myinfo{
  public static void main (String[] arg) {
      JOptionPane.showMessageDialog(null, "Hello my name is "  + System.getProperty("user.name") +
      "\n I live in Sweden. " + "\n My phone number is 123124124");
  }
}
