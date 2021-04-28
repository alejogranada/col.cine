package col.cine.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_sala")
public class Sala implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SALA_SUC_SEQ")
    @SequenceGenerator(name="SALA_SUC_SEQ",sequenceName = "tb_sala_cod_sala_seq",allocationSize=1)
    @Column(name = "cod_sala", nullable = false)
    private BigInteger id;

    @Column(name = "cod_sucursal_ciudad")
    private BigInteger codSucursalCiudad;

    @Column(name = "numero_fila")
    private Integer numeroFila;

    @Column(name = "numero_maximo_sillas_fila")
    private Integer nroMaximoSillaFila;

    @Column(name = "cod_tipo_sala")
    private BigInteger codTipoSala;
}
