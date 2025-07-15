package DesignPatterns.Behavioral.Template;

public class HumanStages extends GrowthStage {
    @Override
    public void childStage() {
        System.out.println("Human Childhood Stage 0-19 years");
    }

    @Override
    public void adultStage() {
        System.out.println("Human Adulthood Stage 20-65 years");
    }

    @Override
    public void oldStage() {
        System.out.println("Human Elder Stage 65+ years");
    }
}
