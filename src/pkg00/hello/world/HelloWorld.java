/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00.hello.world;

import java.util.Scanner;

/**
 *
 * @author wferrand
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        System.out.println("Affichage d'un message dans laz console");
        System.out.println("sur plusieur lignes");
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        
        System.out.print("combien vaut x ? : ");
        x = sc.nextInt();
        System.out.print("combien vaut y ? : ");
        y = sc.nextInt();
        System.out.println("x est egale a " + x + " et y a " + y);
        System.out.println("on iverse x et y");
        int z = x;
        int a = y;
        x = a;
        y = z;
        System.out.println("maintenant x est egale a " + x + " et y a " + y);
}
    
}
