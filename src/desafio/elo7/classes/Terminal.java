package desafio.elo7.classes;

public class Terminal {

    private final char[] commands = {'M', 'L', 'R'};
    private final String[] guidances = {"North, ↑", "West, ←", "South, ↓", "East, →"};

    public void moveProbe(Probe probe, char[] command){
        for (char c : command) {
            if (c == commands[0] && guidances[probe.getGuidance()] == guidances[0]) {
                int newPositionInY = (probe.getPositionInY() + 1) % 5;
                probe.setPositionInY(newPositionInY);
            }

            if (c == commands[0] && guidances[probe.getGuidance()] == guidances[1]) {
                int newPositionInX = (probe.getPositionInX() - 1) % 5;
                probe.setPositionInX(newPositionInX);
            }

            if (c == commands[0] && guidances[probe.getGuidance()] == guidances[2]) {
                int newPositionInY = (probe.getPositionInY() - 1) % 5;
                probe.setPositionInY(newPositionInY);
            }

            if (c == commands[0] && guidances[probe.getGuidance()] == guidances[3]) {
                int newPositionInX = (probe.getPositionInX() + 1) % 5;
                probe.setPositionInX(newPositionInX);
            }

            if (c == commands[1]) probe.setGuidance((probe.getGuidance() + 1) % 4);
            if (c == commands[2]) probe.setGuidance((probe.getGuidance() - 1) % 4);
        }
    }
}