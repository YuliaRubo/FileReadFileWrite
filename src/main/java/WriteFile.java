import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static void writeInfoToFile(List<Integer> list) {
        List<File> fileNewListMy = new ArrayList<>();
        try(FileWriter writer = new FileWriter("out.txt", false))
        { for(Integer in: list) {
            writer.write(String.valueOf(in+ "\n"));
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeInfoToFileString(List<String> list) {
        List<File> fileNewListMy = new ArrayList<>();
        try(FileWriter writer = new FileWriter("out.txt", false))
        { for(String in: list) {
            writer.write(String.valueOf(in+ "\n"));
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
