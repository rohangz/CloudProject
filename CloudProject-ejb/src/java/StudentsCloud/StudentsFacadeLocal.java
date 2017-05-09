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
public interface StudentsFacadeLocal {

    void create(Students students);
    void setUsername(String username);
    void edit(Students students);
    void setPassword(String password);
    void remove(Students students);
    void setEnrolment(String enrolment);
    Students find(Object id);
    int login(String user,String pass,String enrol);
    List<Students> findAll();
    int register(String user,String pass,String enrol,String full);
    List<Students> findRange(int[] range);
    List<String> editDetails(String enrol);
    void closeMe(String en);
    int editDetails(String oen,String en,String fn,String pw,String us);
    int count();


    
}
