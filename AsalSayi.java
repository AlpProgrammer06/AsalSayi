package com.company;

import java.util.Scanner;

public class Main {
    //Karþýlaþýlan sayýnýn kendisi dýþýnda bir böleni bulunmuyor ise o bir asal sayýdýr
    public static void main(String[] args) {


        for (int sayi = 2; sayi <= 100; sayi++) {//sayý
            int sayac = 0;
            for (int j = 2; j <= sayi; j++) {//bolen
                if (sayi % j == 0) {
                    sayac++;
                }
            }if (sayac==1)
            System.out.print(sayi+ " ");
        }
    }
}