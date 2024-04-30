package markah;
import java.util.Scanner;
public class Markah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] markah = new double[5];
        double hasil = 0;

        System.out.print("Peperiksaan / ujian kali ke (1/2/3): ");
        int peperiksaan = input.nextInt();
        
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ": ");
            markah[i] = input.nextDouble();
            hasil += markah[i];
        }

        System.out.println("5 Markah yang dimasukkan ialah:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + markah[i]);
        }

        System.out.println("Jumlah markah: " + hasil);

        double purata = hasil / 5;
        System.out.println("Purata: " + purata);

        int cemerlang = 0;
        for (int i = 0; i < 5; i++) {
            if (markah[i] > purata) {
                cemerlang++;
            }
        }
        System.out.println("Bilangan markah melebihi purata: " + cemerlang);
    }
}
