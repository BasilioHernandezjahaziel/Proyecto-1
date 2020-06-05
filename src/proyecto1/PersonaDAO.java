
package proyecto1;

/**
 *
 * @author gabrielhs
 */
public class PersonaDAO {
    
    public boolean guardar(Persona p){
        boolean res=false;
        conexionDB con=conexionDB.getInstance();
        String sql="insert into persona (clave,nombre,direccion,telefono) values "
                + "('" + p.getClave() + "','" + p.getNombre() + "','" + p.getDireccion() + "','" +
                p.getTelefono() + "')";
        res=con.execute(sql);
        return res;          
    }
    
}
