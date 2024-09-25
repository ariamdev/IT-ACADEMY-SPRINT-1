package n1exercici1;

public class main {

    public static void main(String[] args) {

        Game game1 = new Game("Horizon: Forbidden west ","PS5");
        Game game2 = new Game("Bladurs Gate III ", "PC / PS5");
        Game game3 = new Game("The Legend of Zelda: Tears of the Kingdom ", "Nintendo Switch");

        System.out.println(game1 + "\n" + game2 + "\n" + game3);

        System.out.println("--------------------------------------------------------------------------------------");

        NoGenericMethods gameList1 = new NoGenericMethods(game1,game2,game3);
        NoGenericMethods gameList2 = new NoGenericMethods(game3,game1,game2);

        System.out.println(gameList2 + "\n" + gameList1);

    }


}
