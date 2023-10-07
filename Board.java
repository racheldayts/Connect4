public class Board
{
    private String[][] board;
    public Board()
    {
         board=new String[6][7];
        for(int r=0; r<board.length; r++)
        {
            for(int c=0; c<board[0].length; c++)
            {
                board[r][c]=" ";
            }
        }
    }
    
    public void printBoard()
    {
        System.out.println("\f");
        for(int r=0; r<board.length; r++)
        {
            for(int c=0; c<board[0].length; c++)
            {
            System.out.print("| " + board[r][c] +   " |"); 
            }
            System.out.println();
            System.out.println("-----------------------------------");
        }
    }
    
    public int setBoard(String letter, int col)
    {
       for(int r=board.length-1; r>=0; r--)
       {
           if(board[r][col].equals(" "))
           
           {
               board[r][col]=letter;
               return 1;
           }
       }
        return -1;
    }
    
    public boolean verticalCheck(String letter)
    {
        for(int c=0; c<board[0].length; c++)
        {
            for(int r=0; r<board.length-3; r++)
            {
                if(board[r][c].equals(letter))
                {
                    if(board[r+1][c].equals(letter))
                    {
                     if(board[r+2][c].equals(letter))
                    {
                    if(board[r+3][c].equals(letter))
                    {
                      return true;  
                    }
                    }   
                    }
                }
            }
        }
        return false;
    }
    
    public boolean horizontalCheck(String letter)
    {
        for(int r=0; r<board.length; r++)
        {
            for(int c=0; c<board[0].length-3; c++)
            {
                if(board[r][c].equals(letter))
                {
                    if(board[r][c+1].equals(letter))
                    {
                     if(board[r][c+2].equals(letter))
                    {
                    if(board[r][c+3].equals(letter))
                    {
                      return true;  
                    }
                    }   
                    }
                }
            }
        }
        return false;
    }
    
    public boolean diagonalCheck(String letter)
    {
        for(int r=0; r<board.length-3; r++)
        {
            for(int c=0; c<board[0].length-3; c++)
            {
              if(board[r][c].equals(letter))
                {
                    if(board[r+1][c+1].equals(letter))
                    {
                     if(board[r+2][c+2].equals(letter))
                    {
                    if(board[r+3][c+3].equals(letter))
                    {
                      return true;  
                    }
                    }   
                    }
                }  
            }
                
            
        }
        return false;
    }
    public boolean reverseDiagonalCheck(String letter)
    {
      for(int r=board.length-1; r>=3; r--)
        {
            for(int c=0; c<board[0].length-3; c++)
            {
                if(board[r][c].equals(letter))
                {
                    if(board[r-1][c+1].equals(letter))
                    {
                     if(board[r-2][c+2].equals(letter))
                    {
                    if(board[r-3][c+3].equals(letter))
                    {
                      return true;  
                    }
                    }   
                    }
                }
            }
                
            
        }
        return false;  
    }
    
    public boolean boardIsFull()
    {
        for(int r=0; r<board.length; r++)
        {
            for(int c=0; c<board[0].length; c++)
            {
                if(board[r][c].equals(" "))
                {
                   return false; 
                }
            }
        }
        return true;
    }
}

