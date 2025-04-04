package br.dev.petronilio.rafael.domain.strategy;

/**
 * Estratégias de premios com base na pontuação.
 */
public class RewardsFactory {
    // construtor privado para evitar instâncias
    private RewardsFactory() {}

    /**
     * Retorna a ScoreStrategy com base na pontuação do gato.
     * @param score
     * @return ScoreStrategy
     */
    public static RewardsStrategy pickScoreStrategy(int score) {
        if (score >= 100) {
            return new HighScoreRewardsStrategy();
        } else if (score >= 50) {
            return new MediumScoreRewardsStrategy();
        } else {
            return new LowScoreRewardsStrategy();
        }
    }
}