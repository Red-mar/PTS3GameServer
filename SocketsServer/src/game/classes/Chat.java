package game.classes;

public class Chat {
    private Game game;
    private String[] chatlog;


    public Chat(){

    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String[] getChatlog() {
        return chatlog;
    }

    public void setChatlog(String[] chatlog) {
        this.chatlog = chatlog;
    }
}
