public class tampil {

public static void main(String[] args) {
    rumah r = new rumah();
    sekolah s= new sekolah();
        System.out.println("DATA RUMAH");
        r.tampillokasi();
        r.tampilUkuran(10, 17);
        System.out.println("DATA SEKOLAH");
        s.tampilNama("SMK Telkom Sandhy Putra Malang");
        s.jumlahSiswa(36, 13);
}
}