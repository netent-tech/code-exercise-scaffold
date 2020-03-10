package codeexercise.gameservice;

import static java.util.stream.Collectors.toList;

import codeexercise.game.Game;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameService {

    private final Set<Game> games = new HashSet<>();

    public void deploy(Game game) {
        games.add(game);
    }

    public List<String> listGamesIds() {
        return games.stream()
            .map(Game::getId)
            .sorted()
            .collect(toList());
    }

}
