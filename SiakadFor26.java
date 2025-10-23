import java.util.Scanner;

public class SiakadFor26 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        double nilai, tertinggi=0, terendah=100;
        int mhs=10, lulus=0, tidakLulus=0, i=1;

        while (i<=mhs) {
            System.out.print("Masukkan nilai mahasiswa ke " +i+ "   : ");
            nilai= sc.nextDouble();
            if (nilai>tertinggi) {
                tertinggi= nilai;
            }
            if (nilai<terendah) {
                terendah= nilai;
            }
            if (nilai>=60){
                lulus++;
            } else {
                tidakLulus++;
            }
            i++;
        }
        System.out.println("\nNilai tertinggi : " +tertinggi);
        System.out.println("Nilai terendah  : " +terendah);
        System.out.println("\nJumlah mahasiswa lulus        : " +lulus);
        System.out.println("Jumlah mahasiswa tidak lulus  : " +tidakLulus);

    }
}