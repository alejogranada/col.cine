package col.cine.serviceImpl;

import col.cine.SalaRepository;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class SalaServiceImpl implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(SalaServiceImpl.class);
    private SalaRepository salaRePository;

    @Autowired
    public SalaServiceImpl(SalaRepository salaRePository)
    {
        this.salaRePository = salaRePository;
    }
}
