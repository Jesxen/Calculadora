/**
 * Operaciones básicas de calculadora.
 * Permite realizar suma, resta, multiplicación y división de dos números.
 * 
 * @author Jesús
 * @version 1.0
 * @since 2026-02-27
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {

    private double operando1;
    private double operando2;
    private double resultado;

    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Suma los dos operandos.
     * @return el resultado de la suma
     */
    public double sumar() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Resta el segundo operando al primero.
     * @return el resultado de la resta
     */
    public double restar() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Multiplica los dos operandos.
     * @return el resultado de la multiplicación
     */
    public double multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Divide el primer operando entre el segundo.
     * @return el resultado de la división
     * @throws ArithmeticException si el segundo operando es cero
     */
    public double dividir() throws ArithmeticException {
        if (operando2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        resultado = operando1 / operando2;
        return resultado;
    }

    
   
}
