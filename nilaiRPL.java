import java.util.Scanner;

public class nilaiRPL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Rekap Nilai siswa RPL");
        System.out.print("Masukkan jumlah siswa yang akan dihitung nilainya: ");
        int jumlahSiswa = input.nextInt();
        double totalNilai = 0;
        System.out.println("\n--- Input Nilai ---");
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai ujian siswa ke-" + i + " (0-100): ");
            if (input.hasNextDouble()) {
                double nilai = input.nextDouble();
                totalNilai += nilai;
            }
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("Hasil Rekap nilai siswa RPL:");
        System.out.println("Jumlah Siswa: " + jumlahSiswa);
        System.out.printf("Total Nilai Keseluruhan: %.2f\n", totalNilai);
        System.out.printf("Nilai **Rata-Rata** Kelas: **%.2f**\n", rataRata);
        input.close();
    }
}