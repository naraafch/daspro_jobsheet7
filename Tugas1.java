import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int tiket, hargaTiket= 50000, totalTiket=0; 
        double diskon=0, totalHarga=0,totalHargaAkhir;
        String lanjut;

        do {
            System.out.print("Masukkan jumlah tiket: ");
            tiket= sc.nextInt();
            sc.nextLine();
            
           
            if (tiket <=0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang!");
                continue;
            }    
            
            totalTiket+=tiket;

            totalHarga=tiket*hargaTiket;               
            
            if (tiket>4) {
                diskon=0.1;
            } else if (tiket>10) {
                diskon=0.15;
            } else {
                diskon=0;
            }

            totalHargaAkhir=totalHarga-totalHarga*diskon;

            System.out.print("Apakah ingin membeli tiket lagi? (ya/tidak) : ");
            lanjut= sc.nextLine();

            if (lanjut.equalsIgnoreCase("tidak")) {
                System.out.println("===================================");
                System.out.println("Transaksi selesai");
                System.out.println("===================================");
                break;
            }

    } while (true);
    
    System.out.println("Total tiket terjual hari ini: " +totalTiket);
    System.out.println("Total penjualan hari ini: " +totalHargaAkhir);
    }
    
}
