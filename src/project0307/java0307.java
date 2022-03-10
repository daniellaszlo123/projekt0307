package project0307;

import java.util.Scanner;

public class java0307 {

    public static void main(String[] args) {
        int elso = 0, masodik = 0;
        Scanner scan = new Scanner(System.in);

        while (elso <= 0 || elso > 100) {

            System.out.print("Add meg az első számot: ");
            elso = scan.nextInt();
        }
        while (masodik <= 0 || masodik > 100) {
            System.out.print("Add meg a második számot: ");
            masodik = scan.nextInt();
        }
        
    }
}
