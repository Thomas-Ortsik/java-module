package academy.everyonecodes.java.christmas.exercise9;

import java.util.List;

public class Organiser {
    public String generateNewName(String originalName) {
        String newName = originalName.substring(0, originalName.length() - 4) + ".png";
        renameFile(originalName, newName);
        return newName;
    }
    public List<String> getAllPhotoFileNames(){
        return List.of("dfkl.jpg", "ieidk.jpg", "feiowü.jpg");
    }
    public void renameFile(String original, String newName){
        System.out.println("Will change "+original+ " to "+newName);
    }

}
