package br.dev.petronilio.rafael.domain.strategy;

import br.dev.petronilio.rafael.domain.model.Cat;

/**
 * Recompensas pontuação alta.
 */
public class HighScoreRewardsStrategy implements RewardsStrategy {
    private static final int SNACKS = 5;

    @Override
    public void applyRewards(Cat cat) {
        System.out.println(cat.name() + " has a high score of " + cat.score() + " and got " + SNACKS + " catsnacks.");
    }
}