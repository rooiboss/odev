package Giris;

import java.util.Scanner;

public class ödev {
    public static void main(String[] args) {
    int mat , fizik , kimya , türkçe , müzik , tarih ;
        Scanner inp= new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat = inp.nextInt();


        System.out.print("Tarih Notunuz:");
        tarih = inp.nextInt();


        System.out.print("Türkçe Notunuz:");
        türkçe = inp.nextInt();


        System.out.print("Kimya Notunuz:");
        kimya = inp.nextInt();


        System.out.print("Fizik Notunuz:");
        fizik = inp.nextInt();


        System.out.print("Müzik Notunuz:");
        müzik = inp.nextInt();

        int toplam = (mat + fizik + müzik + kimya + tarih + türkçe);
        double sonuc =(toplam/6);
        System.out.println(sonuc);



    }
}
