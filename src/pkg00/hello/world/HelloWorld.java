/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00.hello.world;

import static java.awt.SystemColor.text;
import java.util.Scanner;

/**
 *
 * @author wferrand
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    /* Tp 1*/
    {
    /* ex 2
    public static void main(String[] args) {
        System.out.println("Affichage d'un message dans laz console");
        System.out.println("sur plusieur lignes");
    }*/
    /* ex 3
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
    }*/
    /*ex 5
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        
        System.out.print("combien vaut a ? : ");
        a = sc.nextInt();
        System.out.print("combien vaut b ? : ");
        b = sc.nextInt();
        int c = (a + b)*2;
        System.out.println("le resultat de (a+b)*2 est 5" + c);
     }*/
    }
    /*Tp 2*/
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mdp = "admin123";
        
        System.out.print("mot de passse : ");
        String machain = sc.nextLine();
        if (machain.equals ("admin123")){
            System.out.println("vrais");
        }
        else{
            System.out.println("faux");
        }
     }

    
}
