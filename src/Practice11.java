/*
Có 2 số là num1 và num2 do người dùng nhập vào để tính,
các phép tính +, -, *, /
cũng do người dùng nhập vào để thực hiện phép tính mà họ muốn.
 */

import java.util.Scanner;

public class Practice11 {
    public static double sum(double a, double b){
        return a+b;
    }

    public static double subtract(double a, double b){
        return a-b;
    }

    public static double multiply(double a, double b){
        return a*b;
    }

    public static void divide(double a, double b){
        try{
            double result = a/b;
            System.out.println("Division: "+result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 2 so muon tinh: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Nhap vao phep tinh muon tinh: ");
        String input = scanner.next();
        while (true) {
            boolean flag = false;
            switch (input) {
                case "+":
                    System.out.println("Sum of " + a + ", " + b + " :" + sum(a, b));
                    flag = true;
                    break;
                case "-":
                    System.out.println("Subtract of " + a + ", " + b + " :" + subtract(a, b));
                    flag = true;
                    break;
                case "*":
                    System.out.println("Multiple of " + a + ", " + b + " :" + multiply(a, b));
                    flag = true;
                    break;
                case "/":
                    divide(a, b);
                    flag = true;
                    break;
                default:
                    System.out.println("Moi ban nhap lai 1 trong 4 phep tinh '+, -, *, /' : ");
                    input = scanner.next();
            }
            if (flag){
                break;
            }
        }
    }
}
