package be.intecbrussel;

abstract class MightMonster extends Monster {
    private int ragePoints;
    private int maxRP;

    public MightMonster(int maxRP, int maxHP){
        super(maxHP);
        this.maxRP = maxHP;

    }

    public int getRagePoints() {
        return ragePoints;
    }

    public void setRagePoints(int ragePoints) {
        this.ragePoints = ragePoints;
    }

    public void restoreRP(int h){
        while(maxRP >= ragePoints){
            ragePoints +=h;
        }
        ragePoints +=h;
    }

    public boolean useRP (int d){
        if(d>= ragePoints){
            ragePoints -= d;
            return true;
        }else {
            return false;
        }
    }
}
