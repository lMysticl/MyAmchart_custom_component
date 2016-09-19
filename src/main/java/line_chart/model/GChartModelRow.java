package line_chart.model;

import java.util.Collection;

public interface GChartModelRow {
    public abstract Collection<Object> getValues();
    public abstract String getLabel();
}