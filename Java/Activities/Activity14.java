import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) {
        try {
            // Create a new text file
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write some text into the text file
            FileUtils.writeStringToFile(file, "This is a sample text.", "UTF8");

            // Read and print the data from the file
            File fileUtil = FileUtils.getFile("example.txt");
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            // Create a new directory named resources
            File destDir = new File("resources");
            if (!destDir.exists()) {
                destDir.mkdir();
            }

            // Copy the text file into this directory
            FileUtils.copyFileToDirectory(file, destDir);

            // Get the file from the new directory
            File newFile = FileUtils.getFile(destDir, "example.txt");

            // Read and print the data from the new file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            System.out.println("Data in new file: " + newFileData);

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
