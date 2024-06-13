package HomeworkSession01;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm môn Toán");
        float math = sc.nextFloat();
        System.out.println("Điểm môn Toán là:" +math);
        System.out.println("Nhập điểm môn Anh");
        float english = sc.nextFloat();
        System.out.println("Nhập điểm môn Hóa");
        float chemistry = sc.nextFloat();
        float trungBinhCong = (math + english + chemistry) / 3;
//        System.out.println("Trung bình công 3 môn:" + trungBinhCong);
        System.out.printf("Trung binh cộng là %.2f", trungBinhCong);

    }
}
