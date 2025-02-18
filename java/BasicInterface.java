import javax.swing.JOptionPane;

public class BasicInterface {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("What Is Your Name");
        JOptionPane.showMessageDialog(null,"Hello IM :"+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("What Is Your Age"));
        JOptionPane.showMessageDialog(null,"I Am :"+age+"Years Old");
        double height=Double.parseDouble(JOptionPane.showInputDialog("What Is Your Height"));
        JOptionPane.showMessageDialog(null,"Your Height Is :"+height+"feet");
    }
}
