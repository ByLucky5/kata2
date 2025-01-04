package software.ulpgc.kata2;

import java.util.List;

public class HistogramStatsDisplay implements StatsDisplay{
    private final List<AxisElement> elements;

    public HistogramStatsDisplay(AxisElementBuilder axisElementBuilder) {
        this.elements = axisElementBuilder.build();
    }

    @Override
    public void display() {
        for (AxisElement element : elements) {
            System.out.println(element.getField() + " " + "|".repeat(element.getValue()/5000));
        }
        System.out.println("| EQUALS TO 5000 MOVIES");
    }
}
