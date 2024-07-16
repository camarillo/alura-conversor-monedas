package mx.ivanaranda.conversor.core.service;

public interface ConvierteJson {
    <T> T obtenerDatos(String json, Class<T> clase);
}
