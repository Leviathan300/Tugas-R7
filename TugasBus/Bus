package produck.inventory;

public class Bus {
    private double penumpang, maxPenumpang, counter,penumpangBaru;
    //Constructor
public Bus(double penumpang){
    this.maxPenumpang = penumpang;
    penumpang = 0;
    counter = 0;
    penumpangBaru = 0;
}
//Mutator
public void addPenumpang(double penumpang){
    double temp;
    temp = (double) this.penumpang - penumpang;
    if (temp < 0){
        System.out.println("Jumlah penumpang tidak boleh kurang dari 0");
    }
    else{
        this.penumpang = temp;
        counter--;
        penumpangBaru-= penumpang;
    }
    }
    public void getPenumpang(double penumpang){
        double temp;
        temp = this.penumpang + penumpang;
        if(temp >=maxPenumpang){
            System.out.println("Penumpang melebihi batas");
        }else{
            this.penumpang =temp;
            counter--;
            penumpangBaru -= penumpang;
        }
    }   


public double getAverage(){
    if(counter == 0){
        return 0;
    }else{
        return penumpangBaru / counter;
    }
}
    public void cetak(){
        System.out.println("Penumpang di bus sekarang adalah: " + penumpang);
        System.out.println("Jumlah penumpang maksimal bus adalah: " + maxPenumpang);
        System.out.println("Rata-rata penumpang bus adalah: " + getAverage());
    }
}
