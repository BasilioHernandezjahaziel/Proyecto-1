
package uv.principios.dao;

import uv.principios.utils.conexionDB;

/**
 *
 * @author gabrielhs, jahaziel y david
 */
public class DepartamentoDAO implements IDAOGeneral <Departamento>{

    @Override
    public boolean guardar(Departamento pojo) {
        boolean res=false;
        conexionDB con= conexionDB.getInstance();
        String sql = "insert into departamento (clave,nombre) values ('" +
                pojo.getClave() + "','" + pojo.getNombre() + "')";
        res = con.execute(sql);
        return res;
    }
    
}
