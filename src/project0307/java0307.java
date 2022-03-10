package project0307;

import java.util.Scanner;

    class Muveletek{
        void osszeadas() {
            
        }
        void kivonas() {
            
        }
        void szorzas() {
        
        }
        void osztas() {
        
        }
    }

public class java0307 {

    public static void main(String[] args) {
        int helyes=0, rossz=0;
        int muvelet;
        Scanner sc = new Scanner(System.in);
        Muveletek mu = new Muveletek();
        do {            
            System.out.println("Milyen műveletet szeretnél gyakorolni?(Számot adj meg!)\n 1.Összeadás\n 2.Kivonás\n 3. Szorzás\n 4.Osztás");
            muvelet=sc.nextInt();
        } while (!(1<=muvelet && muvelet<=4));
        
        if (muvelet==1) {
            mu.osszeadas();
        } else if(muvelet==2) {
            mu.kivonas();
        } else if(muvelet==3){
            mu.szorzas();
        } else if(muvelet==4){
            mu.osztas();
        }
        
    }
}
