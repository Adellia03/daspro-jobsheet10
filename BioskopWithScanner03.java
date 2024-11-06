import java.util.Scanner;

public class BioskopWithScanner03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, next;
        int baris, kolom;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris - 1][kolom - 1] == null){
                        penonton[baris - 1][kolom - 1] = nama;
                        break;
                    } else {
                        System.out.println("Kursi sudah terisi! Silahkan pilih kursi lain");
                    }
                } else {
                        System.out.println("Baris atau kolom tidak valid!");
                    }
                

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }
            else if (pilihan == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print((penonton[i][j] != null ? penonton[i][j] : "***") + "\t");
                    }
                    System.out.println();
                }
            }
            else if (pilihan == 3) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }
            else{
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
        }
    }
    