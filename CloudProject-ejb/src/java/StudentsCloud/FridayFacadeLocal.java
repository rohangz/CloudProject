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
public interface FridayFacadeLocal {

    void create(Friday friday);

    void edit(Friday friday);

    void remove(Friday friday);

    Friday find(Object id);

    List<Friday> findAll();

    List<Friday> findRange(int[] range);
  public List<String> searchMe(String id);
    int count();
    
}
