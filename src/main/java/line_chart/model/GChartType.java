package line_chart.model;

public enum GChartType {
    PIE("PieChart"),
    AREA("AreaChart"),
    BAR("BarChart"),
    GEO("GeoChart"),
    ORGANIZATIONAL("OrgChart"),
    COLUMN("ColumnChart");

    public String getChartName() {
        return chartName;
    }

    private GChartType(String chartName) {
        this.chartName = chartName;
    }

    private String chartName;
}