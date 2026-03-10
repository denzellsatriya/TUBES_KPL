import java.util.Scanner;
import java.util.Random;

public class TUBES {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int angkaRahasia = random.nextInt(100) + 1;
        int tebakan = 0;
        int jumlahPercobaan = 0;

        System.out.println("=== GAME TEBAK ANGKA ===");
        System.out.println("Tebak angka dari 1 sampai 100");

        while (tebakan != angkaRahasia) {
            System.out.print("Masukkan tebakanmu: ");
            tebakan = input.nextInt();
            jumlahPercobaan++;

            if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar!");
            } else if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil!");
            } else {
                System.out.println("Selamat! Tebakanmu benar!");
                System.out.println("Jumlah percobaan: " + jumlahPercobaan);
            }
        }

        input.close();
    }
}