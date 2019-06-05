package prueba;

import dao.MascotaDao;
import entidades.Mascota;
import org.hibernate.Session;
import utilitarios.HibernateUtil;

public class ejemploActualizar_4 {

    public static void main(String[] args) {
        MascotaDao mascotadao = new MascotaDao();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Mascota mimascota = new Mascota(2, "boby", "Jamil elv", "pastor aleman");
        mascotadao.actualizarMascota(mimascota);
    }
}
