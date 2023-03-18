import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private String type = "electric";

    List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");


    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);


    }

    List<String> getAttacks() {
        return attacks;
    }

    public String getType() {
        return type;
    }

    public void electricAttack(Pokemon enemy) {
        switch (enemy.getType()) {
            case "grass" ->
                    System.out.println(enemy.getName() + " is a grass type and loses 20 hp. He now has " + (enemy.getHp() - 20) + " left.");
            case "water" ->
                    System.out.println(enemy.getName() + " is a water type and loses 50 hp!! He now has " + (enemy.getHp() - 50) + " left.");
            case "fire" ->
                    System.out.println(enemy.getName() + "is a fire type and loses 10 hp. He now has " + (enemy.getHp() - 10) + " left.");
            case "electric" ->
                    System.out.println(enemy.getName() + " is an electric type and loses only 5 hp. He now has " + (enemy.getHp() - 5) + " left.");
        }
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with thunderpunch! ////\\\\ ");
        electricAttack(enemy);
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with electroBall! <<O>> ");
        electricAttack(enemy);
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with thunder! ~~~/~~/~~/ ");
        switch (enemy.getType()) {
            case "grass" ->
                    System.out.println(enemy.getName() + " is a grass type and loses 20 hp. He now has " + (enemy.getHp() - 20) + " left. " + name.getName() + " gets a 20HP boost from the thunder! it's now:  " + (name.getHp() + 20));
            case "water" ->
                    System.out.println(enemy.getName() + " is a water type and loses 50 hp!! He now has " + (enemy.getHp() - 50) + " left. " + name.getName() + " gets a 20HP boost from the thunder! it's now:  " + (name.getHp() + 20));
            case "fire" ->
                    System.out.println(enemy.getName() + "is a fire type and loses 10 hp. He now has " + (enemy.getHp() - 10) + " left. " + name.getName() + " gets a 20HP boost from the thunder! it's now:  " + (name.getHp() + 20));
            case "electric" ->
                    System.out.println(enemy.getName() + " is an electric type and loses only 5 hp. He now has " + (enemy.getHp() - 5) + " left. " + name.getName() + " gets a 20HP boost from the thunder! it's now:  " + (name.getHp() + 20));
        }

    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with voltTackle! >>>><<<< ");
        electricAttack(enemy);
    }

}
