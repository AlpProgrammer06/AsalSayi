package com.company;

import java.util.Scanner;

public class Main {
    //Kar��la��lan say�n�n kendisi d���nda bir b�leni bulunmuyor ise o bir asal say�d�r
    public static void main(String[] args) {


        for (int sayi = 2; sayi <= 100; sayi++) {//say�
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