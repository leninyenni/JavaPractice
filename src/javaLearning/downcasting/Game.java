package javaLearning.downcasting;

public class Game
{
    public void play(){
        System.out.println("Game is being played");
    }

    public void noOfPlayers(){
        System.out.println("No of players depend upon the game");
    }

    public void winner(String name){
        System.out.println("Winner is : " + name);
    }
}

class Cricket extends Game{

    public void noOfPlayers(){
        System.out.println("22");
    }

    public void teams(){
        System.out.println("2");
    }
}
class Chess extends Game{

    public void noOfPlayers(){
        System.out.println("2");
    }
}
class UpCasting{

    public static void main(String[] args){

        //UpCasting.
        Game game = new Cricket();

        game.play();
        game.noOfPlayers();
        game.winner("A");
    }
}
class GameStart{

    public void startGame(Game game){
        game.play();
    }
}

class DownCasting {

    public static void main(String[] args) {

        Game game2 = new Chess();
        //Error
        //Chess chess = (Chess) game2;
        //Solution :
        if (game2 instanceof Cricket) {
            //Cricket cricket = (Cricket) game2;
            game2.play();
            game2.noOfPlayers();
            game2.winner("B");
            //here to call teams method u need to do downcasting parent reference to Child Class
           ((Cricket) game2).teams();
        } else if (game2 instanceof Chess) {
            //Chess chess = (Chess) game2;
            game2.play();
            game2.noOfPlayers();
            game2.winner("B");
        }
        else if(game2 instanceof Game)
        {
            System.out.println("hell");
        }

    }
}