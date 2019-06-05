package interfaces;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

public interface IMascota {

    //gurdar
    public abstract void guardarMascota(Mascota mascota);

    //listar todas
    public abstract ArrayList<Mascota> listarMascotas(Session sesion);

    //actualizar
    public abstract void actualizarMascota(Mascota mascota);

    // listar por datos
    public abstract List<Mascota> listarMascotaDatosRaza(Session session);

    //listar por nombre
    public abstract List<Mascota> listarMascotaNombre(Session session);

    //contar registro
    public Integer ContadorDeMascota(Session session);
}
