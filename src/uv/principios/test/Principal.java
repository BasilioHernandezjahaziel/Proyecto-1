
package uv.principios.test;

import uv.principios.dao.Departamento;
import uv.principios.dao.FactoryDAO;
import uv.principios.dao.IDAOGeneral;
import uv.principios.dao.Persona;

/**
 *
 * @author gabrielhs, david y jahaziel
 */
public class Principal {
    public static void main(String[] args) {
        IDAOGeneral daop=FactoryDAO.create(FactoryDAO.TypeDAO.PERSONA);
        Persona p=new Persona();
        p.setClave("01");
        p.setNombre("Juan");
        p.setDireccion("av.1");
        p.setTelefono("777");
        
        Departamento dep= new Departamento();
        dep.setClave("01");
        p.setDepartamento(dep);
        daop.guardar(p);
    }
}
