package ra;

public class OutputDemo {
    public static void main(String[] args) {
//        1.in chuỗi và xuống dòng
        System.out.println("Hello World");
//        2. IN CHUỖI và không xuống dòng(con trỏ nămgf ở cuối dòng)
        System.out.print("Hello World 123");
//        3. System.out.printf(Control String, value1,value2....)
        String studentName="Phương Thu";
        int age=26;
        float md1Mark=4.9F;
//        in ra thông tin sinh vien vơis 1 câu
        System.out.printf("\nSinh viên %s với tuổi %d\t có điểm Module 01 là :%.2f",studentName,age,md1Mark);
//        \n: xuống dòng
//        \t: lùi vào 1 tab
//        4. System.err.println("String"):in nội dung lỗi
        System.err.println("đã xảu ra lỗi");
    }
}
