package col.cine.service.sala;

import col.cine.dto.SalaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SalaService {

    /**
     * Metodo de busqueda avanzada
     *
     * @return
     */
    List<SalaDTO> busquedaAvanzada();

}
