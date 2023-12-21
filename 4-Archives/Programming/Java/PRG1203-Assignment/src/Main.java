import java.util.*;

public class Main {

    public static void main(String[] args){

        int menuChoice = 0;
        int battleChoice = 0;
        int wildChoice = 0;
        int battleTurn = 0;
    
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        String[] pokemonName1 = {"Bulbasaur", "Charmander", "Squirtle"};
        String rpName1 = pokemonName1[rand.nextInt(pokemonName1.length)];
        String[] pokemonName2 = {"Bulbasaur", "Charmander", "Squirtle"};
        String rpName2 = pokemonName2[rand.nextInt(pokemonName2.length)];
        String[] pokemonName3 = {"Bulbasaur", "Charmander", "Squirtle"};
        String rpName3 = pokemonName3[rand.nextInt(pokemonName3.length)];
        String[] pokemonType1 = {"Grass", "Fire", "Water"};
        String rpType1 = pokemonType1[rand.nextInt(pokemonType1.length)];
        String[] pokemonType2 = {"Grass", "Fire", "Water"};
        String rpType2 = pokemonType2[rand.nextInt(pokemonType2.length)];
        String[] pokemonType3 = {"Grass", "Fire", "Water"};
        String rpType3 = pokemonType3[rand.nextInt(pokemonType3.length)];
        String[] pokeMoveType1 = {"Vine Whip", "Ember", "Water Gun"};
        String rpMoveType1 = pokeMoveType1[rand.nextInt(pokeMoveType1.length)];
        String[] pokeMoveType2 = {"Vine Whip", "Ember", "Water Gun"};
        String rpMoveType2 = pokeMoveType2[rand.nextInt(pokeMoveType2.length)];
        String[] pokeMoveType3 = {"Vine Whip", "Ember", "Water Gun"};
        String rpMoveType3 = pokeMoveType3[rand.nextInt(pokeMoveType3.length)];
        String[] pokeZMoveType1 = {"Giga Drain", "Fire Blast", "Hydro Pump"};
        String rpZMoveType1 = pokeZMoveType1[rand.nextInt(pokeZMoveType1.length)];
        String[] pokeZMoveType2 = {"Giga Drain", "Fire Blast", "Hydro Pump"};
        String rpZMoveType2 = pokeZMoveType2[rand.nextInt(pokeZMoveType2.length)];
        String[] pokeZMoveType3 = {"Giga Drain", "Fire Blast", "Hydro Pump"};
        String rpZMoveType3 = pokeZMoveType3[rand.nextInt(pokeZMoveType3.length)];


        int rgEnergy1 = rand.nextInt(1,100);
        int rgEnergy2 = rand.nextInt(1,100);
        int rgEnergy3 = rand.nextInt(1,100);
        int rgHP1 = rand.nextInt(1,100);
        int rgHP2 = rand.nextInt(1,100);
        int rgHP3 = rand.nextInt(1,100);
        int rgSpAtk1 = rand.nextInt(1,100);
        int rgSpAtk2 = rand.nextInt(1,100);
        int rgSpAtk3 = rand.nextInt(1,100);
        int rgDef1 = rand.nextInt(1,100);
        int rgDef2 = rand.nextInt(1,100);
        int rgDef3 = rand.nextInt(1,100);
        int rgSpDef1 = rand.nextInt(1,100);
        int rgSpDef2 = rand.nextInt(1,100);
        int rgSpDef3 = rand.nextInt(1,100);
        int rgSpeed1 = rand.nextInt(1,100);
        int rgSpeed2 = rand.nextInt(1,100);
        int rgSpeed3 = rand.nextInt(1,100);

        int rgEnergy4 = rand.nextInt(1,100);
        int rgEnergy5 = rand.nextInt(1,100);
        int rgEnergy6 = rand.nextInt(1,100);
        int rgHP4 = rand.nextInt(1,100);
        int rgHP5 = rand.nextInt(1,100);
        int rgHP6 = rand.nextInt(1,100);
        int rgSpAtk4 = rand.nextInt(1,100);
        int rgSpAtk5 = rand.nextInt(1,100);
        int rgSpAtk6 = rand.nextInt(1,100);
        int rgDef4 = rand.nextInt(1,100);
        int rgDef5 = rand.nextInt(1,100);
        int rgDef6 = rand.nextInt(1,100);
        int rgSpDef4 = rand.nextInt(1,100);
        int rgSpDef5 = rand.nextInt(1,100);
        int rgSpDef6 = rand.nextInt(1,100);
        int rgSpeed4 = rand.nextInt(1,100);
        int rgSpeed5 = rand.nextInt(1,100);
        int rgSpeed6 = rand.nextInt(1,100);



        //Pokemon Objects will change in the future.
        Pokemon pokemon1 = new Pokemon(rpName1, rpType1, rgEnergy1, rpZMoveType1, rpMoveType1, 
                rgHP1, rgSpAtk1, rgDef1, rgSpDef1, rgSpeed1);
        Pokemon pokemon2 = new Pokemon(rpName2, rpType2, rgEnergy2, rpZMoveType2, rpMoveType2, rgHP2,
                rgSpAtk2, rgDef2, rgSpDef2, rgSpeed2);
        Pokemon pokemon3 = new Pokemon(rpName3, rpType3, rgEnergy3, rpZMoveType3, rpMoveType3, 
                rgHP3, rgSpAtk3, rgDef3, rgSpDef3, rgSpeed3);
        WildPokemon pokemon4 = new WildPokemon(rpName1, rpType1, rgEnergy4, rpZMoveType1, rpMoveType1, 
                rgHP4, rgSpAtk4, rgDef4, rgSpDef4, rgSpeed4);
        WildPokemon pokemon5 = new WildPokemon(rpName2, rpType2, rgEnergy5, rpZMoveType2, rpMoveType2, rgHP5,
                rgSpAtk5, rgDef5, rgSpDef5, rgSpeed5);
        WildPokemon pokemon6 = new WildPokemon(rpName3, rpType3, rgEnergy6, rpZMoveType3, rpMoveType3,
                rgHP6, rgSpAtk6, rgDef6, rgSpDef6, rgSpeed6);

        //Menu
        do{
            //ASCII Art Menu
            System.out.println(" _____  __ ____ _____   ______   __ __   _____  _____  _____  _____  _____  _____  _____  _____  ");
            System.out.println("|  ___`|__|___/|___/_| |______| |_| |_|  _____  _____  _____  _____  _____  _____  _____  _____  ");
            System.out.println("| |___]|__|__/ |__/__/   /___/  |_|_|_|  _____  _____  _____  _____  _____  _____  _____  _____  ");
            System.out.println("|  ___] |___|  |__ __   /__/    |_____|  _____  _____  _____  _____  _____  _____  _____  _____  ");
            System.out.println("| |___] |___|  |__/__| |__/___  |_| |_|  _____  _____  _____  _____  _____  _____  _____  _____  ");                                    
            System.out.println("|_____/ |___|  |_/___| |______| |_| |_|  _____  _____  _____  _____  _____  _____  _____  _____  ");                                                     
            System.out.println(" 23018039 / Chew Zhan Hong / Sunway University ");
            System.out.println(" _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
            System.out.println("Welcome to the NotPokemon Ga-Ole CLI!");
            System.out.println("1. Start Battle");
            System.out.println("2. Exit");
            System.out.println(" _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
            System.out.println("Please enter your choice: ");

            menuChoice = input.nextInt();

            switch(menuChoice){
            
                case 1:
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.println("Battle Start!");
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    battleChoice = 0;
                    wildChoice = 0;
                    battleTurn = 0;
                    break;
                case 2:
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.println("Exiting...");
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    battleChoice = 4;
                    wildChoice = 4;
                    battleTurn = 2;
                    break;

                default:
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    menuChoice = 0;
                    battleChoice = 4;
                    wildChoice = 4;
                    battleTurn = 2;
                    break;
                }


            while(battleChoice != 4){
           
                System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                System.out.println("1. " + pokemon1.getName());
                System.out.println("2. " + pokemon2.getName());
                System.out.println("3. " + pokemon3.getName());
                System.out.println("4. Exit");
                System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                System.out.println("Please select your Pokemon: ");
                battleChoice = input.nextInt();

                if(battleChoice == 1){
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.println("You have chosen " + pokemon1.getName() + "!");
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.printf("%s\n", pokemon1.toString());
                    break;
                }else if(battleChoice == 2){
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.println("You have chosen " + pokemon2.getName() + "!");
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.printf("%s\n", pokemon2.toString());
                    break;
                }else if(battleChoice == 3){
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.println("You have chosen " + pokemon3.getName() + "!");
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.printf("%s\n", pokemon3.toString());
                    break;
                }else if(battleChoice == 4){
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.println("Exiting...");
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    battleChoice = 4;
                    wildChoice = 4;
                    battleTurn = 2;
                }else{
                    System.out.println("Invalid choice. Please try again.");
                }
            }

            while(wildChoice != 4){

                System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                System.out.println("1. " + pokemon4.getName());
                System.out.println("2. " + pokemon5.getName());
                System.out.println("3. " + pokemon6.getName());
                System.out.println("4. Exit");
                System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                System.out.println("Please select a wild Pokemon: ");
                wildChoice = input.nextInt();

                if(wildChoice == 1){
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.println("You have chosen " + pokemon4.getName() + "!");
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.printf("%s\n", pokemon4.toString());
                    break;
                }else if(wildChoice == 2){
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.println("You have chosen " + pokemon5.getName() + "!");
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.printf("%s\n", pokemon5.toString());
                    break;
                }else if(wildChoice == 3){
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.println("You have chosen " + pokemon6.getName() + "!");
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.printf("%s\n", pokemon6.toString());
                    break;
                }else if(wildChoice == 4){
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.println("Exiting...");
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    battleChoice = 4;
                    wildChoice = 4;
                    battleTurn = 2;
                }else{
                    System.out.println("Invalid choice. Please try again.");
                }

            }

            while(battleTurn != 2){

                System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                System.out.println("1. Attack");
                System.out.println("2. Exit");
                System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                System.out.println("What will you do?");
                battleTurn = input.nextInt();

                if(battleTurn == 1 && battleChoice == 1 && wildChoice == 1){

                    if(pokemon4.getHp() > 0){

                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("You have chosen to attack!");
                        pokemon1.takeDamage(pokemon4.getType(),pokemon1.getType(),pokemon1.getEnergy(),pokemon4.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    
                    }

                    if(pokemon1.getHp() > 0){

                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("The wild Pokemon has attacked!");
                        pokemon4.takeDamage(pokemon1.getType(),pokemon4.getType(),pokemon4.getEnergy(),pokemon1.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    
                    }

                    if(pokemon4.getHp() <= 0 || pokemon1.getHp() <= 0){

                        battleChoice = 4;
                        wildChoice = 4;
                        battleTurn = 2;

                    }

                }else if(battleTurn == 1 && battleChoice == 1 && wildChoice == 2){

                    if(pokemon1.getHp() > 0){

                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("You have chosen to attack!");
                        pokemon1.takeDamage(pokemon5.getType(),pokemon1.getType(),pokemon1.getEnergy(),pokemon5.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    
                    }

                    if(pokemon5.getHp() > 0){

                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("The wild Pokemon has attacked!");
                        pokemon5.takeDamage(pokemon1.getType(),pokemon5.getType(),pokemon5.getEnergy(),pokemon1.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    
                    }

                    if(pokemon5.getHp() <= 0 || pokemon1.getHp() <= 0){

                        battleChoice = 4;
                        wildChoice = 4;
                        battleTurn = 2;

                    }


                }else if(battleTurn == 1 && battleChoice == 1 && wildChoice == 3){

                    if(pokemon1.getHp() > 0){

                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("You have chosen to attack!");
                        pokemon1.takeDamage(pokemon6.getType(),pokemon1.getType(),pokemon1.getEnergy(),pokemon6.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    
                    }

                    if(pokemon6.getHp() > 0){

                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("The wild Pokemon has attacked!");
                        pokemon6.takeDamage(pokemon1.getType(),pokemon6.getType(),pokemon6.getEnergy(),pokemon1.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    
                    }

                    if(pokemon6.getHp() <= 0 || pokemon1.getHp() <= 0){

                        battleChoice = 4;
                        wildChoice = 4;
                        battleTurn = 2;

                    }

                }else if(battleTurn == 1 && battleChoice == 2 && wildChoice == 1){

                    if(pokemon2.getHp() > 0){
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("You have chosen to attack!");
                        pokemon2.takeDamage(pokemon4.getType(),pokemon2.getType(),pokemon2.getEnergy(),pokemon4.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    }

                    if(pokemon4.getHp() > 0){
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("The wild Pokemon has attacked!");
                        pokemon4.takeDamage(pokemon2.getType(),pokemon4.getType(),pokemon4.getEnergy(),pokemon2.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    }

                    if(pokemon4.getHp() <= 0 || pokemon2.getHp() <= 0){

                        battleChoice = 4;
                        wildChoice = 4;
                        battleTurn = 2;

                    }

                }else if(battleTurn == 1 && battleChoice == 2 && wildChoice == 2){

                    if(pokemon2.getHp() > 0){
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("You have chosen to attack!");
                        pokemon2.takeDamage(pokemon5.getType(),pokemon2.getType(),pokemon2.getEnergy(),pokemon5.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    }

                    if(pokemon5.getHp() > 0){
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("The wild Pokemon has attacked!");
                        pokemon5.takeDamage(pokemon2.getType(),pokemon5.getType(),pokemon5.getEnergy(),pokemon2.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    }

                    if(pokemon5.getHp() <= 0 || pokemon2.getHp() <= 0){

                        battleChoice = 4;
                        wildChoice = 4;
                        battleTurn = 2;

                    }

                }else if(battleTurn == 1 && battleChoice == 2 && wildChoice == 3){

                    if(pokemon2.getHp() > 0){
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("You have chosen to attack!");
                        pokemon2.takeDamage(pokemon6.getType(),pokemon2.getType(),pokemon2.getEnergy(),pokemon6.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    }

                    if(pokemon6.getHp() > 0){
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("The wild Pokemon has attacked!");
                        pokemon6.takeDamage(pokemon2.getType(),pokemon6.getType(),pokemon6.getEnergy(),pokemon2.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    }

                    if(pokemon6.getHp() <= 0 || pokemon2.getHp() <= 0){

                        battleChoice = 4;
                        wildChoice = 4;
                        battleTurn = 2;

                    }

                }else if(battleTurn == 1 && battleChoice == 3 && wildChoice == 1){

                    if(pokemon3.getHp() > 0){
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("You have chosen to attack!");
                        pokemon3.takeDamage(pokemon4.getType(),pokemon3.getType(),pokemon3.getEnergy(),pokemon4.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    }

                    if(pokemon4.getHp() > 0){
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("The wild Pokemon has attacked!");
                        pokemon4.takeDamage(pokemon3.getType(),pokemon4.getType(),pokemon4.getEnergy(),pokemon3.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    }

                    if(pokemon4.getHp() <= 0 || pokemon3.getHp() <= 0){

                        battleChoice = 4;
                        wildChoice = 4;
                        battleTurn = 2;

                    }

                }else if(battleTurn == 1 && battleChoice == 3 && wildChoice == 2){

                    if(pokemon3.getHp() > 0){
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("You have chosen to attack!");
                        pokemon3.takeDamage(pokemon5.getType(),pokemon3.getType(),pokemon3.getEnergy(),pokemon5.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    }

                    if(pokemon5.getHp() > 0){
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("The wild Pokemon has attacked!");
                        pokemon5.takeDamage(pokemon3.getType(),pokemon5.getType(),pokemon5.getEnergy(),pokemon3.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    }

                    if(pokemon5.getHp() <= 0 || pokemon3.getHp() <= 0){

                        battleChoice = 4;
                        wildChoice = 4;
                        battleTurn = 2;

                    }

                }else if(battleTurn == 1 && battleChoice == 3 && wildChoice == 3){

                    if(pokemon3.getHp() > 0){
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("You have chosen to attack!");
                        pokemon3.takeDamage(pokemon6.getType(),pokemon3.getType(),pokemon3.getEnergy(),pokemon6.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    }

                    if(pokemon6.getHp() > 0){
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                        System.out.println("The wild Pokemon has attacked!");
                        pokemon6.takeDamage(pokemon3.getType(),pokemon6.getType(),pokemon6.getEnergy(),pokemon3.getHp());
                        System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    }

                    if(pokemon6.getHp() <= 0 || pokemon3.getHp() <= 0){

                        battleChoice = 4;
                        wildChoice = 4;
                        battleTurn = 2;

                    }

                }else if(battleTurn == 2){
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    System.out.println("Exiting...");
                    System.out.println("_____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  ");
                    battleChoice = 4;
                    wildChoice = 4;
                    battleTurn = 2;
                }else{
                    System.out.println("Invalid choice. Please try again.");
                }

            }
            
        }while(menuChoice != 2);

    }
}
