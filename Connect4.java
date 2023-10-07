public class Connect4
{
    public static void main(String[] args)
    {
        GamePlay game= new GamePlay();
        String turn="user";
        while(game.noWinner()==true)
        {
            game.playerTurn(turn);
            if(turn.equals("user"))
            {
                turn="computer";
            }
            else
            {
              turn="user";  
            }
        }
        if(game.hasWinner("R"))
        {
            System.out.println("Congratulations User! You have won!");
        }
        else if(game.hasWinner("B"))
        {
            System.out.println("Sorry! You lose. The computer has won");
        }
        else
        {
            System.out.println("You and the computer have tied!");
        }
        
    }
}

