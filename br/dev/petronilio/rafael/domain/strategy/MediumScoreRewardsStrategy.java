package br.dev.petronilio.rafael.domain.strategy;

import br.dev.petronilio.rafael.domain.model.Cat;

/**
 * Recompensas pontuação média.
 */
public class MediumScoreRewardsStrategy implements RewardsStrategy {
    private static final int SNACKS = 3;

    @Override
    public void applyRewards(Cat cat) {
        System.out.println(cat.name() + " has a medium score of " + cat.score() + " and got " + SNACKS + " catsnacks.");
    }
}