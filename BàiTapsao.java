import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class BàiTapsao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine(); 

        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap nam sinh (dd/MM/yyyy): ");
        Date birthDate = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); 

        try {
            birthDate = dateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Dinh dang ngay sinh khong hop le. Vui long nhap lai theo dinh dang dd/MM/yyyy.");
            scanner.close();
            return;
        }

        System.out.println("Nhap gioi tinh (Nam/Nu): ");
        String gender = scanner.nextLine();

        System.out.println("Nhap chuyen nganh: ");
        String major = scanner.nextLine();

        System.out.println("Nhap GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhap que quan: ");
        String hometown = scanner.nextLine();

        System.out.println("\nThong tin sinh vien:");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Ngay sinh: " + dateFormat.format(birthDate));
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Chuyen nganh: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Que quan: " + hometown);

        scanner.close();
    }
}
