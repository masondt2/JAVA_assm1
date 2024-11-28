import java.util.Scanner;

public class dienTichHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sumS = 0, maxS=0, avgS;
        for (int i = 1; i <= n; i++) {
            double l = sc.nextDouble();
            double r = sc.nextDouble();
            sc.close();
            double s = l*r;
            sumS += s;
            maxS = Math.max(maxS, s);
        }
        avgS = sumS/n;
        System.out.printf("%.3f\n",avgS);
        System.out.printf("%.3f\n",maxS);
    }
}
