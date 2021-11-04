package be.intecbrussel;

public class Bear extends MightMonster {
    private int holeNr;

    public Bear(){
        this(0, 0, 0);
    }

    public Bear(int hitPoints){
        this(hitPoints, 0);
    }

    public Bear(int hitPoints, int ragePoints){
        super(hitPoints, ragePoints);
    }

    public Bear(int holeNr, int hitPoints, int ragePoints){
        super(hitPoints, ragePoints);
        this.holeNr=holeNr;

    }

    public void bearClawAttack(){
        if(getRagePoints()>=8){
            useRP(8);
            heal(10);
            System.out.println("rooaar!");
        }else{
            System.out.println("out of ragePoints!");
        }

    }

}
