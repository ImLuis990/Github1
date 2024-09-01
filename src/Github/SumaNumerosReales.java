package Github;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class SumaNumerosReales {
  
    public static void main(String[] args) {

        String inputIteraciones = JOptionPane.showInputDialog(null, "Ingrese el número de iteraciones (n):");
        int n = Integer.parseInt(inputIteraciones);

    
        long startTime = System.currentTimeMillis();

        double suma = 0.0;
        int operaciones = 0;

        for (int i = 0; i < n; i++) {
            
            String input = JOptionPane.showInputDialog(null, "Ingrese un número real:");
            double numero = Double.parseDouble(input); 
            suma += numero; 
            operaciones++; 
        }

        JOptionPane.showMessageDialog(null, "La suma de los números ingresados es: " + suma);

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        JOptionPane.showMessageDialog(null, "El tiempo de ejecución del programa es: " + elapsedTime + " milisegundos");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resultados.txt"))) {
            writer.write("Número de iteraciones (n): " + n + "\n");
            writer.write("Número de operaciones: " + operaciones + "\n");
            writer.write("Tiempo de ejecución (milisegundos): " + elapsedTime + "\n");
        } catch (IOException e) {
        }
    }
}