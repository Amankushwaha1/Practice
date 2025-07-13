package DesignPatterns.Template;

import javafx.scene.Group;
import javafx.stage.Stage;

public class ElephantStages extends GrowthStage {

    @Override
    public void oldStage() {
        System.out.println("Elephants Elder Stage 50+ years");
    }
    @Override
    public void childStage() {
        System.out.println("Elephants Childhood Stage 0-11 years");
    }

    @Override
    public void adultStage() {
        System.out.println("Elephants Adulthood Stage 12-50 years");
    }

    public void anyOtherStage() {
        System.out.println("Elephants Any other Stage");
    }
}
