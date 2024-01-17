import java.util.Scanner;

public class bola {
    private double jariJari;

    public bola() {
        Scanner x = new Scanner(System.in);
        System.out.println("Masukkan panjang jari-jari");
        this.jariJari = x.nextDouble();
    }

    public void setJariJari(double jariJari) {
        if (jariJari > 0) {
            this.jariJari = jariJari;
        } else {
            System.out.println("Jari-jari harus lebih dari 0.");
        }
    }

    public double showDiameter() {
        return 2 * jariJari;
    }

    public double showLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double showVolume() {
        return (4/3) * Math.PI * Math.pow(jariJari, 3);
    }

    public static void main(String[] args) {
        bola bolaObjek = new bola();
        System.out.println("Diameter: " + bolaObjek.showDiameter());
        System.out.println("Luas Permukaan: " + bolaObjek.showLuasPermukaan());
        System.out.println("Volume: " + bolaObjek.showVolume());
    }
}