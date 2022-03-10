package project0307;

import java.util.Random;
import java.util.Scanner;

    class Muveletek{
        boolean osszeadas() {
            Random rnd = new Random();
            int szam1 = rnd.nextInt(101);
            int szam2 = rnd.nextInt(101-szam1);
            Scanner sc = new Scanner(System.in);
            System.out.printf("%d+%d=", szam1, szam2);
            int valasz=sc.nextInt();
            int eredmeny=szam1+szam2;
            if (eredmeny==valasz) {
                System.out.println("Helyes válasz!");
                return true;
            }else{
                System.out.println("Rossz válasz! A helyes válasz: "+eredmeny);
                return false;
            }
        }
        boolean kivonas() {
            Random rnd = new Random();
            int szam1 = rnd.nextInt(101);
            int szam2 = rnd.nextInt(szam1);
            Scanner sc = new Scanner(System.in);
            System.out.printf("%d-%d=", szam1, szam2);
            int valasz=sc.nextInt();
            int eredmeny=szam1-szam2;
            if (eredmeny==valasz) {
                System.out.println("Helyes válasz!");
                return true;
            }else{
                System.out.println("Rossz válasz! A helyes válasz: "+eredmeny);
                return false;
            }
            
        }
        void szorzas() {
            
            Random rnd = new Random();
            int szam1 = rnd.nextInt(10);
            int szam2 = rnd.nextInt(10);
            Scanner sc = new Scanner(System.in);
            System.out.println(szam1 +"+"+ szam2 +"=__");
            int valasz=sc.nextInt();
            int eredmeny=szam1+szam2;
            if (eredmeny == valasz) {
                System.out.println("Helyes válasz!");
             
            }else{
                System.out.println("Rossz válasz! A helyes válasz: "+eredmeny);
               
        }  
        
        }
        void osztas() {
        
        }
    }

public class java0307 {

    public static void main(String[] args) {
        int helyes=0, rossz=0;
        boolean joE;
        int muvelet;
        Scanner sc = new Scanner(System.in);
        Muveletek mu = new Muveletek();
        do {            
            System.out.println("Milyen műveletet szeretnél gyakorolni?(Számot adj meg!)\n 1.Összeadás\n 2.Kivonás\n 3. Szorzás\n 4.Osztás");
            muvelet=sc.nextInt();
        } while (!(1<=muvelet && muvelet<=4));
        
        if (muvelet==1) {
            joE=mu.osszeadas();
            if (joE) {
                helyes++;
            }else{
                rossz++;
            }
            //System.out.println(helyes+" "+rossz);
        } else if(muvelet==2) {
            joE=mu.kivonas();
            if (joE) {
                helyes++;
            }else {
                rossz++;
            }
        } else if(muvelet==3){
            mu.szorzas();
        } else if(muvelet==4){
            mu.osztas();
        }
    }
}
