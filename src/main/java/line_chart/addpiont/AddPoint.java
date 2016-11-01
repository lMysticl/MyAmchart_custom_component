package line_chart.addpiont;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;
import java.io.Serializable;

@ManagedBean
@Entity
@Table(name = "addpoint")
@RequestScoped
public class AddPoint implements Serializable {
    private String y_point;
    private String x_point;
    private Integer id;

    public AddPoint() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getY_point() {
        return y_point;
    }

    public void setY_point(String y_point) {
        this.y_point = y_point;
    }

    public String getX_point() {
        return x_point;
    }

    public void setX_point(String x_point) {
        this.x_point = x_point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddPoint)) return false;

        AddPoint point = (AddPoint) o;

        return id != null ? id.equals(point.id) : point.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}


