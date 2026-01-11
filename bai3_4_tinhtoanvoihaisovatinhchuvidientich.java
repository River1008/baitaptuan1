package tuan1lthdt;

import java.util.Scanner;

public class bai3_4_tinhtoanvoihaisovatinhchuvidientich {
    public static void main(String[]args) {
        Scanner tinhab = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat");
        int a = tinhab.nextInt();
        System.out.println("Nhap vap so thu hai");
        int b = tinhab.nextInt();
        int tong = a + b;
        System.out.println("tong bang " + tong);
        int tich = a * b;
        System.out.println("tich bang " + tich);
        int hieu = a - b;
        System.out.println("hieu bang " + hieu);
        if (b != 0) {
            int thuong = a / b;
            System.out.println("thuong bang " + thuong);
        }
        else System.out.println("Khong the chia cho 0");
       int chuvi = (a + b)*2;
       System.out.println("chu vi bang " + chuvi);
       System.out.println("dien tich bang " + tich);
    }
}