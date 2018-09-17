/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetpbo;

import java.util.Scanner;

/**
 *
 * @author Faras
 */
public class Praktikum2 {
    public static void main (String[] args){
        Scanner masukan = new Scanner(System.in);
        int celcius;
        int hasil;
        System.out.print("Masukkan suhu: ");
        celcius = masukan.nextInt();

        System.out.println ("Konversi dari Celcius ke Reamur: " + (celcius * 4/5));
        System.out.println ("Konversi dari Celcius ke Kelvin: " + (celcius + 273.15));
        System.out.println ("Konversi dari Celcius ke Fahrenheit: " + ((celcius * 9/5) + 32));
    }
}
