package be.intecbrussel;

public class Witch extends MagicMonster {
    private String name;

    public Witch(){
        this(null, 0, 0);
    }

    public Witch(int hitPoints, int magicPoints){
        super(hitPoints, magicPoints);
    }

    public Witch(String name, int hitPoints, int magicPoints){
        super(hitPoints, magicPoints);
        this.name= name;
    }

    public void fireballAttack(){
        if(getMagicPoints()>=5){
            useMP(5);
            heal(8);
            System.out.println("fwooosh!!");
        }else{
            System.out.println("out of magic points");
        }
    }
}
