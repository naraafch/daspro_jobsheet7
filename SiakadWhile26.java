import java.util.Scanner;

public class SiakadWhile26 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int nilai, jml=0, i=0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml= sc.nextInt();

        while (i<jml) {
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai= sc.nextInt();
            
            if (nilai<0 || nilai>100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }
            if (nilai>80 && nilai<=100) {
                System.out.println("-----------------------------------------");
                System.out.println("Nilai Mahasiswa ke-" +(i+1)+ " adalah A");
                System.out.println("Bagus, pertahankan nilainya");
                System.out.println("-----------------------------------------");
            } else if (nilai>73 && nilai<=80) {
                System.out.println("-----------------------------------------");
                System.out.println("Nilai Mahasiswa ke-" +(i+1)+ " adalah B+");
                System.out.println("-----------------------------------------");
            } else if (nilai>65 && nilai<=73) {
                System.out.println("-----------------------------------------");
                System.out.println("Nilai Mahasiswa ke-" +(i+1)+ " adalah B+");
                System.out.println("-----------------------------------------");
            } else if (nilai>60 && nilai<=65) {
                System.out.println("-----------------------------------------");
                System.out.println("Nilai Mahasiswa ke-" +(i+1)+ " adalah C+");
                System.out.println("-----------------------------------------");
            } else if (nilai>50 && nilai<=60) {
                System.out.println("-----------------------------------------");
                System.out.println("Nilai Mahasiswa ke-" +(i+1)+ " adalah C");
                System.out.println("-----------------------------------------");
            } else if (nilai>39 && nilai<=50) {
                System.out.println("-----------------------------------------");
                System.out.println("Nilai Mahasiswa ke-" +(i+1)+ " adalah D");
                System.out.println("-----------------------------------------");
            } else {
                System.out.println("-----------------------------------------");
                System.out.println("Nilai Mahasiswa ke-" +(i+1)+ " adalah E");
                System.out.println("-----------------------------------------");
            }
            i++;
        }
    }
    
}
