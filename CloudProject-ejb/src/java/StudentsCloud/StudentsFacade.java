/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentsCloud;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hp
 */
@Stateful
public class StudentsFacade extends AbstractFacade<Students> implements StudentsFacadeLocal {

    @PersistenceContext(unitName = "CloudProject-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentsFacade() {
        super(Students.class);
    }

    @Override
    public void setUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPassword(String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEnrolment(String enrolment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int login(String user,String pass,String enrol)
    {
        Students s = find(enrol);
        if(s==null) return 0;
        else 
        {
            if(s.getPassword().equals(pass) && s.getUsername().equals(user))
                return 1;
        }
        return 0;
                    
        //        return 1;
        
      //  return 0;
   //     return 0;
    }
    public int register(String user,String pass,String enrol,String full)
    {
        Students s = find(enrol);
        if(s!=null)
        {
            System.out.println(s.getEnrolment());
        
            return 0;
        }
        else
        {
            s=new Students();
            s.setEnrolment(enrol);
            s.setFullName(full);
            s.setPassword(pass);
            s.setUsername(user);
            create(s);
            return 1;
        }
         // return 1;
       // return 0;
    }
    public List<String> editDetails(String enrol)
    {
          List<String> arr = new ArrayList<String>();
          Students s=find(enrol);
          arr.add(s.getEnrolment());
          arr.add(s.getFullName());
          arr.add(s.getPassword());
          arr.add(s.getUsername());
          return arr;
    }
    public void closeMe(String en)
    {
        Students s=find(en);
        remove(s);
    }
    public int editDetails(String eno,String en,String fn,String pw,String us)
    {
        System.out.println("1");
        Students s = find(eno);
        System.out.println("2");
        Students s2 = find(en);
        System.out.println("3");
        
        if(s2==null)
        {
            s.setEnrolment(en);
            s.setFullName(fn);
            s.setPassword(pw);
            s.setUsername(us);
            System.out.println("s");
            edit(s);
            System.out.println("s");
            
            return 1;
        }
        else
        {
            return 0;
        }
       // return 0;
    }
    
}
