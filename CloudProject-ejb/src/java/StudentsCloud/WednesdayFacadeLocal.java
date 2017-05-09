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
public interface WednesdayFacadeLocal {

    void create(Wednesday wednesday);

    void edit(Wednesday wednesday);

    void remove(Wednesday wednesday);

    Wednesday find(Object id);

    List<Wednesday> findAll();

    List<Wednesday> findRange(int[] range);
List<String> searchMe(String id);
    int count();
    
}
