//JOptionPane

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // JOptionPane: input method # 3
        String num1_jop = JOptionPane.showInputDialog("Enter num1: ");
        String num2_jop = JOptionPane.showInputDialog("Enter num2: ");


        // convert strings into integers
        int num1_val = Integer.parseInt(num1_jop); // cant use type casting here. type casting only works with (number to number) and NOT (string to number)
        int num2_val = Integer.parseInt(num2_jop);


        int sum_jop = num1_val + num2_val;
        int difference_jop = num1_val - num2_val;
        int product_jop = num1_val * num2_val;
        float quotient_jop = (float) num1_val / num2_val; // type casting integer into float
        float remainder_jop = (float) num1_val % num2_val; // type casting integer into float


        System.out.println();
        System.out.println("sum: " + sum_jop);
        System.out.println("difference: " + difference_jop);
        System.out.println("product: " + product_jop);
        System.out.println("quotient: " + quotient_jop);
        System.out.println("remainder: " + remainder_jop);
    }

}