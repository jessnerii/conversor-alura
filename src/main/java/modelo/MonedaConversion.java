/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import views.MonedaFrame;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MonedaConversion {

    public static void realizarConversion(String monedaOrigen, String monedaDestino) {
        String cantidad;
        boolean inputValido = false;

        do {
            cantidad = MonedaFrame.cantidadDinero.getText();
            inputValido = validarInput(cantidad);

            if (!inputValido) {
                JOptionPane.showMessageDialog(null, "Los datos no son válidos. Por favor, introduzca solo números.");
            }
        } while (!inputValido);

        double cantidadDouble = Double.parseDouble(cantidad);
        double factorConversion = obtenerFactorConversionDesdeAPI(monedaOrigen, monedaDestino);
        double resultado = cantidadDouble * factorConversion;

        JOptionPane.showMessageDialog(null, cantidad + " " + monedaOrigen + " son " + resultado + " " + monedaDestino);

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea hacer otra conversión?",
                "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (confirmacion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Saliendo del programa");
            System.exit(0);
        }
    }

    public static boolean validarInput(String valor) {
        return valor.matches("[0-9]*\\.?[0-9]+");
    }

    public static String obtenerCodigoMoneda(String monedaSeleccionada) {
        String codigoMoneda = "";
        switch (monedaSeleccionada) {
            case "Peso (MXN)":
                codigoMoneda = "MXN";
                break;
            case "Dolar (USD)":
                codigoMoneda = "USD";
                break;
            case "Euro (EUR)":
                codigoMoneda = "EUR";
                break;
            case "Libra Esterlina (GBP)":
                codigoMoneda = "GBP";
                break;
            case "Yen Japones (JPY)":
                codigoMoneda = "JPY";
                break;
            case "Won sur-coreano (KRW)":
                codigoMoneda = "KRW";
                break;
            // Agrega más casos para otras monedas si las necesitas
            default:
                codigoMoneda = "";
                break;
        }
        return codigoMoneda;
    }

    public static double obtenerFactorConversionDesdeAPI(String monedaOrigen, String monedaDestino) {
        double factorConversion = 0.0;

        try {
            // Replace "YOUR-API-KEY" with your actual API key
            String apiKey = "c2e80555ca4db5a9cb8940c8";
            String url_str = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + monedaOrigen + "/" + monedaDestino;

            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to JSON
            JsonParser jp = new JsonParser();
            JsonObject jsonobj = jp.parse(new InputStreamReader(request.getInputStream())).getAsJsonObject();

            String result = jsonobj.get("result").getAsString();
            if (result.equals("success")) {
                factorConversion = jsonobj.get("conversion_rate").getAsDouble();
            } else {
                JOptionPane.showMessageDialog(null, "Error al obtener los tipos de cambio. Por favor, verifica tu conexión a internet o API key.");
                return 0.0; // Salir del método si no se obtiene un resultado exitoso.
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los tipos de cambio. Por favor, verifica tu conexión a internet o API key2.");
        }

        return factorConversion;
    }

}
