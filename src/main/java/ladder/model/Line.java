package ladder.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Line {
    private List<Boolean> points;

    public Line(int countOfPlayer) {
        this.points=this.pointsInit(countOfPlayer);
    }

    private List<Boolean> pointsInit(int countOfPlayer) {
        return new ArrayList<>(Arrays.asList(new Boolean[countOfPlayer-1]));
    }

    public int size() {
        return this.points.size();
    }
}
