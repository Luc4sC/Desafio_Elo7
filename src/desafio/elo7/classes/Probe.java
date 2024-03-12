package desafio.elo7.classes;

public class Probe {

    private int positionInX = 0;
    private int positionInY = 0;
    private int guidance = 0;

    public int getPositionInX() {
        if(this.positionInX < 0) this.positionInX = this.positionInX * -4 % 5;
        return this.positionInX;
    }

    public int getPositionInY() {
        if(this.positionInY < 0) this.positionInY = this.positionInY  * -4 % 5;
        return this.positionInY;
    }

    public int getGuidance() {
        if(this.guidance < 0) this.guidance = this.guidance * -3 % 5;
        return this.guidance;
    }

    public void setPositionInX(int x){
        this.positionInX = x;
    }

    public void setPositionInY(int positionInY) {
        this.positionInY = positionInY;
    }

    public void setGuidance(int guidance) {
        this.guidance = guidance;
    }

    @Override
    public String toString() {
        String[] guidances = {"North, ↑", "West, ←", "South, ↓", "East, →"};
        return "X = " + (getPositionInX() + 1)  + " Y = " + (getPositionInY() + 1) +
                " " + guidances[getGuidance()];
    }
}
