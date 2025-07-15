package DesignPatterns.Behavioral.Template;

public class PandaStages extends GrowthStage {
    @Override
    public void childStage() {
        System.out.println("Panda Childhood Stage 0-2 years");
    }

    @Override
    public void adultStage() {
        System.out.println("Panda Adulthood Stage 3-15 years");
    }

    @Override
    public void oldStage() {
        System.out.println("Panda Elder Stage 15+ years");
    }
}
