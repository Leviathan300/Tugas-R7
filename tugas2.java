import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        
    while(true) {
        System.out.println("");
        System.out.println("Pilihan kamar: ");
        System.out.println("1. Duku");
        System.out.println("2. Jeruk");
        System.out.println("3. Alpukat");
        System.out.println("4. Jambu air");
        System.out.println("5. Durian");
        System.out.println("6. Melon");
        System.out.println("7. Belimbing");
        System.out.println("8. Nangka");
        System.out.println("9. Kedondong");
        System.out.println("0. Cancel");

        int y = x.nextInt();

        if (y == 0){
                System.out.println("");
                System.out.println("Silahkan order lain kali :) ");
            } 

        else if (y >= 1 && y <=9){
            switch (y) {

                //! DUKU
                case 1: 
                    System.out.println("");
                    System.out.println("==KAMAR DUKU==");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holyday ");
                    System.out.println("0. cancel ");
                    
                    int a = x.nextInt();

                if (a >=1 && a <=3){
                    switch(a){
                        case 1: 
                            System.out.println("");
                            System.out.println("==KAMAR DUKU WEEKDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam = x.nextInt();

                            int harga = 915000 * malam;

                            System.out.println("");
                            System.out.println("==KAMAR DUKU WEEKDAY UNTUK " + malam + " MALAM==");
                            System.out.println("Harga:" + harga);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        
                        case 2: 
                            System.out.println("");
                            System.out.println("==KAMAR DUKU WEEKEND==");
                            System.out.println("Untuk berapa malam?");

                            int malam1 = x.nextInt();

                            int harga1 = 1025000 * malam1;

                            System.out.println("");
                            System.out.println("==KAMAR DUKU WEEKEND UNTUK " + malam1 + " MALAM==");
                            System.out.println("Harga:" + harga1);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;

                        case 3: 
                            System.out.println("");
                            System.out.println("==KAMAR DUKU WEEKEND==");
                            System.out.println("Untuk berapa malam?");

                            int malam2 = x.nextInt();

                            int harga2 = 1225000 * malam2;

                            System.out.println("");
                            System.out.println("==KAMAR DUKU WEEKEND UNTUK " + malam2 + " MALAM==");
                            System.out.println("Harga:" + harga2);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        }
                    }

                else{
                    break;
                }

                //! JERUK
                case 2:
                    System.out.println("");
                    System.out.println("==KAMAR JERUK==");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holyday ");
                    System.out.println("0. cancel ");

                    int b = x.nextInt();

                if(b >=1 && b <=3){
                    switch(b){
                        case 1: 
                            System.out.println("");
                            System.out.println("==KAMAR JERUK WEEKDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam = x.nextInt();

                            int harga = 915000 * malam;

                            System.out.println("");
                            System.out.println("==KAMAR JERUK WEEKDAY UNTUK " + malam + " MALAM==");
                            System.out.println("Harga:" + harga);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        
                        case 2: 
                            System.out.println("");
                            System.out.println("==KAMAR JERUK WEEKEND==");
                            System.out.println("Untuk berapa malam?");

                            int malam1 = x.nextInt();

                            int harga1 = 1025000 * malam1;

                            System.out.println("");
                            System.out.println("==KAMAR JERUK WEEKEND UNTUK " + malam1 + " MALAM==");
                            System.out.println("Harga:" + harga1);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;

                        case 3: 
                            System.out.println("");
                            System.out.println("==KAMAR JERUK HOLYDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam2 = x.nextInt();

                            int harga2 = 1225000 * malam2;

                            System.out.println("");
                            System.out.println("==KAMAR JERUK HOLYDAY UNTUK " + malam2 + " MALAM==");
                            System.out.println("Harga:" + harga2);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        }
                    }

                else{
                    break;
                }
                
                //! ALPUKAT
                case 3:
                    System.out.println("");
                    System.out.println("==KAMAR ALPUKAT==");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holyday ");
                    System.out.println("0. cancel ");

                    int c = x.nextInt();
                
                if(c >= 1 && c <= 4){
                    switch(c){
                        case 1: 
                            System.out.println("");
                            System.out.println("==KAMAR ALPUKAT WEEKDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam = x.nextInt();

                            int harga = 575000 * malam;

                            System.out.println("");
                            System.out.println("==KAMAR ALPUKAT WEEKDAY UNTUK " + malam + " MALAM==");
                            System.out.println("Harga:" + harga);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        
                        case 2: 
                            System.out.println("");
                            System.out.println("==KAMAR ALPUKAT WEEKEND==");
                            System.out.println("Untuk berapa malam?");

                            int malam1 = x.nextInt();

                            int harga1 = 695000 * malam1;

                            System.out.println("");
                            System.out.println("==KAMAR ALPUKAT WEEKEND UNTUK " + malam1 + " MALAM==");
                            System.out.println("Harga:" + harga1);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
 
                        case 3: 
                            System.out.println("");
                            System.out.println("==KAMAR ALPUKAT HOLYDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam2 = x.nextInt();

                            int harga2 = 895000 * malam2;

                            System.out.println("");
                            System.out.println("==KAMAR Alpukat HOLYDAY UNTUK " + malam2 + " MALAM==");
                            System.out.println("Harga:" + harga2);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        }
                    }

                else{
                    break;
                }
                
                //! JAMBU AIR
                case 4:
                    System.out.println("");
                    System.out.println("==KAMAR JAMBU AIR==");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holyday ");
                    System.out.println("0. cancel ");

                    int d = x.nextInt();

                if(d >= 1 && d <=3){
                    switch(d){
                        case 1: 
                            System.out.println("");
                            System.out.println("==KAMAR JAMBU AIR WEEKDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam3 = x.nextInt();

                            int harga3 = 575000 * malam3;

                            System.out.println("");
                            System.out.println("==KAMAR JAMBU AIR WEEKDAY UNTUK " + malam3 + " MALAM==");
                            System.out.println("Harga:" + harga3);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        
                        case 2: 
                            System.out.println("");
                            System.out.println("==KAMAR JAMBU AIR WEEKEND==");
                            System.out.println("Untuk berapa malam?");

                            int malam4 = x.nextInt();

                            int harga4 = 695000 * malam4;

                            System.out.println("");
                            System.out.println("==KAMAR JAMBU AIR WEEKEND UNTUK " + malam4 + " MALAM==");
                            System.out.println("Harga:" + harga4);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;

                        case 3: 
                            System.out.println("");
                            System.out.println("==KAMAR JAMBU AIR HOLYDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam5 = x.nextInt();

                            int harga5 = 895000 * malam5;

                            System.out.println("");
                            System.out.println("==KAMAR JAMBU AIR HOLYDAY UNTUK " + malam5 + " MALAM==");
                            System.out.println("Harga:" + harga5);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        }
                    }

                else{
                    break;
                }
                
                //! DURIAN
                case 5:
                    System.out.println("");
                    System.out.println("==KAMAR DURIAN==");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holyday ");
                    System.out.println("0. cancel ");

                    int e = x.nextInt();

                if(e >= 1 && e <= 3){
                    switch(e){
                        case 1: 
                            System.out.println("");
                            System.out.println("==KAMAR DURIAN WEEKDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam3 = x.nextInt();

                            int harga3 = 595000 * malam3;

                            System.out.println("");
                            System.out.println("==KAMAR DURIAN WEEKDAY UNTUK " + malam3 + " MALAM==");
                            System.out.println("Harga:" + harga3);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        
                        case 2: 
                            System.out.println("");
                            System.out.println("==KAMAR DURIAN WEEKEND==");
                            System.out.println("Untuk berapa malam?");

                            int malam4 = x.nextInt();

                            int harga4 = 715000 * malam4;

                            System.out.println("");
                            System.out.println("==KAMAR DURIAN WEEKEND UNTUK " + malam4 + " MALAM==");
                            System.out.println("Harga:" + harga4);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;

                        case 3: 
                            System.out.println("");
                            System.out.println("==KAMAR DURIAN HOLYDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam5 = x.nextInt();

                            int harga5 = 915000 * malam5;

                            System.out.println("");
                            System.out.println("==KAMAR DURIAN HOLYDAY UNTUK " + malam5 + " MALAM==");
                            System.out.println("Harga:" + harga5);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        }
                    }

                else{
                    break;
                }
                
                //! MELON
                case 6:
                    System.out.println("");
                    System.out.println("==KAMAR MELON==");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holyday ");
                    System.out.println("0. cancel ");

                    int f = x.nextInt();

                if(f >= 1 && f <= 3){
                    switch(f){
                        case 1: 
                            System.out.println("");
                            System.out.println("==KAMAR MELON WEEKDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam3 = x.nextInt();

                            int harga3 = 595000 * malam3;

                            System.out.println("");
                            System.out.println("==KAMAR MELON WEEKDAY UNTUK " + malam3 + " MALAM==");
                            System.out.println("Harga:" + harga3);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        
                        case 2: 
                            System.out.println("");
                            System.out.println("==KAMAR MELON WEEKEND==");
                            System.out.println("Untuk berapa malam?");

                            int malam4 = x.nextInt();

                            int harga4 = 715000 * malam4;

                            System.out.println("");
                            System.out.println("==KAMAR MELON WEEKEND UNTUK " + malam4 + " MALAM==");
                            System.out.println("Harga:" + harga4);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;

                        case 3: 
                            System.out.println("");
                            System.out.println("==KAMAR MELON HOLYDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam5 = x.nextInt();

                            int harga5 = 915000 * malam5;

                            System.out.println("");
                            System.out.println("==KAMAR MELON HOLYDAY UNTUK " + malam5 + " MALAM==");
                            System.out.println("Harga:" + harga5);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        }
                    }

                else{
                    break;
                }

                //! BELIMBING
                case 7:
                    System.out.println("");
                    System.out.println("==KAMAR BELIMBING==");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holyday ");
                    System.out.println("0. cancel ");

                    int g = x.nextInt();

                if(g >= 1 && g <= 3){
                    switch(g){
                        case 1: 
                            System.out.println("");
                            System.out.println("==KAMAR BELIMBING WEEKDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam3 = x.nextInt();

                            int harga3 = 495000 * malam3;

                            System.out.println("");
                            System.out.println("==KAMAR BELIMBING WEEKDAY UNTUK " + malam3 + " MALAM==");
                            System.out.println("Harga:" + harga3);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        
                        case 2: 
                            System.out.println("");
                            System.out.println("==KAMAR BELIMBING WEEKEND==");
                            System.out.println("Untuk berapa malam?");

                            int malam4 = x.nextInt();

                            int harga4 = 575000 * malam4;

                            System.out.println("");
                            System.out.println("==KAMAR BELIMBING WEEKEND UNTUK " + malam4 + " MALAM==");
                            System.out.println("Harga:" + harga4);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;

                        case 3: 
                            System.out.println("");
                            System.out.println("==KAMAR BELIMBING HOLYDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam5 = x.nextInt();

                            int harga5 = 755000 * malam5;

                            System.out.println("");
                            System.out.println("==KAMAR BELIMBING HOLYDAY UNTUK " + malam5 + " MALAM==");
                            System.out.println("Harga:" + harga5);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        }
                    }
                
                else{
                    break;
                }

                //! MANGGA
                case 8:
                    System.out.println("");
                    System.out.println("==KAMAR MANGGA==");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holyday ");
                    System.out.println("0. cancel ");

                    int h = x.nextInt();

                if(h >= 1 && h <= 3){
                    switch(h){
                        case 1: 
                            System.out.println("");
                            System.out.println("==KAMAR BELIMBING WEEKDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam3 = x.nextInt();

                            int harga3 = 495000 * malam3;

                            System.out.println("");
                            System.out.println("==KAMAR BELIMBING WEEKDAY UNTUK " + malam3 + " MALAM==");
                            System.out.println("Harga:" + harga3);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        
                        case 2: 
                            System.out.println("");
                            System.out.println("==KAMAR BELIMBING WEEKEND==");
                            System.out.println("Untuk berapa malam?");

                            int malam4 = x.nextInt();

                            int harga4 = 575000 * malam4;

                            System.out.println("");
                            System.out.println("==KAMAR BELIMBING WEEKEND UNTUK " + malam4 + " MALAM==");
                            System.out.println("Harga:" + harga4);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;

                        case 3: 
                            System.out.println("");
                            System.out.println("==KAMAR BELIMBING HOLYDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam5 = x.nextInt();

                            int harga5 = 755000 * malam5;

                            System.out.println("");
                            System.out.println("==KAMAR BELIMBING HOLYDAY UNTUK " + malam5 + " MALAM==");
                            System.out.println("Harga:" + harga5);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        }
                    }
                
                else{
                    break;
                }

                //! KEDONDONG
                case 9:
                    System.out.println("");
                    System.out.println("==KAMAR KEDONDONG==");
                    System.out.println("Pilih waktu: ");
                    System.out.println("1. weekday ");
                    System.out.println("2. weekend ");
                    System.out.println("3. holyday ");
                    System.out.println("0. cancel ");

                    int i = x.nextInt();

                if(i >= 1 && i <= 3){
                    switch(i){
                        case 1: 
                            System.out.println("");
                            System.out.println("==KAMAR KEDONDONG WEEKDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam3 = x.nextInt();

                            int harga3 = 495000 * malam3;

                            System.out.println("");
                            System.out.println("==KAMAR KEDONDONG WEEKDAY UNTUK " + malam3 + " MALAM==");
                            System.out.println("Harga:" + harga3);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        
                        case 2: 
                            System.out.println("");
                            System.out.println("==KAMAR KEDONDONG WEEKEND==");
                            System.out.println("Untuk berapa malam?");

                            int malam4 = x.nextInt();

                            int harga4 = 575000 * malam4;

                            System.out.println("");
                            System.out.println("==KAMAR KEDONDONG WEEKEND UNTUK " + malam4 + " MALAM==");
                            System.out.println("Harga:" + harga4);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;

                        case 3: 
                            System.out.println("");
                            System.out.println("==KAMAR KEDONDONG HOLYDAY==");
                            System.out.println("Untuk berapa malam?");

                            int malam5 = x.nextInt();

                            int harga5 = 755000 * malam5;

                            System.out.println("");
                            System.out.println("==KAMAR KEDONDONG HOLYDAY UNTUK " + malam5 + " MALAM==");
                            System.out.println("Harga:" + harga5);
                            System.out.println("---Pesanan kamar anda akan kami siapkan---");
                            System.out.println("---TERIMAKASIH SUDAH MEMESAN---");
                            System.out.println("");
                            continue;
                        }
                    }
                
                else{
                    break;
                }

            }

        }

        }
    }
}