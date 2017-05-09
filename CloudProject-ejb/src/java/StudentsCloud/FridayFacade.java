/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentsCloud;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hp
 */
@Stateless
public class FridayFacade extends AbstractFacade<Friday> implements FridayFacadeLocal {

    @PersistenceContext(unitName = "CloudProject-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FridayFacade() {
        super(Friday.class);
    }
     public List<String> searchMe(String id)
   {
       List<String> arr = new ArrayList<String>();
       Friday mon = find(id);
       if(mon==null)
        return arr;
       else
       {
           arr.add(mon.getFid());
           if(mon.getA().equals("0"))
               arr.add("No");
           else
            arr.add(mon.getA());
           if(mon.getA1().equals("0"))
               arr.add("No");
           else
               arr.add(mon.getA1());
           if(mon.getA2().equals("0"))
               arr.add("No");
           else
            arr.add(mon.getA2());
           for(int i=0;i<arr.size();++i)
               System.out.println(arr.get(i));
           return arr;
       }
   }
}
