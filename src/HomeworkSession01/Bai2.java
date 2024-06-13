package HomeworkSession01;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double exchangeRate = 25442;
        System.out.println("Nhập số tiền USD cần chuyển đổi");
        double usd = scanner.nextDouble();
        double vnd = usd * exchangeRate;
        System.out.println(usd + " USD = " + vnd + " VNĐ");
    }
}

