/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texte;

/**
 *
 * @author edu
 */
public class TextCalculadora {

    public static void main(String[] a) {
        Calculadora cacl = new Calculadora();
        int num1 = 5;
        int num2 = 5;
        double valorTotal = cacl.somar(num1, num2);
        if (valorTotal == 10) {
            System.out.println("valor correto!");
        } else {
            System.out.println("valor errado!");
        }
    }

}
