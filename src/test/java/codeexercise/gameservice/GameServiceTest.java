package codeexercise.gameservice;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import codeexercise.game.Game;
import org.junit.jupiter.api.Test;

class GameServiceTest {

    private GameService subject = new GameService();

    @Test
    void gameIsDeployed() {
        String expectedId = "a-game";

        subject.deploy(new Game(expectedId));

        assertThat(subject.listGamesIds(), containsInAnyOrder(expectedId));
    }

}