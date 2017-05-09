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
public interface TeachersFacadeLocal {

    void create(Teachers teachers);

    void edit(Teachers teachers);

    void remove(Teachers teachers);

    Teachers find(Object id);

    List<Teachers> findAll();

    List<Teachers> findRange(int[] range);
    List<String> search(String id);
    int count();
    
}
