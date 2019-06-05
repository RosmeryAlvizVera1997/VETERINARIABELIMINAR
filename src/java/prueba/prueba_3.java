package prueba;

import dao.MascotaDao;
import entidades.Mascota;

import java.util.LinkedList;
import java.util.List;
import org.hibernate.Session;
import utilitarios.HibernateUtil;

public class prueba_3 {

    public static void main(String[] args) throws Exception {

        List<Mascota> lista = new LinkedList<>();
        MascotaDao mascotadao = new MascotaDao();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        lista = mascotadao.listarMascotaDatosRaza(sesion);
        System.out.println("INFORMACION DE TODAS LAS MASCOTAS RAZA");
        for (Mascota mascota : lista) {
            System.out.println(mascota.getRaza());
        }
    }
}
