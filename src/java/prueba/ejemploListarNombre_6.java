package prueba;

import dao.MascotaDao;
import entidades.Mascota;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Session;
import utilitarios.HibernateUtil;

public class ejemploListarNombre_6 {

    public static void main(String[] args) {

        List<Mascota> lista = new LinkedList<>();
        MascotaDao mascotadao = new MascotaDao();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        lista = mascotadao.listarMascotaNombre(sesion);
        System.out.println("INFORMACION DE TODAS LAS MASCOTAS POR NOMBRE");
        for (Mascota mascota : lista) {
            System.out.println(mascota.getNombreMascota());
        }
    }
}
