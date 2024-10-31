import java.util.Scanner;

public class Bài3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen:");
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            System.out.println("Ban da nhap so nguyen: " + input);
        } else {
            System.out.println("Du lieu nhap vao khong phai la so nguyen.");
        }
        scanner.close();
    }
}