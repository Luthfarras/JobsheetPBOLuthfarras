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
public class Praktikum1 {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
                double r = masukan.nextDouble();
        System.out.println("Luas permukaan bola: " +3.14*r*r*4);
    }
    
}
