import java.util.Scanner;
public class GamePlay
{
    private Board gameBoard;
    public GamePlay()
    {
           gameBoard=new Board();
    }
    
    public int askForCol()
    {
      Scanner reader= new Scanner(System.in);
      System.out.println("Choose a column from 1-7");
      return reader.nextInt()-1;
    }
    
    public int getComputerCol()
    {
        int randomColumn= (int)(Math.random()*7);
        while(gameBoard.setBoard("B", randomColumn)!=1)
        {
            randomColumn=(int)(Math.random()*7);
        }
        return randomColumn;
    }
    
    public void playerTurn(String player)
    {
        if(player.equals("user"))
        {
            int col=askForCol();
            int check=gameBoard.setBoard("R", col);
            while(check==-1)
            {
                System.out.println("That column is already full. Please choose a different one");
                col=askForCol();
                 check=gameBoard.setBoard("R", col);
            }
            gameBoard.printBoard();
        }
        else
        {
            int col=getComputerCol();
            gameBoard.printBoard();
        }
    }
    
    public boolean hasWinner(String letter)
    {
        if(gameBoard.verticalCheck(letter)==true)
        {
            return true;
        }
        if(gameBoard.horizontalCheck(letter)==true)
        {
            return true;
        }
        if(gameBoard.diagonalCheck(letter)==true)
        {
            return true;
        }
        if(gameBoard.reverseDiagonalCheck(letter)==true)
        {
            return true;
        }
        return false;
    }
    
    public boolean noWinner()
    {
       if(gameBoard.boardIsFull()==false && hasWinner("R")==false && hasWinner("B")==false)
       {
           return true;
       }
        return false;
    }
}

