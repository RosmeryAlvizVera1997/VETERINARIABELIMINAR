/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedbean;

import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;




@ManagedBean
@ViewScoped
public class MascotaBean {

    private Mascota mascota;

    public MascotaBean() {
        mascota=new Mascota();
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    public String guardar(){
        MascotaDao dao= new MascotaDao();
        dao.guardarMascota(mascota);
        return "/RegistroMascota";
    }
    public ArrayList<Mascota> listar(){
    ArrayList<Mascota> milista=new ArrayList<>();
    MascotaDao dao =new MascotaDao();
    milista=dao.listarMascotas();
    return milista;
}
    
    public String actualizarMascota(){
        MascotaDao dao =new MascotaDao();
        dao.actualizarMascota(mascota);
        return "RegistroMascota";
    }
    public String eliminarMascota(){
         MascotaDao dao = new MascotaDao();
            boolean respuesta= dao.eliminarMascota(mascota);
            if(respuesta){
                
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Correcto","Registro Borrado con exito"));
            }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error","No se pudo eliminar"));
            }
            return "RegistroMascota";
        
    }
     public String limpiar(){
         mascota=new Mascota();
        return "RegistroMascota";
    }
}
