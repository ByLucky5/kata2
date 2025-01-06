package software.ulpgc.kata2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MapAxisElementBuilder implements AxisElementBuilder {
    private final Map<Integer, Integer> data;

    public MapAxisElementBuilder(Map<Integer, Integer> data) {
        this.data = data;
    }

    @Override
    public List<AxisElement> build() {
        List<AxisElement> elements = new ArrayList<AxisElement>();
        for (Integer key : data.keySet()) {
            elements.add(new AxisElement(key, data.get(key)));
        }
        return elements;
    }
}
