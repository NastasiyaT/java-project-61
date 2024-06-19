package hexlet.code.games;

import org.apache.commons.math3.util.Pair;

public interface Game {
    String getTask();
    Pair<String, String> getAssignment();
}
