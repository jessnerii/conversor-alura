/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import views.TemperaturaFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TemperaturaConversion {

    public static void temperaturaConversion(String temperaturaOrigen, String temperaturaDestino, double factorConversion) {
        String cantidad;
        boolean inputValido = false;

        do {

            cantidad = TemperaturaFrame.cantidadGrados.getText();
            inputValido = validarInput(cantidad);

            if (!inputValido) {
                JOptionPane.showMessageDialog(null, "Los datos no son validos. Por favor, introduzca solo números");
            }
        } while (!inputValido);

        double cantidadDouble = Double.parseDouble(cantidad);
        double resultado = cantidadDouble * factorConversion;

        JOptionPane.showMessageDialog(null, cantidad + " " + temperaturaOrigen + " son " + resultado + " " + temperaturaDestino);

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea hacer otra conversion?",
                "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        if (confirmacion == 1 || confirmacion == 2) {
            JOptionPane.showMessageDialog(null, "Saliendo del programa");
            System.exit(0);
        }

    }

    public static boolean validarInput(String valor) {
        return valor.matches("[0-9]*\\.?[0-9]+");
    }

    public static double obtenerFactorConversion(String temperaturaOrigen, String temperaturaDestino, double cantidad) {
    switch (temperaturaOrigen) {
        case "Fahrenheit":
            switch (temperaturaDestino) {
                case "Celsius": return (cantidad - 32.0) * 5.0 / 9.0;
                case "Kelvin": return (cantidad - 32.0) * 5.0 / 9.0 + 273.15;
                default: return cantidad; 
            }
        case "Celsius":
            switch (temperaturaDestino) {
                case "Fahrenheit": return cantidad * 9.0 / 5.0 + 32.0;
                case "Kelvin": return cantidad + 273.15;
                default: return cantidad; 
            }
        case "Kelvin":
            switch (temperaturaDestino) {
                case "Celsius": return cantidad - 273.15;
                case "Fahrenheit": return cantidad * 9.0 / 5.0 - 459.67;
                default: return cantidad; 
            }
        default:
            return cantidad; 
    }
}


}
