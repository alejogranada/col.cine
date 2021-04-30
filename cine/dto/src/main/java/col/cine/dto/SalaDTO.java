package col.cine.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SalaDTO {
    private static final long serialVersionUID = 1L;

    private BigInteger id;

    private BigInteger codSucursalCiudad;

    private Integer numeroFila;

    private Integer nroMaximoSillaFila;

    private BigInteger codTipoSala;

}

