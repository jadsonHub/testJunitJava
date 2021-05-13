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
public class Calculadora {
    // atributo
// atributo

    private int resultado = 0;

// método somar
    public double somar(int n1, int n2) {
        resultado = n1 + n2;
        return resultado;
    }
// método subtrair

    public double subtrair(int n1, int n2) {
        resultado = n1 - n2;
        return resultado;
    }
// método multiplicar

    public double multiplicar(int n1, int n2) {
        resultado = n1 * n2;
        return resultado;
    }
// método dividir

    public double dividir(int n1, int n2) {
        /*
           double d1 = Double.valueOf(n1);
           double d2 = Double.valueOf(n2);
           double r = d1 / d2;
           return r;
         */
        resultado = n1 / n2;
        return resultado;
    }

}
