package be.intecbrussel;

abstract class Monster {
    private int hitPoints;
    private int maxHP;

    public Monster(int maxHP){
        this.maxHP = maxHP;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public void heal(int h){
        hitPoints +=h;

    }
    public boolean takeDamage(int d){
        if(hitPoints <=0){
            return false;
        }else{
            hitPoints -= d;
            return true;
        }
    }
}
