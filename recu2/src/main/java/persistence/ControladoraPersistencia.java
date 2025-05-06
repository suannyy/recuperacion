package persistence;

import model.Propietario;
import model.Turno;
import model.Vehiculo;

public class ControladoraPersistencia {

    PropietarioJpaController propirtarioJpa = new PropietarioJpaController();

    TurnoJpaController turnoJpa = new TurnoJpaController();

    VehiculoJpaController vehiculoJpa = new VehiculoJpaController();

    public void guardar(Propietario propietario, Turno turno, Vehiculo vehiculo) {

        propirtarioJpa.create(propietario);

        turnoJpa.create(turno);

        vehiculoJpa.create(vehiculo);
    }
}
