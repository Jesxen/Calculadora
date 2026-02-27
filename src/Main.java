/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jesús
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraEjemplo calc = new CalculadoraEjemplo(10, 5);
        System.out.println("Suma con decimales: " + calc.sumar());
        System.out.println("Suma: " + calc.sumar());
        System.out.println("Resta: " + calc.restar());
        System.out.println("Multiplicación: " + calc.multiplicar());
        System.out.println("División: " + calc.dividir());
        
    }

}
