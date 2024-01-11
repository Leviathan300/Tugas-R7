package produck.inventory;

public class tesBus {
    public static void main(String[] args) {
        Main busMini = new Main(10);
        busMini.addPenumpang(5);
        busMini.addPenumpang(6);
        busMini.getPenumpang(2);
        busMini.getPenumpang(1);
        busMini.cetak();
        
        busMini.getAverage();
        busMini.cetak();
    }
}
