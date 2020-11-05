import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program Rata-Rata Nilai
 * berbasis OOP
 *
 */

public class RataRataNilai {
    public int jumlahMahasiswa;
    public double totalNilai, nilaiRataRata;
    public double[] nilaiMahasiswa;

    public void inputMahasiswa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahMahasiswa = scanner.nextInt();
    }

    public void inputNilai(){
        totalNilai = 0;
        nilaiMahasiswa = new double[jumlahMahasiswa];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilaiMahasiswa[i] = scanner.nextInt();
            totalNilai += nilaiMahasiswa[i];
        }
    }

    public void nilaiRata(){
        nilaiRataRata = totalNilai/jumlahMahasiswa;
    }

    public static void main(String[] args) {
        RataRataNilai nilai = new RataRataNilai();
        nilai.inputMahasiswa();
        nilai.inputNilai();
        nilai.nilaiRata();

        System.out.print("\n");
        System.out.println("Maka, Rata-rata Nilainya adalah "+ nilai.nilaiRataRata);
        System.out.println("Developed by: Arsy Opraza Akma");
    }
}
