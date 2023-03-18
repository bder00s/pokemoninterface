import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

private String type = "fire";
    List<String> attacks = Arrays.asList("firelash", "flamethrower", "pyroball", "inferno" );

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);


    }

    List<String>getAttacks() {
        return attacks;
    }

    public String getType() {
        return type;
    }

    public void fireAttack(Pokemon enemy){
        switch (enemy.getType()) {
            case "grass" ->
                    System.out.println(enemy.getName() + " is a grass type and loses 50 hp!! He now has " + (enemy.getHp() - 50) + " left.");
            case "water" ->
                    System.out.println(enemy.getName() + " is a water type and loses 20 hp. He now has " + (enemy.getHp() - 20) + " left.");
            case "fire" ->
                    System.out.println(enemy.getName() + "is also a fire type and loses only 5 hp. He now has " + (enemy.getHp() - 5) + " left.");
            case "electric" ->
                    System.out.println(enemy.getName() + " is an electric type and loses 10 hp. He now has " + (enemy.getHp() - 10) + " left.");
        }
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with firelash! /^/^/^/^ ");
        fireAttack(enemy);
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with flameThrower! »»»»»»» ^^^^  ");
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
