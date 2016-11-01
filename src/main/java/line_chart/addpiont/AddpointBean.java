package line_chart.addpiont;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AddpointBean {

    private AddPoint addPoint = new AddPoint();
    private HibernateDao hibernateDao = new HibernateDao();

    public AddpointBean() {
    }

    public String pointADD() {
        hibernateDao.start(addPoint);
//        addPoint.setX_point(null);
//        addPoint.setY_point(null);
        return "index";
    }

    public AddPoint getAddPoint() {
        return addPoint;
    }

    public void setAddPoint(AddPoint addPoint) {
        this.addPoint = addPoint;
    }

    public HibernateDao getHibernateDao() {
        return hibernateDao;
    }

    public void setHibernateDao(HibernateDao hibernateDao) {
        this.hibernateDao = hibernateDao;
    }
}
