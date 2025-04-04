package br.dev.petronilio.rafael.domain.strategy;

import br.dev.petronilio.rafael.domain.model.Cat;

/**
 * Recompensas pontuação baixa.
 */
public class LowScoreRewardsStrategy implements RewardsStrategy {
    private static final int SNACKS = 1;

    @Override
    public void applyRewards(Cat cat) {
        System.out.println(cat.name() + " has a low score of " + cat.score() + " and got " + SNACKS + " catsnacks.");
    }
}