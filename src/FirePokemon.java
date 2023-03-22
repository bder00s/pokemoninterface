import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private String type = "fire";

    List<String> attacks = Arrays.asList("firelash", "flamethrower", "pyroball", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);


    }

    public FirePokemon(String name, int level, int hp, String food, String sound, String type) {
        super(name, level, hp, food, sound);
        this.type = type;
    }

    List<String> getAttacks() {
        return attacks;
    }

    public String getType() {
        return type;
    }

    public void fireAttack(Pokemon enemy) {
        switch (enemy.getType()) {
            case "grass" -> {
                enemy.setHp(getHp() - 50);
                System.out.println(enemy.getName() + " is a grass type and loses 50 hp!! He now has " + enemy.getHp() + " left.");
            }
            case "water" -> {
                enemy.setHp(getHp() - 20);
                System.out.println(enemy.getName() + " is a water type and loses 20 hp. He now has " + enemy.getHp() + " left.");
            }
            case "fire" -> {
                enemy.setHp(getHp() - 5);
                System.out.println(enemy.getName() + "is also a fire type and loses only 5 hp. He now has " + enemy.getHp() + " left.");
            }
            case "electric" -> {
                enemy.setHp(getHp() - 10);
                System.out.println(enemy.getName() + " is an electric type and loses 10 hp. He now has " + enemy.getHp() + " left.");
            }
        }
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with firelash! /^/^/^/^ ");
        fireAttack(enemy);
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with flameThrower! >>>>> ^^^^  ");
        fireAttack(enemy);
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with pyroBall! ^^^O^^^ ");
        fireAttack(enemy);
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with inferno! ^^^^^^ ");
        fireAttack(enemy);
    }

}
