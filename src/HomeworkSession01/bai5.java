package HomeworkSession01;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị bán kính");
        float banKinh = sc.nextFloat();
        System.out.println("Ban kính là:" + banKinh);
        final float PI = 3.14f;
        System.out.println("Chu vi hình tròn là:" + banKinh * 2 * PI);
        System.out.println("Diên tích hình tròn là:" + banKinh * banKinh * PI);
    }
}
