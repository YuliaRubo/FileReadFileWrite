import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inFile1 = "in1.txt";
        String inFile2 = "in2.txt";
        String inFile3 = "in3.txt";
        String inFile4 = "in4.txt";
        String outFile = "out.txt";
        //System.out.println(ReadFile.getInfoFromFile(new File(inFile1)));
        //System.out.println(ReadFile.getInfoFromFile(new File(inFile2)));
        //List<Integer>newIncrease = ReadFileNumber.getSortFileMergeIncrease(ReadFileNumber.getInfoFromFileWithNumber(new File(inFile1)), ReadFileNumber.getInfoFromFileWithNumber(new File(inFile2)));
        //List<Integer>newDescending = ReadFileNumber.getSortFileMergeDescending(ReadFileNumber.getInfoFromFileWithNumber(new File(inFile1)), ReadFileNumber.getInfoFromFileWithNumber(new File(inFile2)));
        //System.out.println(newIncrease);
        //System.out.println(newDescending);

        //ReadFile.writeInfoToFile(newIncrease);
        List<String>myNewStringArray = ReadFileString.getInfoFromFileWithString(new File("in3.txt"));
        List<String>myNewStringArray1 = ReadFileString.getInfoFromFileWithString(new File("in4.txt"));
        //System.out.println(myNewStringArray);
        //System.out.println(myNewStringArray1);
        //System.out.println(ReadFileString.getSortFileMergeIncreaseString(myNewStringArray,myNewStringArray1));
        // System.out.println(ReadFileString.getSortFileMergeDescendingString(myNewStringArray,myNewStringArray1));
        WriteFile.writeInfoToFileString(ReadFileString.getSortFileMergeIncreaseString(myNewStringArray,myNewStringArray1));
       // ReadFile.writeInfoToFileString(ReadFile.getSortFileMergeDescendingString(myNewStringArray,myNewStringArray1));
}
}


