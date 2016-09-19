package line_chart.addpiont;


import org.hibernate.Session;

import javax.faces.bean.ManagedBean;
import java.applet.Applet;

@ManagedBean
public class Hibernate extends Applet {


    public void start() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(new AddPoint());
        session.getTransaction().commit();
    }

}