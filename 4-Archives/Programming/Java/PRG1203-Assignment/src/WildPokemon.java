import java.util.*;

public class WildPokemon extends Pokemon {

    public WildPokemon(){
        super();
    }

    public WildPokemon(String name, String type, int energy, String zmove,
            String moveType, int hp, int spAtk, int def, int spDef, int spd){

        super(name, type, energy, zmove, moveType, hp, spAtk, def, spDef, spd);

    }

    public void takeDamage(String type, String wildtype, int damage, int yourhp){

    
        if(type.equals("Grass") && wildtype.equals("Fire")){

            yourhp = setHp(yourhp - (damage * 2));
            System.out.println("Used " + getMoveType() + "!");

            if(yourhp <= 0){

                yourhp = setHp(0);
                System.out.println("It's super effective!");
                System.out.println("Your HP: " + yourhp);
                System.out.println("Your Pokemon fainted!");
                System.out.println("You lose!");
                System.out.println("Game Over!");

            } else {

                yourhp = setHp(yourhp);
                System.out.println("It's super effective!");
                System.out.println("Your HP: " + yourhp);

            }
        } else if(type.equals("Water") && wildtype.equals("Fire")){
             yourhp = setHp(yourhp - (damage / 2));
             System.out.println("Used " + getMoveType() + "!");

            if(yourhp <= 0){

                yourhp = setHp(0);
                System.out.println("It's not very effective...");
                System.out.println("Your HP: " + yourhp);
                System.out.println("Your Pokemon fainted!");
                System.out.println("You lose!");
                System.out.println("Game Over!");

            } else {

                yourhp = setHp(yourhp);
                System.out.println("It's not very effective...");
                System.out.println("Your HP: " + yourhp);


            }
        }else if(type.equals("Fire") && wildtype.equals("Water")){

            yourhp = setHp(yourhp - (damage * 2));
            System.out.println("Used " + getMoveType() + "!");

            if(yourhp <= 0){

                yourhp = setHp(0);
                System.out.println("It's super effective!");
                System.out.println("Your HP: " + yourhp);
                System.out.println("Your Pokemon fainted!");
                System.out.println("You lose!");
                System.out.println("Game Over!");

            } else {

                yourhp = setHp(yourhp);
                System.out.println("It's super effective!");
                System.out.println("Your HP: " + yourhp);

            }
        }else if(type.equals("Grass") && wildtype.equals("Water")){

            yourhp = setHp(yourhp - (damage / 2));
            System.out.println("Used " + getMoveType() + "!");

            if(yourhp <= 0){

                yourhp = setHp(0);
                System.out.println("It's not very effective...");
                System.out.println("Your HP: " + yourhp);
                System.out.println("Your Pokemon fainted!");
                System.out.println("You lose!");
                System.out.println("Game Over!");

            } else {

                yourhp = setHp(yourhp);
                System.out.println("It's not very effective...");
                System.out.println("Your HP: " + yourhp);

            }
        }else if(type.equals("Water") && wildtype.equals("Grass")){

            yourhp = setHp(yourhp - (damage * 2));
            System.out.println("Used " + getMoveType() + "!");

            if(yourhp <= 0){

                yourhp = setHp(0);
                System.out.println("It's super effective!");
                System.out.println("Your HP: " + yourhp);
                System.out.println("Your Pokemon fainted!");
                System.out.println("You lose!");
                System.out.println("Game Over!");

            } else {

                yourhp = setHp(yourhp);
                System.out.println("It's super effective!");
                System.out.println("Your HP: " + yourhp);

            }
        }else if(type.equals("Fire") && wildtype.equals("Grass")){

            yourhp = setHp(yourhp - (damage / 2));
            System.out.println("Used " + getMoveType() + "!");

            if(yourhp <= 0){

                yourhp = setHp(0);
                System.out.println("It's not very effective...");
                System.out.println("Your HP: " + yourhp);
                System.out.println("Your Pokemon fainted!");
                System.out.println("You lose!");
                System.out.println("Game Over!");

            } else {

                yourhp = setHp(yourhp);
                System.out.println("It's not very effective...");
                System.out.println("Your HP: " + yourhp);

            }
        }else if(type.equals("Fire") && wildtype.equals("Fire")){

            yourhp = setHp(yourhp - damage);
            System.out.println("Used " + getMoveType() + "!");

            if(yourhp <= 0){

                yourhp = setHp(0);
                System.out.println("It's effective!");
                System.out.println("Your HP: " + yourhp);
                System.out.println("Your Pokemon fainted!");
                System.out.println("You lose!");
                System.out.println("Game Over!");

            } else {

                yourhp = setHp(yourhp);
                System.out.println("It's effective!");
                System.out.println("Your HP: " + yourhp);

            }
        }else if(type.equals("Water") && wildtype.equals("Water")){

            yourhp = setHp(yourhp - damage);
            System.out.println("Used " + getMoveType() + "!");

            if(yourhp <= 0){

                yourhp = setHp(0);
                System.out.println("It's effective!");
                System.out.println("Your HP: " + yourhp);
                System.out.println("Your Pokemon fainted!");
                System.out.println("You lose!");
                System.out.println("Game Over!");

            } else {

                yourhp = setHp(yourhp);
                System.out.println("It's effective!");
                System.out.println("Your HP: " + yourhp);

            }
        }else if(type.equals("Grass") && wildtype.equals("Grass")){

            yourhp = setHp(yourhp - damage);
            System.out.println("Used " + getMoveType() + "!");

            if(yourhp <= 0){

                yourhp = setHp(0);
                System.out.println("It's effective!");
                System.out.println("Your HP: " + yourhp);
                System.out.println("Your Pokemon fainted!");
                System.out.println("You lose!");
                System.out.println("Game Over!");

            } else {

                yourhp = setHp(yourhp);
                System.out.println("It's effective!");
                System.out.println("Your HP: " + yourhp);

            }
        }

    }

    public String toString(){
        return super.toString();
    }
}
