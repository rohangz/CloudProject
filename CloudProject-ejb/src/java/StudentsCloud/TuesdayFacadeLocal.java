/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentsCloud;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hp
 */
@Local
public interface TuesdayFacadeLocal {

    void create(Tuesday tuesday);

    void edit(Tuesday tuesday);

    void remove(Tuesday tuesday);

    Tuesday find(Object id);

    List<Tuesday> findAll();

    List<Tuesday> findRange(int[] range);
 List<String> searchMe(String id);
    int count();
    
}
