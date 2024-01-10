import java.util.Scanner;

public class Tugas {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Tugas a = new Tugas();

        System.out.println("==Masukkan bangun yang mau dihitung==");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi panjang");
        String pilihan = scan1.nextLine();

        switch (pilihan) {
            case "1":
            case "Persegi":
            case "persegi":

            a.persegi();
                
                break;

            case "2":
            case "Persegi Panjang":
            case "persegi panjang":
            case "Persegipanjang":
            case "PersegiPanjang":

            a.persegipanjang();

            default:
            System.out.println("pilihan Invalid");
                break;
        }

    }
    public void persegi(){
        System.out.println("Masukkan panjang sisi: ");
        double sisi = scan.nextDouble();
        double luas = sisi * sisi;
        double keliling = sisi * 4;
        System.out.println("Luas persegi ini adalah: " + luas);
        System.out.println("Keliling persegi ini adalah: " + keliling);
    }
    public void persegipanjang(){
        System.out.println("Masukkan panjang: ");
        double panjang = scan.nextDouble();
        System.out.println("Masukkan lebar");
        double lebar = scan.nextDouble();
        scan.nextLine();
        double luaspp = panjang * lebar;
        double kelilingpp = ( panjang + lebar ) * 2;
        System.out.println("Luas persegi panjang ini adalah: " + luaspp);
        System.out.println("Keliling persegi panjang ini adalah: " + kelilingpp);
    }
}
