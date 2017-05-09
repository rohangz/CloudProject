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
public interface MondayFacadeLocal {

    void create(Monday monday);

    void edit(Monday monday);

    void remove(Monday monday);

    Monday find(Object id);

    List<Monday> findAll();

    List<Monday> findRange(int[] range);
   // List<Monday> searchMe(List<String> ids);
    List<String> searchMe(String id);
    int count();
    
}
