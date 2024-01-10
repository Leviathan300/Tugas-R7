import java.util.Scanner;

public class sekolah {
    Scanner scan = new Scanner(System.in);
    public void tampilNama (String nama){
        System.out.println("Saya bersekolah di "+nama);

}

public void jumlahSiswa(int rombel, int jumlahSiswa){
    int total= rombel * jumlahSiswa;
    System.out.println("jumlah siswa: " + total);
}


}
