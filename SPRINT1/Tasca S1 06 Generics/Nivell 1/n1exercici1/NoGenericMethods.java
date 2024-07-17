package n1exercici1;

public class NoGenericMethods {

    private Game game1;
    private Game game2;
    private Game game3;

    public NoGenericMethods(Game game1, Game game2, Game game3) {
        this.game1 = game1;
        this.game2 = game2;
        this.game3 = game3;
    }

    public Game getGame1() {
        return game1;
    }

    public void setGame1(Game game1) {
        this.game1 = game1;
    }

    public Game getGame2() {
        return game2;
    }

    public void setGame2(Game game2) {
        this.game2 = game2;
    }

    public Game getGame3() {
        return game3;
    }

    public void setGame3(Game game3) {
        this.game3 = game3;
    }

    @Override
    public String toString() {
        return "Game list: \n" +
                "1. " + game1 + "\n" +
                "2. " + game2 + "\n" +
                "3. " + game3;
    }
}
