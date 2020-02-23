package academy.everyonecodes.java.optionals.exceptions.exercise1;

import java.util.List;

public class ChatBot {
    public String handle(String userInput) {
        List<String> arguments = List.of(userInput.split(" ", 2));
        String serviceArgument = arguments.get(0);
        String actionArgument = arguments.get(1);
        String smartHomeReaction;

        try {
            smartHomeReaction = decideService(serviceArgument);
        } catch (WrongFirstArgumentException e) {
            e.printStackTrace();
            return "Argument not supported: " + serviceArgument;
        }

        try {
            smartHomeReaction = decideAction(actionArgument, smartHomeReaction);
        } catch (WrongSecondArgumentException e) {
            e.printStackTrace();
            return "Argument not supported: " + actionArgument;
        }

        return smartHomeReaction;
    }

    private String decideAction(String secondArgument, String smartHomeReaction) throws WrongSecondArgumentException {
        String secondArgumentChecked = checkSecondArgument(secondArgument);
        if (isTemperature(smartHomeReaction, secondArgumentChecked)) {
            int temperature = Integer.parseInt(secondArgument);
            return handleTemperature(temperature, smartHomeReaction);
        }
        if (isLight(smartHomeReaction, secondArgumentChecked)) {
            return smartHomeReaction + secondArgument;
        }
        throw new WrongSecondArgumentException("Service does not support action");
    }

    private boolean isLight(String smartHomeReaction, String secondArgumentChecked) {
        return !secondArgumentChecked.equals("number") && !smartHomeReaction.equalsIgnoreCase("temperature ");
    }

    private boolean isTemperature(String smartHomeReaction, String secondArgumentChecked) {
        return secondArgumentChecked.equals("number") && smartHomeReaction.equalsIgnoreCase("temperature ");
    }

    private String handleTemperature(int secondArgument, String smartHomeReactionPartOne) {
        if (secondArgument > 0) {
            return smartHomeReactionPartOne + "raised by " + secondArgument;
        }
        if (secondArgument < 0) {
            return smartHomeReactionPartOne + "lowered by " + Math.abs(secondArgument);
        }
        return "So you just want to annoy me, right?"; //if second argument is exactly 0. Would this be a case for an AnnoyingUserException instead? :)
    }

    String decideService(String firstArgument) throws WrongFirstArgumentException {
        if (firstArgument.equalsIgnoreCase("lights")) {
            return "Lights switched ";
        }
        if (firstArgument.equalsIgnoreCase("temperature")) {
            return "Temperature ";
        }
        throw new WrongFirstArgumentException("Function unknown");
    }

    String checkSecondArgument(String secondArgument) throws WrongSecondArgumentException {
        if (isLightSwitch(secondArgument)) {
            return secondArgument;
        }
        try {
            int testIfNumber = Integer.parseInt(secondArgument);
            return "number";
        } catch (NumberFormatException e) {
            throw new WrongSecondArgumentException("Not a valid argument");
        }
    }

    private boolean isLightSwitch(String secondArgument) {
        return secondArgument.equalsIgnoreCase("on") || secondArgument.equalsIgnoreCase("off");
    }

}
