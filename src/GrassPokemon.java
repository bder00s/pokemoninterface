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
            case "grass" -> {
                enemy.setHp(getHp() - 5);
                System.out.println(enemy.getName() + " is also a grass type and loses only 5 hp. He now has " + enemy.getHp() + " left.");
            }
            case "water" -> {
                enemy.setHp(getHp() - 10);
                System.out.println(enemy.getName() + " is a water type and loses 10 hp. He now has " + enemy.getHp() + " left.");
            }
            case "fire" -> {
                enemy.setHp(getHp() - 20);
                System.out.println(enemy.getName() + " is a fire type and loses 20 hp. He now has " + enemy.getHp() + " left.");
            }
            case "electric" -> {
                enemy.setHp(getHp() - 50);
                System.out.println(enemy.getName() + " is an electric type and loses 50 hp. He now has " + enemy.getHp() + " left.");
            }
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
        System.out.println(getName() + " attacks " + enemy.getName() + " with leechSeed.");

        switch (enemy.getType()) {
            case "grass" -> {
                enemy.setHp(getHp() - 5);
                name.setHp(getHp() + 5);
                System.out.println(enemy.getName() + " is also a grass type and loses only 5 hp. He now has " + enemy.getHp() + " left. " + name.getName() + " leeches the lost hp: " + name.getHp());
            }
            case "water" -> {
                enemy.setHp(getHp() - 10);
                name.setHp(getHp() + 10);
                System.out.println(enemy.getName() + " is a water type and loses 10 hp. He now has " + enemy.getHp() + " left. " + name.getName() + " leeches the lost hp: " + name.getHp());
            }
            case "fire" -> {
                enemy.setHp(getHp() - 20);
                name.setHp(getHp() + 20);
                System.out.println(enemy.getName() + "is a fire type and loses 20 hp. He now has " + enemy.getHp() + " left. " + name.getName() + " leeches the lost hp: " + name.getHp());
            }
            case "electric" -> {
                enemy.setHp(getHp() - 50);
                name.setHp(getHp() + 50);
                System.out.println(enemy.getName() + " is an electric type and loses 50 hp. He now has " + enemy.getHp() + " left. " + name.getName() + " leeches the lost hp: " + name.getHp());
            }
        }
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with leaveBlade >>>>>>>");
        grassAttack(enemy);
    }

}
