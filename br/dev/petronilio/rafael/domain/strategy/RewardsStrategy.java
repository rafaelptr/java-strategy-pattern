package br.dev.petronilio.rafael.domain.strategy;

import br.dev.petronilio.rafael.domain.model.Cat;

/**
 * Interface de recompensas para os gatos.
 */
public interface RewardsStrategy {
    /**
     * Aplica as recompensas para o gato.
     *
     * @param cat gato recompensado
     */
    void applyRewards(Cat cat);
}
