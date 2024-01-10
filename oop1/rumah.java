public class rumah{

public static void main(String[] args) {
    rumah r = new rumah();
    r.tampillokasi();
    r.tampilUkuran (10, 8);
}

public void tampilUkuran(int panjang, int lebar){
    int luas = panjang * lebar;
    System.out.println("luas= " + luas);
}

public void tampillokasi(){
    String alamat="Malang";
    System.out.println("Lokasi Rumah: "+alamat);
}
}
