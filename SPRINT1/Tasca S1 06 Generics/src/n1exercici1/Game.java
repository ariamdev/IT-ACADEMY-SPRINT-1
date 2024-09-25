package n1exercici1;

public class Game {

    private String name;
    private String platform;

    public Game(String name, String platform) {
        this.name = name;
        this.platform = platform;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Game: " + this.name + "Platform: " + this.platform;
    }
}
