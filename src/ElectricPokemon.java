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
            case "grass" -> {
                enemy.setHp(getHp() - 20);
                System.out.println(enemy.getName() + " is a grass type and loses 20 hp. He now has " + enemy.getHp() + " left.");
            }
            case "water" -> {
                enemy.setHp(getHp() - 50);
                System.out.println(enemy.getName() + " is a water type and loses 50 hp!! He now has " + enemy.getHp() + " left.");
            }
            case "fire" -> {
                enemy.setHp(getHp() - 10);
                System.out.println(enemy.getName() + "is a fire type and loses 10 hp. He now has " + enemy.getHp() + " left.");
            }
            case "electric" -> {
                enemy.setHp(getHp() - 5);
                System.out.println(enemy.getName() + " is an electric type and loses only 5 hp. He now has " + enemy.getHp() + " left.");
            }
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
        System.out.println(getName() + " attacks " + enemy.getName() + " with thunder of 100 volt!! ~~~/~~/~~/  ");
        switch (enemy.getType()) {
            case "grass" -> {
                enemy.setHp(getHp() - 20);
                name.setHp(getHp() + 20);
                System.out.println(enemy.getName() + " is a grass type and loses 20 hp. He now has " + enemy.getHp() + " left. " + name.getName() + " gets a 20HP boost from the thunder! it's now:  " + name.getHp());
            }
            case "water" -> {
                enemy.setHp(getHp() - 50);
                name.setHp(getHp() + 20);
                System.out.println(enemy.getName() + " is a water type and loses 50 hp!! He now has " + enemy.getHp() + " left. " + name.getName() + " gets a 20HP boost from the thunder! it's now:  " + name.getHp());
            }
            case "fire" -> {
                enemy.setHp(getHp() - 10);
                name.setHp(getHp() + 20);
                System.out.println(enemy.getName() + "is a fire type and loses 10 hp. He now has " + enemy.getHp() + " left. " + name.getName() + " gets a 20HP boost from the thunder! it's now:  " + name.getHp());
            }
            case "electric" -> {
                enemy.setHp(getHp() - 5);
                name.setHp(getHp() + 20);
                System.out.println(enemy.getName() + " is an electric type and loses only 5 hp. He now has " + enemy.getHp() + " left. " + name.getName() + " gets a 20HP boost from the thunder! it's now:  " + name.getHp());
            }
        }

    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with voltTackle of 100 volt!! >>>><<<< ");
        electricAttack(enemy);
    }



}
