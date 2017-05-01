package apka;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        int i = 0;


        Pojazdy opel = new Pojazdy(40, "corsa");
        Scanner sc = new Scanner(System.in);

        System.out.println(opel.getNazwa());
        System.out.println(opel.toString());


        while (true) {
            new Pojazdy(150, "abs", ++i);
            if (i % 3000 == 0) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.gc();
            }
        }


    }


}