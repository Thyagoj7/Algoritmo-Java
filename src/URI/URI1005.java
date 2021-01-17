package URI;

import java.util.Scanner;

public class URI1005 {
    public static void main(String[] args) {
        double A;
        double B;
        double MEDIA;

        Scanner ler = new Scanner (System.in);
        A = ler.nextDouble();
        B = ler.nextDouble();


        A=35.0/A;
        B=75.0/B;

        MEDIA=(A+B)/2;

       // System.out.printf("%.1f",A);
        //System.out.printf("%.1f",B);

        System.out.printf("MEDIA = " + "%.5f",MEDIA);


    }
}
