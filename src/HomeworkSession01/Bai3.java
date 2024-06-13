package HomeworkSession01;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị cạnh hình vuông");
        int x = sc.nextInt();
        System.out.println("Chu vi hinhf vuông là:" +x*4);
        System.out.println("Diện tích hình vuông là:"+x*x);
    }
}
