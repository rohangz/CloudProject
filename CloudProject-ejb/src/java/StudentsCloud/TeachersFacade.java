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
public class TeachersFacade extends AbstractFacade<Teachers> implements TeachersFacadeLocal {

    @PersistenceContext(unitName = "CloudProject-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TeachersFacade() {
        super(Teachers.class);
    }
    
   
    public List<String> search(String fname)
    {
        List<Teachers> teach = findAll();
        List<String> ids=new ArrayList<String>();
        for(int i=0;i<teach.size();++i)
        {   
            System.out.println(teach.get(i).getFId()+" "+teach.get(i).getFullName());
            if(teach.get(i).getFullName().equals(fname))
            {
                ids.add(teach.get(i).getFId());
            }
        }
        
        return ids;
        
    }
    
}
