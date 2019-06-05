package dao;

import entidades.Mascota;
import interfaces.IMascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilitarios.HibernateUtil;

public class MascotaDao implements IMascota {

    //guardar
    @Override
    public void guardarMascota(Mascota mascota) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();

        sesion.save(mascota);
        transaccion.commit();

        sesion.close();
    }

    //listar todas
    @Override
    public ArrayList<Mascota> listarMascotas(Session sesion) {
        ArrayList<Mascota> milista = new ArrayList<>();
        //Crear la consulta hacia la base de datos
        Query query = sesion.createQuery("FROM Mascota");
        //Ejecutar la consulta y obtener la lista
        milista = (ArrayList<Mascota>) query.list();
        return milista;

    }

    //listar por datos
    @Override
    public List<Mascota> listarMascotaDatosRaza(Session session) {

        String hql = "from Mascota where raza='pastor aleman'";
        Query query = session.createQuery(hql);
        List<Mascota> lista = (List< Mascota>) query.list();
        return lista;
    }

    //listar por nombre
    @Override
    public List<Mascota> listarMascotaNombre(Session session) {

        String hql = "from Mascota where nombreMascota='sandor'";
        Query query = session.createQuery(hql);
        List<Mascota> lista = (List< Mascota>) query.list();
        return lista;
    }

    //actualizar
    @Override
    public void actualizarMascota(Mascota mascota) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        sesion.update(mascota);
        transaccion.commit();
        sesion.close();
    }

//contar registro
    @Override
    public Integer ContadorDeMascota(Session session) {
        String hql = "select count(*) from Mascota";
        Query query = session.createQuery(hql);
        Long FilasTabla = (Long) query.uniqueResult();
        Integer cont = FilasTabla.intValue();
        return cont;
    }

}
