package col.cine.serviceImpl;

import col.cine.SalaRepository;
import col.cine.dto.SalaDTO;
import col.cine.model.Sala;
import col.cine.service.sala.SalaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;


@Service
public class SalaServiceImpl implements SalaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SalaServiceImpl.class);

    private SalaRepository salaRePository;

    @Autowired
    public SalaServiceImpl(SalaRepository salaRePository) {
        this.salaRePository = salaRePository;
    }

    @Override
    public List<SalaDTO> busquedaAvanzada() {

        List<SalaDTO> o = converSalaASalaDto(salaRePository.findAll());

        return o;
    }

    private List<SalaDTO> converSalaASalaDto(List<Sala> listSala) {
        List<SalaDTO> listSalaDto = new ArrayList<>();
        if (null != listSala && !CollectionUtils.isEmpty(listSala)) {
            for (Sala sala : listSala) {
                SalaDTO salaDTO = new SalaDTO();
                salaDTO.setCodSucursalCiudad(sala.getCodSucursalCiudad());
                salaDTO.setId(sala.getId());
                salaDTO.setNroMaximoSillaFila(sala.getNroMaximoSillaFila());
                salaDTO.setNumeroFila(sala.getNumeroFila());
                //salaDTO.setNomSucursal(SucursalCiudadEnum.getById(sala.getCodSucursalCiudad().intValue()).getNombre());
                //salaDTO.setNomTipoSala(TipoSalaEnum.getById(sala.getCodTipoSala().intValue()).getNombre());
                listSalaDto.add(salaDTO);
            }
        }

        return listSalaDto;
    }
}
