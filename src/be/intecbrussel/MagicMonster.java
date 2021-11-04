package be.intecbrussel;

abstract class MagicMonster extends Monster{
    private int magicPoints;
    private int maxMP;


    public MagicMonster(int maxMP, int maxHP){
        super(maxHP);
        this.maxMP = maxMP;

    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    public void restoreMP(int h){
        while(maxMP >= magicPoints){
            magicPoints +=h;
        }
    }

    public boolean useMP(int d ){
        if(d>= magicPoints){
            magicPoints -= d;
            return true;
        }else {
            return false;
        }
    }
}
