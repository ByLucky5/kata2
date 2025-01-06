package software.ulpgc.kata2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\lucia\\Downloads\\title.basics.tsv");
        List<Title> titles = new FileTitleLoader(file, new TsvTitleDeserializer()).load();
        Map<Integer, Integer> stats = new TreeMap<>();
        for (Title title : titles) {
            stats.put(getTensOf(title.getYear()), stats.getOrDefault(getTensOf(title.getYear()), 0) + 1);
        }
        HistogramStatsDisplay histogramStatsDisplay = new HistogramStatsDisplay(new MapAxisElementBuilder(stats));
        histogramStatsDisplay.display();
    }

    private static int getTensOf(int value) {
        return value / 10 * 10;
    }
}
