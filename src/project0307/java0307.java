package project0307;

import java.util.Random;
import java.util.Scanner;

class Muveletek {
    boolean osszeadas() {
        Random rnd = new Random();
        int szam1 = rnd.nextInt(100) + 1;
        int szam2 = rnd.nextInt(100 - szam1) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d+%d=", szam1, szam2);
        int valasz = sc.nextInt();
        int eredmeny = szam1 + szam2;
        if (eredmeny == valasz) {
            System.out.println("Helyes válasz!");
            return true;
        } else {
            System.out.println("Rossz válasz! A helyes válasz: " + eredmeny);
            return false;
        }
    }

    boolean kivonas() {
        Random rnd = new Random();
        int szam1 = rnd.nextInt(100) + 1;
        int szam2 = rnd.nextInt(szam1);
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d-%d=", szam1, szam2);
        int valasz = sc.nextInt();
        int eredmeny = szam1 - szam2;
        if (eredmeny == valasz) {
            System.out.println("Helyes válasz!");
            return true;
        } else {
            System.out.println("Rossz válasz! A helyes válasz: " + eredmeny);
            return false;
        }

    }

    boolean szorzas() {

        Random rnd = new Random();
        int szam1 = rnd.nextInt(10) + 1;
        int szam2 = rnd.nextInt(10) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d*%d=", szam1, szam2);
        int valasz = sc.nextInt();
        int eredmeny = szam1 + szam2;
        if (eredmeny == valasz) {
            System.out.println("Helyes válasz!");
            return true;
        } else {
            System.out.println("Rossz válasz! A helyes válasz: " + eredmeny);
            return false;

        }

    }

    boolean osztas() {
        Random rnd = new Random();
        int szam1 = rnd.nextInt(10) + 1;
        int szam2 = rnd.nextInt(10) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d/%d=", (szam1 * szam2), szam2);
        int valasz = sc.nextInt();
        int eredmeny = (szam1 * szam2) / szam2;
        if (eredmeny == valasz) {
            System.out.println("Helyes válasz!");
            return true;
        } else {
            System.out.println("Rossz válasz! A helyes válasz: " + eredmeny);
            return false;
        }
    }
}

public class java0307 {

    public static void main(String[] args) {
        int helyes = 0, rossz = 0;
        boolean joE;
        int muvelet;
        Scanner sc = new Scanner(System.in);
        Muveletek mu = new Muveletek();
        while (true) {

            do {
                System.out.printf("Helyes válaszok:%d Helytelen válaszok:%d\n", helyes, rossz);
                System.out.println(
                        "Milyen műveletet szeretnél gyakorolni?(Számot adj meg!)\n 1.Összeadás\n 2.Kivonás\n 3.Szorzás\n 4.Osztás\n\n 5.Kilépés");
                System.out.print("Válasz:");
                muvelet = sc.nextInt();
            } while (!(1 <= muvelet && muvelet <= 5));

            if (muvelet == 1) {
                joE = mu.osszeadas();
                if (joE) {
                    helyes++;
                } else {
                    rossz++;
                }
            } else if (muvelet == 2) {
                joE = mu.kivonas();
                if (joE) {
                    helyes++;
                } else {
                    rossz++;
                }
            } else if (muvelet == 3) {
                joE = mu.szorzas();
                if (joE) {
                    helyes++;
                } else {
                    rossz++;
                }
            } else if (muvelet == 4) {
                joE = mu.osztas();
                if (joE) {
                    helyes++;
                } else {
                    rossz++;
                }
            } else if (muvelet == 5) {
                System.out.println("Köszi hogy játszottál!");
                return;
            }
        }
    }
}
