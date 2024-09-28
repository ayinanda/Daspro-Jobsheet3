import java.util.Scanner;

public class UpahKaryawan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jumlahJamKerja, upahPerJam, gajiTotal, bonus, totalGajiSebelumPajak, pajak, gajiBersih;
        
        System.out.println("Masukkan jumlah jam kerja per bulan: ");
        jumlahJamKerja = sc.nextDouble();
        System.out.println("Masukkan upah per jam: ");
        upahPerJam = sc.nextDouble();

        gajiTotal = jumlahJamKerja*upahPerJam;
        bonus = gajiTotal*0.10;
        totalGajiSebelumPajak = gajiTotal + bonus;
        pajak = totalGajiSebelumPajak*0.5 ;
        gajiBersih = totalGajiSebelumPajak - pajak;

        
    }
}