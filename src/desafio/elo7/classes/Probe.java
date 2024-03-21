package desafio.elo7.classes;

public class Probe {

    private final int[] position = {1,1};
    private String guidance = "North, ↑";

    public int getPositionInX() {
        if(this.position[0] == 0) this.position[0] = 5;
        if(this.position[0] < 0) this.position[0] = this.position[0] * -5 % 6;
        return this.position[0];
    }

    public int getPositionInY() {
        if(this.position[1] == 0) this.position[1] = 5;
        if(this.position[1] < 0) this.position[1] = this.position[1]  * -5 % 6;
        return this.position[1];
    }

    public String getGuidance() {
        return this.guidance;
    }

    public void setPositionInX(int x){
        this.position[0] = x;
    }

    public void setPositionInY(int y) {
        this.position[1] = y;
    }

    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    @Override
    public String toString() {
        return "X = " + getPositionInX() + " Y = " + getPositionInY() +
                " " + getGuidance();
    }
}
