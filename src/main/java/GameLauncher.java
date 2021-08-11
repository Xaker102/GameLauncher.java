import java.util.logging.Logger;

public class GameLauncher {
    public static void main(String[] args) {
        final Logger LOGGER = Logger.getLogger(String.valueOf(GameLauncher.class));
        LOGGER.info("program start");
        GuessGame guessGame = new GuessGame();
                guessGame.startGame();

        }
    }
