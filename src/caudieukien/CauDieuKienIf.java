package caudieukien;

        import java.util.Scanner;

public class CauDieuKienIf {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("vu long nhap du lieu vao ban phim :");
        int a = scanner.nextInt();
        if (a>5){
            System.out.println("a lon hon 5");
        }
        if (a==5){
            System.out.println("a bang 5");

        }
        if (a<5 ){
            System.out.println("a nho hun 5");
        }
    }
}
