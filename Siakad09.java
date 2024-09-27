import java.util.Scanner;
public class Siakad09 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double NilaiKuis, NilaiTugas, NilaiUjian, NilaiAkhir;

        System.out.println("Masukkan nama:");
        nama = sc.nextLine();
        System.out.println("Masukkan nim:");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas:");
        kelas = sc.nextLine(). charAt(0);
        System.out.println("Masukkan nomor absen:");
        absen = sc.nextByte();
        System.out.println("Masukkan nilai kuis:");
        NilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai Tugas:");
        NilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian:");
        NilaiUjian = sc.nextDouble();

        NilaiAkhir = (NilaiKuis + NilaiTugas + NilaiUjian)/3;

        System.out.println("Nama:" + nama + "nim:" + nim);
        System.out.println("kelas:" + kelas + "absen:" + absen);
        System.out.println("Nilai akhir:" + NilaiAkhir);
    }
}