package learn.hibernate3.Players;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	 Teams t1 = new Teams(1,"rcb");
         Teams t2 = new Teams(2,"srh");
         Teams t3 = new Teams(3,"csk");
         
    	Players p1 =new Players(18,"Virat","Bat",t1);
        Players p2 =new Players(11,"warner","Bat",t2);
        Players p3 =new Players(07,"dhoni","wicket",t3);
        
        
        
       //hibernate configuration
       Configuration cfg = new Configuration();
   	   cfg.configure();
   	
   	SessionFactory factory = cfg.buildSessionFactory();
   	Session session = factory.openSession();
   	Transaction tx=session.beginTransaction();
   	
  // saving
   	session.save(p1);
   	session.save(p2);
   	session.save(p3); 	
    session.save(t1);
 	session.save(t2);
 	session.save(t3);
 	
   	tx.commit();
	System.out.println("successfully printed");
            
    }
}
