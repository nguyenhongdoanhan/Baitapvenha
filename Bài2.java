import java.util.Scanner;

public class Bài2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi:");
        if (scanner.hasNext()) {
            String input = scanner.next();  // Lay du lieu tu ban phim
            System.out.println("Ban da nhap chuoi: " + input);
        } else {
            System.out.println("Du lieu nhap vao khong phai la chuoi.");
        }
        scanner.close();
    }
}
