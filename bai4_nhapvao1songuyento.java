import java.util.Scanner;

public class bai4_nhapvao1songuyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = sc.nextInt();

        boolean laSoNguyenTo = true;

        if (n < 2) {
            laSoNguyenTo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
        }

        if (laSoNguyenTo) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }
    }
}
