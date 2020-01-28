package academy.everyonecodes.java.week6.set2.exercise3;

public class TemplateChooser {
    public String choose(String name) {
        if (name.contains("Hokopoko")) {
            return "privileged";
        }
        if (isFemale(name)) {
            return "female";
        }
        if (name.contains("Mr.")) {
            return "male";
        }
        return "default";
    }

    private boolean isFemale(String name) {
        return name.contains("Mrs.") || name.contains("Ms.");
    }
}
