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
public interface ThursdayFacadeLocal {

    void create(Thursday thursday);

    void edit(Thursday thursday);

    void remove(Thursday thursday);

    Thursday find(Object id);

    List<Thursday> findAll();

    List<Thursday> findRange(int[] range);
 public List<String> searchMe(String id);
    int count();
    
}
