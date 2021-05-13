/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texte;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Texte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner ler = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Informe o primeiro valor: ");
        num1 = ler.nextInt();

        System.out.println("Informe o segundo valor: ");
        num2 = ler.nextInt();

        System.out.println("Multiplicação -> " + calc.multiplicar(num1, num2));
        System.out.println("Subtração -> " + calc.subtrair(num1, num2));
        System.out.println("Adição -> " + calc.somar(num1, num2));
        System.out.println("Divisão -> " + calc.dividir(num1, num2));
        
    }

}
