package academy.everyonecodes.java.week3.set1.exercise4;

import java.util.List;

public class Organiser {
    public String generateNewName(String originalName) {
        String newName = originalName.substring(0, originalName.length() - 4) + ".png";
        renameFile(originalName, newName);
        return newName;
    }
    public List<String> getAllPhotoFileNames(){
        return List.of("a.jpg", "b.jpg", "c.jpg");
    }
    public void renameFile(String original, String newName){
        System.out.println("Will change "+original+ " to "+newName);
    }

}
