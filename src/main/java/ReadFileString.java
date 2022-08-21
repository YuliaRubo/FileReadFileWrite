import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unchecked")
public class ReadFileString {
    public static List<String> getInfoFromFileWithString(File file) {
        List<String> myList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if(isCorrect(line))
                    myList.add(line);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return myList;
    }
    public static boolean isCorrect(String string1) {
        try {
            for(int i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) != ' ')
                    return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(string1 + " " + "Пробел недопустим в слове.");
        }
        return false;
    }
    public static List<String> getSortFileMergeIncreaseString(List<String>listString1, List<String>listString2) {
        int index1 = 0;
        int index2 = 0;

        int indexEnd1 = listString1.size();
        int indexEnd2 = listString2.size();

        List<String> newOutString = new ArrayList<>();
        int sizeOut = newOutString.size();
        sizeOut = indexEnd1 + indexEnd2;


        for (int i = 0; i < sizeOut; i++) {
            if(index1<indexEnd1 && (index2>=indexEnd2||listString1.get(index1).compareTo(listString2.get(index2))<0)){
                newOutString.add(listString1.get(index1));
                index1++;
            }else{
                newOutString.add(listString2.get(index2));
                index2++;
            }
        }
        return newOutString;
    }

    public static List<String> getSortFileMergeDescendingString(List<String>listString1, List<String>listString2) {
        int index1 = listString1.size()-1;
        int index2 = listString2.size()-1;

        int indexEnd1 = 0;
        int indexEnd2 = 0;

        List<String> newOutString = new ArrayList<>();
        int sizeOut = listString1.size()+listString2.size();

        for (int i = sizeOut-1; i >= 0; i--) {
            if(index1 >= indexEnd1 && (index2<indexEnd2 ||listString1.get(index1).compareTo(listString2.get(index2))>0)){
                newOutString.add(listString1.get(index1));
                index1--;
            }else{
                newOutString.add(listString2.get(index2));
                index2--;
            }
        }
        return newOutString;
    }

}
