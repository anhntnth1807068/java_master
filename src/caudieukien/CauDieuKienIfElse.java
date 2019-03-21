package caudieukien;

import java.util.Scanner;

public class CauDieuKienIfElse {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("vui long nhap du lieu tu ban phim:");
        int a =scanner.nextInt();
        if (a>4){
            System.out.println("gia tri a>4");
        }else {
            if (a==4){
                System.out.println("gia tri cua a=4");
            }else {
                System.out.println("gia tri cua a<4");
            }
        }
    }


}
