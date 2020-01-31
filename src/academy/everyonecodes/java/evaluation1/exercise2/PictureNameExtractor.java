package academy.everyonecodes.java.evaluation1.exercise2;

public class PictureNameExtractor {
    public String extract(String filename) {
        filename = filename.trim();
        String extractedName = filename.substring(8, (filename.length() - 7));
        extractedName = extractedName.replaceAll("-", " ");
        return extractedName.toLowerCase();
        //I expected every file to follow the naming convention established in the handout. Meaning 8 digits at the start, Pic at the end followed by .jpg
    }
}
