import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private String type = "water";

    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    List<String>getAttacks() {
        return attacks;
    }

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);

    }

    public String getType() {
        return type;
    }

    public void waterAttack(Pokemon enemy){
        switch (enemy.getType()) {
            case "grass" ->
                    System.out.println(enemy.getName() + " is a grass type and loses 10 hp. He now has " + (enemy.getHp() - 10) + " left.");
            case "water" ->
                    System.out.println(enemy.getName() + " is also a water type and only loses 5 hp.  He now has " + (enemy.getHp() - 5) + " left.");
            case "fire" ->
                    System.out.println(enemy.getName() + "is a fire type and loses 50 hp!! He now has " + (enemy.getHp() - 50) + " left.");
            case "electric" ->
                    System.out.println(enemy.getName() + " is an electric type and loses 20 hp. He now has " + (enemy.getHp() - 20) + " left.");
        }
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with surfing! ~ ~ ~ ~ ~ ");
        waterAttack(enemy);
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with hydroPump! <~~~~ ");
        waterAttack(enemy);
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with hydroCanon! @@@@@@> ");
        waterAttack(enemy);
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " raindance '```'`'`''`'`'`'`'");
        switch (enemy.getType()) {
            case "grass" ->
                    System.out.println(enemy.getName() + " is a grass type and gains hp from the raindance!" + (enemy.getName() + 10));
            case "water" ->
                    System.out.println(enemy.getName() + " is also a water type and only loses 5 hp.  He now has " + (enemy.getHp() - 5) + " left.");
            case "fire" ->
                    System.out.println(enemy.getName() + "is a fire type and loses 50 hp!! He now has " + (enemy.getHp() - 50) + " left.");
            case "electric" ->
                    System.out.println(enemy.getName() + " is an electric type. Raindance has no effect on " + enemy.getName());
        }
    }
}
