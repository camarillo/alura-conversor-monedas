package mx.ivanaranda.conversor.core.principal;

import mx.ivanaranda.conversor.core.model.Conversion;
import mx.ivanaranda.conversor.core.model.DatosConversor;
import mx.ivanaranda.conversor.core.service.ConsumoAPI;
import mx.ivanaranda.conversor.core.service.ConvierteJsonImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private final String URL_BASE = "https://v6.exchangerate-api.com/v6/";
    private final String API_KEY = "494036795c264199afc8176f";
    private final List<Conversion> OPCIONES = new ArrayList<>(Arrays.asList(
        new Conversion("USD", "Dolares", "ARS", "Peso argentino")
        , new Conversion("ARS", "Peso argentino", "USD", "Dolares")
        , new Conversion("USD", "Dolares", "BRL", "Real Brasileño")
        , new Conversion("BRL", "Real Brasileño", "USD", "Dolares")
        , new Conversion("USD", "Dolares", "COP", "Pesos Colombiano")
        , new Conversion("COP", "Pesos Colombiano", "USD", "Dolares")
        , new Conversion("USD", "Dolares", "MXN", "Pesos mexicanos")
        , new Conversion("MXN", "Pesos mexicanos", "USD", "Dolares")
    ));
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI api = new ConsumoAPI();
    private ConvierteJsonImpl convierteJson = new ConvierteJsonImpl();

    public void menu(){
        var opcion = -1;
        while (opcion != OPCIONES.size()){
            System.out.println("--------------------------------------------------");
            System.out.println(".:: CONVERSOR DE7 MONEDAS - ALURA ::.");
            System.out.println(" Seleccione la moneda que requiere convertir");
            for(Conversion conversion : OPCIONES){
                System.out.println(OPCIONES.indexOf(conversion)+ "). " + conversion.monedaNombre() + "(" + conversion.moneda() + ")" + " a " + conversion.monedaConversionNombre() + "(" + conversion.monedaConversion() + ")");
            }
            System.out.println(OPCIONES.size() + "). Salir");
            System.out.print("Seleccione una opcion: ");
            int opcionUsuario = teclado.nextInt();
            teclado.nextLine();
            if (opcionUsuario == OPCIONES.size()){
                break;
            }
            System.out.print("Ingrese la cantidad que requiere convertir: ");
            int cantidad = teclado.nextInt();
            teclado.nextLine();
            Conversion conversion = OPCIONES.get(opcionUsuario);
            System.out.println("RESULTADO: " + cantidad + " " + conversion.moneda() + " equivalen a " + realizarConversion(conversion, cantidad) + " " + conversion.monedaConversion());
            System.out.println("--------------------------------------------------");
        }
        System.out.println(".:: Operacion terminada ::.");
    }

    public Double realizarConversion(Conversion conversion, Integer cantidad){
        var json = api.obtenerDatos(URL_BASE + API_KEY + "/pair/" + conversion.moneda() + "/" + conversion.monedaConversion() + "/" + cantidad);
        var datos = convierteJson.obtenerDatos(json, DatosConversor.class);
        return datos.resultado();
    }
}
