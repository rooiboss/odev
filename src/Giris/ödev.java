package Giris;

import java.util.Scanner;

public class ödev {
    public static void main(String[] args) {
        System.out.print("Kdvsi Hesaplanacak Tutarı Giriniz :");
        Scanner scan = new Scanner(System.in);

        double amount = scan.nextDouble();
        double rateVate = 0.18;
        double rateVate2 = 0.08;
        double kdvTutarı =  amount > 0 && amount <=1000 ? amount * rateVate  : amount * rateVate2 ;
        double kdvliTutar =  amount > 0 && amount <=1000 ? amount * rateVate +amount : amount * rateVate2 +amount;
        System.out.println("KdvliTutar :" + kdvliTutar);
        System.out.println("Kdv'siz Fiyat :" + amount);
        System.out.println("KDV tutarı :" + kdvTutarı);



    }
}
