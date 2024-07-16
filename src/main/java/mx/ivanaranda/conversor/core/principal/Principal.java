package mx.ivanaranda.conversor.core.principal;

import mx.ivanaranda.conversor.core.model.DatosConversor;
import mx.ivanaranda.conversor.core.service.ConsumoAPI;
import mx.ivanaranda.conversor.core.service.ConvierteJson;
import mx.ivanaranda.conversor.core.service.ConvierteJsonImpl;

public class Principal {

    private ConsumoAPI api = new ConsumoAPI();
    private ConvierteJsonImpl convierteJson = new ConvierteJsonImpl();

    public void menu(){
        var json = api.obtenerDatos("https://v6.exchangerate-api.com/v6/494036795c264199afc8176f/pair/MXN/USD");
        var datos = convierteJson.obtenerDatos(json, DatosConversor.class);
        System.out.println("1 " + datos.moneda() + " equivale a " + datos.tipoCambio() + " " + datos.monedaConversion());
    }
}
