package prueba;

import dao.MascotaDao;
import entidades.Mascota;
import org.hibernate.Session;
import utilitarios.HibernateUtil;

public class ejemploContar_5 {

    public static void main(String[] args) {
        MascotaDao mascotadao = new MascotaDao();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        int cantidadmascota = mascotadao.ContadorDeMascota(sesion);
        System.out.println("mascotas total: " + cantidadmascota);
    }
}
