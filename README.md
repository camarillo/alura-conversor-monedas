# alura-conversor-monedas
Challenge Alura Conversor de monedas

# Descripción
Realizar un sistema que pueda devolver la conversion de una moneda a otra.

Utilizando el API https://app.exchangerate-api.com/dashboard

# Como utlizarlo
Al ejecutar el sistema aparecera el siguiente menu:
```
--------------------------------------------------
.:: CONVERSOR DE MONEDAS - ALURA ::.
 Seleccione la moneda que requiere convertir
0). Dolares(USD) a Peso argentino(ARS)
1). Peso argentino(ARS) a Dolares(USD)
2). Dolares(USD) a Real Brasileño(BRL)
3). Real Brasileño(BRL) a Dolares(USD)
4). Dolares(USD) a Pesos Colombiano(COP)
5). Pesos Colombiano(COP) a Dolares(USD)
6). Dolares(USD) a Pesos mexicanos(MXN)
7). Pesos mexicanos(MXN) a Dolares(USD)
8). Salir
Seleccione una opcion:
```

Ingrese una opcion valida y posteriormente la cantidad que requiere convertir en enteros.

```
Seleccione una opcion: 6
Ingrese la cantidad que requiere convertir: 1000
```

Y obtendra el resultado:
```
RESULTADO: 1000 USD equivalen a 17757.9 MXN
--------------------------------------------------
```

# Si requiere agregar mas opciones de conversion, solo agregue mas registros en esta variable.
```
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

```
La lista de monedas disponibles esta en: https://www.exchangerate-api.com/docs/supported-currencies
