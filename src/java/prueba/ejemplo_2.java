package prueba;

import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import org.hibernate.Session;
import utilitarios.HibernateUtil;

public class ejemplo_2 {

    public static void main(String[] args) {
        ArrayList<Mascota> lista = new ArrayList<>();
        MascotaDao mascotadao = new MascotaDao();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        //lista = mascotadao.listarMascotas(sesion);
        System.out.println("INFORMACION DE TODAS LAS MASCOTAS");
        for (Mascota mascota : lista) {
            System.out.println(mascota.getIdMascota() + " , " + mascota.getNombreMascota() + " , " + mascota.getNombreCiente()
                    + " , " + mascota.getRaza());
        }
    }

}
