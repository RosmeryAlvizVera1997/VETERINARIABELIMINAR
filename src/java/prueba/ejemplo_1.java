package prueba;

import dao.MascotaDao;
import entidades.Mascota;

public class ejemplo_1 {

    public static void main(String[] args) {

        MascotaDao mascotadao = new MascotaDao();
        Mascota mimascota = new Mascota(3, "sandor", "pither", "pastor aleman");
        mascotadao.guardarMascota(mimascota);

    }

}
