package br.dev.petronilio.rafael.domain.service;

import br.dev.petronilio.rafael.domain.model.Cat;
import br.dev.petronilio.rafael.domain.strategy.RewardsStrategy;

/**
 * Contexto é responsável por aplicar a estratégia de recompensas para os gatos.
 */
public class RewardsContext {
    /**
     * Interface de estratégia de recompensas.
     */
    private final RewardsStrategy strategy;

    public RewardsContext(RewardsStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Aplica a estratégia de recompensas para o gato.
     * De acordo com a estratégia definida
     * @param cat gato recompensado
     */
    public void apply(Cat cat) {
        strategy.applyRewards(cat);
    }
}
