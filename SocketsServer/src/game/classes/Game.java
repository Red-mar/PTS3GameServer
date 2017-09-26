package game.classes;

import com.example.ServerSockets.Server.Server;

import java.util.ArrayList;

public class Game
{
    //fields
    private ArrayList<Player> players;
    private Map map;
    private Chat chat;
    private Boolean inGame;
    private Server server;

    //constructor
    public Game(Server server)
    {
        this.server = server;
    }

    //methods
    public ArrayList<Player> getPlayers()
    {
        return this.players;
    }

    public void addPlayer(Player Player)
    {
        players.add(Player);
    }

    public void removePlayer(Player player)
    {
        for (Player current:players)
        {
            if(current.equals(player))
            {
                players.remove(current);
            }
        }
    }

    public Map getMap()
    {
        return this.map;
    }

    public void setMap(Map map)
    {
        this.map = map;
    }

    public void setChat(Chat chat)
    {
        this.chat = chat;
    }

    public boolean getInGame()
    {
        return getInGame();
    }

    public void setInGame(boolean inGame)
    {
        this.inGame = inGame;
    }

    public Server getServer() {
        return server;
    }
}
