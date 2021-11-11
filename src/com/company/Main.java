package com.company;
        /*Dersler : Matematik, Fizik, Kimya,Sosyal
        Geçme Notu : 55
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fiz,kim,sos;
        Scanner scan= new Scanner(System.in);
        System.out.print("matametik notunuzu giriniz");
        mat= scan.nextInt();
        System.out.print("kimya notunuzu giriniz");
        kim= scan.nextInt();
        System.out.print("fizik notunuzu giriniz");
        fiz= scan.nextInt();
        System.out.print("sosyal notunuzu giriniz");
        sos= scan.nextInt();
        int toplam=0;
        toplam =mat<100&&mat>0 ?(toplam+mat):toplam;
        toplam =kim<100&&kim>0 ?(toplam+kim):toplam;
        toplam =fiz<100&&fiz>0 ?(toplam+fiz):toplam;
        toplam =sos<100&&sos>0 ?(toplam+sos):toplam;

        int avarage= (toplam/4);
        System.out.println("avarage" + avarage);
        if(avarage>=55){
            System.out.println("Tebrikler");
        }
        else{
            System.out.println("kaldınız");
        }

    }
}
