package line_chart.addpiont;


import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.faces.bean.ManagedBean;
import java.applet.Applet;

@ManagedBean
public class HibernateDao extends Applet {

    private Session session;
    private Transaction trans;

    public void start(AddPoint p) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            AddPoint point = new AddPoint();
            point.setX_point(p.getX_point());
            point.setY_point(p.getY_point());
            session.save(point);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            {
                session.close();
            }
        }

    }

}