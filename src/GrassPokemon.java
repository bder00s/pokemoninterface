import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private String type = "grass";
    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");


    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);


    }


    public String getType() {
        return type;
    }

    List<String> getAttacks() {
        return attacks;
    }


    public void grassAttack(Pokemon enemy) {
        switch (enemy.getType()) {
            case "grass" ->
                    System.out.println(enemy.getName() + " is also a grass type and loses only 5 hp. He now has " + (enemy.getHp() - 5) + " left.");
            case "water" ->
                    System.out.println(enemy.getName() + " is a water type and loses 10 hp. He now has " + (enemy.getHp() - 10) + " left.");
            case "fire" ->
                    System.out.println(enemy.getName() + "is a fire type and loses 20 hp. He now has " + (enemy.getHp() - 20) + " left.");
            case "electric" ->
                    System.out.println(enemy.getName() + " is an electric type and loses 50 hp. He now has " + (enemy.getHp() - 50) + " left.");
        }

    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with leafStorm! ;'';'';';';';'; ");

        grassAttack(enemy);


    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with solarBeam! \\\\\\\\//////// ");

        grassAttack(enemy);
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with leechSeed");

        switch (enemy.getType()) {
            case "grass" ->
                    System.out.println(enemy.getName() + " is also a grass type and loses only 5 hp. He now has " + (enemy.getHp() - 5) + " left. " + name.getName() + " leeches the lost hp: " + (name.getHp() + 5));
            case "water" ->
                    System.out.println(enemy.getName() + " is a water type and loses 10 hp. He now has " + (enemy.getHp() - 10) + " left. " + name.getName() + " leeches the lost hp: " + (name.getHp() + 10));
            case "fire" ->
                    System.out.println(enemy.getName() + "is a fire type and loses 20 hp. He now has " + (enemy.getHp() - 20) + " left. " + name.getName() + " leeches the lost hp: " + (name.getHp() + 20));
            case "electric" ->
                    System.out.println(enemy.getName() + " is an electric type and loses 50 hp. He now has " + (enemy.getHp() - 50) + " left. " + name.getName() + " leeches the lost hp: " + (name.getHp() + 50));
        }
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with leaveBlade >>>>>>>");
        grassAttack(enemy);
    }
}
