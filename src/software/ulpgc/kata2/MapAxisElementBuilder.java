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
        ArrayList<Integer> keys = new ArrayList<>(data.keySet());
        Collections.sort(keys);
        for (Integer key : keys) {
            elements.add(new AxisElement(key, data.get(key)));
        }
        return elements;
    }
}
