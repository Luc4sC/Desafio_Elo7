package desafio.elo7.classes;

import java.util.Arrays;
import java.util.List;

public class Terminal {

    private final char[] commands = {'M', 'L', 'R'};
    private final List<String> guidances = Arrays.asList("North, ↑", "West, ←", "South, ↓", "East, →");

    public Probe moveProbe(Probe probe, char[] command){
        for (char c : command) {
            String currentGuidance = probe.getGuidance();
            int currentGuidanceInList = guidances.indexOf(currentGuidance);

            if (c == commands[0] && currentGuidanceInList == 0) {
                int newPositionInY = (probe.getPositionInY() + 1) % 6;
                probe.setPositionInY(newPositionInY);
            }

            if (c == commands[0] && currentGuidanceInList == 1) {
                int newPositionInX = (probe.getPositionInX() - 1) % 6;
                probe.setPositionInX(newPositionInX);
            }

            if (c == commands[0] && currentGuidanceInList == 2) {
                int newPositionInY = (probe.getPositionInY() - 1) % 6;
                probe.setPositionInY(newPositionInY);
            }

            if (c == commands[0] && currentGuidanceInList == 3) {
                int newPositionInX = (probe.getPositionInX() + 1) % 6;
                probe.setPositionInX(newPositionInX);
            }

            if (c == commands[1]) probe.setGuidance(guidances.get(currentGuidanceInList + 1));
            if (c == commands[2]) probe.setGuidance(guidances.get(currentGuidanceInList + 1));
        }
        return probe;
    }
}