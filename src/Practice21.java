/*
        Viết chương trình cho phép nhập vào một số nguyên dương n,
         tính tổng tất cả số chẵn trong khoảng từ 0 - n.
         */

import java.util.Scanner;

public class Practice21 {
    public static int tongChan(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen duong n: ");
        int n = scanner.nextInt();
        System.out.println("Tong tat ca cac so chan trong khoang 0 ~ " + n +" la: "+tongChan(n));
    }
}
