package br.dev.petronilio.rafael.adapters.in;

import br.dev.petronilio.rafael.domain.model.Cat;
import br.dev.petronilio.rafael.domain.service.RewardsContext;
import br.dev.petronilio.rafael.domain.strategy.RewardsFactory;

/**
 * Strategy Pattern - recompensas para os gatos :)
 */
public class Main {
    public static void main(String[] args) {
        final Cat cat1 = new Cat("Bico", 50);
        final Cat cat2 = new Cat("Beerus", 120);
        final Cat cat3 = new Cat("Polly", 100);
        final Cat cat4 = new Cat("Budo", 49);

        RewardsContext context;

        // define a estratégia a ser usada com base na pontuação do gato
        context = new RewardsContext(RewardsFactory.pickScoreStrategy(cat1.score()));
        context.apply(cat1); // Bico medium score 50.

        context = new RewardsContext(RewardsFactory.pickScoreStrategy(cat2.score()));
        context.apply(cat2); // Beerus high score 120.

        context = new RewardsContext(RewardsFactory.pickScoreStrategy(cat3.score()));
        context.apply(cat3); // Polly high score 70.

        context = new RewardsContext(RewardsFactory.pickScoreStrategy(cat4.score()));
        context.apply(cat4); // Budo low score 49.
    }
}