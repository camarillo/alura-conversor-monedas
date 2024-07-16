package mx.ivanaranda.conversor.core.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosConversor(
    @JsonAlias("base_code") String moneda
    , @JsonAlias("target_code") String monedaConversion
    , @JsonAlias("conversion_rate") Double tipoCambio
    , @JsonAlias("conversion_result") Double resultado
) {
}
