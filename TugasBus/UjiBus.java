package produck.inventory;

public class UjiBus {
    public static void main(String[] args) {
        // TODO code application logic here
        Bus1 busMini=new Bus1();
        Bus b = new Bus(0);
        busMini.penumpang=5;
        busMini.maxPenumpang=5;
        busMini.cetak();

        busMini.penumpang=busMini.penumpang+5;
        busMini.cetak();

        busMini.penumpang=busMini.penumpang-2;
        busMini.cetak();

        busMini.penumpang=busMini.penumpang+8;
        busMini.cetak();
        
    
    }

}
