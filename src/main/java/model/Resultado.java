package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Resultado(
        @JsonAlias("count") Integer contador,
        @JsonAlias("next") String siguiente,
        @JsonAlias("previous") String anterior,
        @JsonAlias("results") List<DatosLibro> resultado

) {
}
