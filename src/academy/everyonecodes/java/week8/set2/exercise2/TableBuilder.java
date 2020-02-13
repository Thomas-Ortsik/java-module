package academy.everyonecodes.java.week8.set2.exercise2;

import java.util.List;

public class TableBuilder {
    private Furniture table = new Furniture("Table");
    private List<BuildingStep> buildingSteps = List.of(new AddLeg(), new AddLeg(), new AddLeg(), new AddLeg(), new AddSurface());

    public Furniture build() {
        buildingSteps.forEach(step -> step.apply(table));
        return table;
    }

}
