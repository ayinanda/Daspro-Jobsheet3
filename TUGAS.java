import java.util.Scanner;
public class TUGAS {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifListrikPerKWH = 1500;
        double penggunaanListrik, totalTagihan;

        System.out.println("Masukkan jumlah penggunaan listrik:");
        penggunaanListrik = sc.nextInt();

        totalTagihan = penggunaanListrik*tarifListrikPerKWH;
        boolean lebihdari500 = penggunaanListrik > 500;

        System.out.println("Total tagihan Listrik adalah Rp" + totalTagihan);
        if (lebihdari500) {
            System.out.println("Penggunaan listrik anda melebihi 500 KWH");

            } else {
                System.out.println("Penggunaan listrik anda tidak melebihi 500 KWH"3);
            }
     } 
    
}
