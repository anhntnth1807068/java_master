package caudieukien;

import java.util.Scanner;

public class CauDieuKienSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui long nhap du lieu tu ban phim:");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("a=1");
                break;
            case 2:
                System.out.println("a=2");
                break;
            case 3:
                System.out.println("a=3");
                break;
            default:
                System.out.println("gia ti bang default");
                break;
        }
    }
}

