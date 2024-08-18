package BusinessLogic;

import Database.GameDAO;
import Model.Game;

import java.sql.SQLException;

public class GameLogic
{

    GameDAO gameDAO;

    public GameLogic()
    {
        gameDAO = new GameDAO();
    }

    public boolean validateGame(Game game)
    {
        if(game.getGameMode()!= null && game.getPlayerID()!=0 && game.getWord()!=null && game.getStatus()!=null && game.getStatus()!=null)
        {
            return true;
        }
        return false;
    }


    public void addGame(Game newGame) throws SQLException
    {
        gameDAO.addGame(newGame);
    }
}
