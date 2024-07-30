import java.util.Scanner;
import javax.swing.JOptionPane;
class Main{
    public static void main(String[] args) {
        System.out.println("this is a test print");

        Scanner scanner=new Scanner(System.in);
        
        double a= scanner.nextDouble();
        scanner.nextLine();
        double b=scanner.nextDouble();
        scanner.close();
        JOptionPane.showMessageDialog(null,"third side is: ");
        System.out.println(Math.sqrt((a*a)+(b*b)));

        // DOUBTS:
        // 1) WHY IS THE JOptionPane.showMessageDialog not displaying ?
        // 1) WHY IS THE JOptionPane.showMessageDialog not displaying ?
    }
}
