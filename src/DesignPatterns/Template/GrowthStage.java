
package DesignPatterns.Template;
/**
 * Represents an abstract growth stage with methods for different stages of development.
 */
public abstract class GrowthStage {

    /**
     * Performs actions specific to the child stage.
     */
    public abstract void childStage();

    /**
     * Performs actions specific to the adult stage.
     */
    public abstract void adultStage();

    /**
     * Performs actions specific to the old stage.
     */
    public abstract void oldStage();

    /**
     * Executes all stages sequentially: child, adult, and old.
     */
    public final void allStages() {
        childStage();
        adultStage();
        oldStage();
    }
}
