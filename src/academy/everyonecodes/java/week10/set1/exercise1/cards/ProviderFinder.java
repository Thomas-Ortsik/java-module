package academy.everyonecodes.java.week10.set1.exercise1.cards;

public class ProviderFinder {
    public String lookUpNumber(long number) {
        Validator validator = new Validator();
        if (!validator.isValid(number)) {
            return "INVALID";
        }
        return Providers.get().stream()
                .map(provider -> provider.getProvider(number))
                .filter(provider -> !provider.equalsIgnoreCase("INVALID"))
                .findFirst().orElse("INVALID");
    }
}
