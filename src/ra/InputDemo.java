package ra;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        /*
        *1.Khai báo và khởi tạo đối tượng Scanner(java.util.Scaner)
        * 2.Thông báo nhập dữ liệu (sử dụng các câu lệnh ouput)
        * 3.Lấy dữ liệu n hập từ bàn phím(các phương thúc của Scanner:nextLine,...)
         */
//        1.Khởi tạo Scanner
        Scanner scanner = new Scanner(System.in);
//        2.Thông báo nhập
        System.out.println("Nhập vào đây mã sinh viên: ");
//        3.Lấy dữ liệu từ bàn phím
        String student=scanner.nextLine();
//        4.thông báo in ra
        System.out.println("Tên sinh viên:"+student);
//        Cách xóa enter
//        c1: scanner.nextLine();
//        c2: coi như lấy dưc liệ vào là chuỗi rồi chuyển sang kiêủ dữ liệu mong muốn
        /*
        *Stirng=> int: Integer.parseInt("Stirng");
         */
    }

}
