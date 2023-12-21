import java.util.*;

public class Pokemon {

    private String name;
    private String type;
    private int energy;
    private String zmove;
    private String moveType;
    private int hp,spAtk,def,spDef,spd;

    public Pokemon(){
        name = "";
        type = "";
        energy = 0;
        zmove = "";
        moveType = "";
        hp = 0;
        spAtk = 0;
        def = 0;
        spDef = 0;
        spd = 0;
    }

    public Pokemon(String name, String type, int energy, String zmove, String moveType, int hp, int spAtk, int def, int spDef, int spd){
        this.name = name;
        this.type = type;
        this.energy = energy;
        this.zmove = zmove;
        this.moveType = moveType;
        this.hp = hp;
        this.spAtk = spAtk;
        this.def = def;
        this.spDef = spDef;
        this.spd = spd;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public int getEnergy(){
        return energy;
    }

    public String getZmove(){
        return zmove;
    }

    public String getMoveType(){
        return moveType;
    }

    public int getHp(){
        return hp;
    }

    public int getSpAtk(){
        return spAtk;
    }

    public int getDef(){
        return def;
    }

    public int getSpDef(){
        return spDef;
    }

    public int getSpd(){
        return spd;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setEnergy(int energy){
        this.energy = energy;
    }

    public void setZmove(String zmove){
        this.zmove = zmove;
    }

    public void setMoveType(String moveType){
        this.moveType = moveType;
    }

    public int setHp(int hp){
        return this.hp = hp;
    }

    public void setSpAtk(int spAtk){
        this.spAtk = spAtk;
    }

    public void setDef(int def){
        this.def = def;
    }

    public void setSpDef(int spDef){
        this.spDef = spDef;
    }

    public void setSpd(int spd){
        this.spd = spd;
    }

    public void takeDamage(String wildtype, String type, int damage, int wildhp){
    

        //If wildtype is fire and type is water, damage is doubled
        if(wildtype.equals("Fire") && type.equals("Water")){
            //Set hp to current hp - damage x 2
            wildhp = setHp(wildhp - (damage * 2));
            System.out.println("Used " + getMoveType() + "!");

            if(wildhp <= 0){
            
                wildhp = setHp(0);
                System.out.println("It's super effective!");
                System.out.println("Wild HP: " + wildhp);
                System.out.println("Wild Pokemon has fainted!");
                System.out.println("You win!");

            } else {

                wildhp = setHp(wildhp);
                System.out.println("It's super effective!");
                System.out.println("Wild HP: " + wildhp);

            }
        }else if(wildtype.equals("Fire") && type.equals("Grass")){

            wildhp = setHp(wildhp - (damage / 2));
            System.out.println("Used " + getMoveType() + "!");

            if(wildhp <= 0){
            
                wildhp = setHp(0);
                System.out.println("It's not very effective...");
                System.out.println("Wild HP: " + wildhp);
                System.out.println("Wild Pokemon has fainted!");
                System.out.println("You win!");

            } else {

                wildhp = setHp(wildhp);
                System.out.println("It's not very effective...");
                System.out.println("Wild HP: " + wildhp);

            }
        }else if(wildtype.equals("Fire") && type.equals("Fire")){

            wildhp = setHp(wildhp - damage);
            System.out.println("Used " + getMoveType() + "!");

            if(wildhp <= 0){
            
                wildhp = setHp(0);
                System.out.println("It's effective!");
                System.out.println("Wild HP: " + wildhp);
                System.out.println("Wild Pokemon has fainted!");
                System.out.println("You win!");

            } else {

                wildhp = setHp(wildhp);
                System.out.println("It's effective!");
                System.out.println("Wild HP: " + wildhp);

            }
        //If wildtype is water and type is fire, damage is halved
        }else if(wildtype.equals("Water") && type.equals("Fire")){

            wildhp = setHp(wildhp - (damage / 2));
            System.out.println("Used " + getMoveType() + "!");

            if(wildhp <= 0){
            
                setHp(0);
                System.out.println("It's not very effective...");
                System.out.println("Wild HP: " + wildhp);
                System.out.println("Wild Pokemon has fainted!");
                System.out.println("You win!");

            } else {

                wildhp = setHp(wildhp);
                System.out.println("It's not very effective...");
                System.out.println("Wild HP: " + wildhp);

            }
        }else if(wildtype.equals("Water") && type.equals("Grass")){

            wildhp = setHp(wildhp - (damage * 2));
            System.out.println("Used " + getMoveType() + "!");

            if(wildhp <= 0){
            
                setHp(0);
                System.out.println("It's super effective!");
                System.out.println("Wild HP: " + wildhp);
                System.out.println("Wild Pokemon has fainted!");
                System.out.println("You win!");

            } else {

                wildhp = setHp(wildhp);
                System.out.println("It's super effective!");
                System.out.println("Wild HP: " + wildhp);

            }
        }else if(wildtype.equals("Water") && type.equals("Water")){

            wildhp = setHp(wildhp - damage);
            System.out.println("Used " + getMoveType() + "!");

            if(wildhp <= 0){
            
                wildhp = setHp(0);
                System.out.println("It's effective!");
                System.out.println("Wild HP: " + wildhp);
                System.out.println("Wild Pokemon has fainted!");
                System.out.println("You win!");

            } else {

                wildhp = setHp(wildhp);
                System.out.println("It's effective!");
                System.out.println("Wild HP: " + wildhp);

            }
        }else if(wildtype.equals("Grass") && type.equals("Fire")){

            wildhp = setHp(wildhp - (damage * 2));
            System.out.println("Used " + getMoveType() + "!");

            if(wildhp <= 0){
            
                wildhp = setHp(0);
                System.out.println("It's super effective!");
                System.out.println("Wild HP: " + wildhp);
                System.out.println("Wild Pokemon has fainted!");
                System.out.println("You win!");

            } else {

                wildhp = setHp(wildhp);
                System.out.println("It's super effective!");
                System.out.println("Wild HP: " + wildhp);

            }
        }else if(wildtype.equals("Grass") && type.equals("Water")){

            wildhp = setHp(wildhp - (damage / 2));
            System.out.println("Used " + getMoveType() + "!");

            if(wildhp <= 0){
            
                wildhp = setHp(0);
                System.out.println("It's not very effective...");
                System.out.println("Wild HP: " + wildhp);
                System.out.println("Wild Pokemon has fainted!");
                System.out.println("You win!");

            } else {

                wildhp = setHp(wildhp);
                System.out.println("It's not very effective...");
                System.out.println("Wild HP: " + wildhp);

            }
        }else if(wildtype.equals("Grass") && type.equals("Grass")){

            wildhp = setHp(wildhp - damage);
            System.out.println("Used " + getMoveType() + "!");

            if(wildhp <= 0){
            
                wildhp = setHp(0);
                System.out.println("It's effective!");
                System.out.println("Wild HP: " + wildhp);
                System.out.println("Wild Pokemon has fainted!");
                System.out.println("You win!");

            } else {

                wildhp = setHp(wildhp);
                System.out.println("It's effective!");
                System.out.println("Wild HP: " + wildhp);

            }
        }
    }

    public String toString(){
    
        return "Name: " + getName() + "\nType: " + getType() + "\nEnergy: " + getEnergy() + "\nZ-Move: " + getZmove() + "\nMove Type: " + getMoveType() + "\nHP: " + getHp() + "\nSp. Atk: " + getSpAtk() + "\nDef: " + getDef() + "\nSp. Def: " + getSpDef() + "\nSpd: " + getSpd();
    }


}
