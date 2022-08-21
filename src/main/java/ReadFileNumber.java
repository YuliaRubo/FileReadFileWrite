import java.io.*;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unchecked")
public class ReadFileNumber {
    //Читаем файл. добавляем в колелкцию с проверкой на число
    public static List getInfoFromFileWithNumber(File file) {
        List<Integer> myList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            Integer num;

            while ((line = reader.readLine()) != null) {
                if (isNumeric(line)) {
                    num = Integer.parseInt(line);
                    myList.add(num);
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myList;
    }
    public static boolean isNumeric(String string) {
        int intValue;
        if (string == null || string.equals("")) {
            return false;
        }
        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println(string + " " + "Невозможно преобразовать в число");
        }
        return false;
    }

    public static List<Integer> getSortFileMergeIncrease(List<Integer> list1, List<Integer> list2) {
        int index1 = 0;
        int index2 = 0;

        int indexEnd1 = (list1.size());
        int indexEnd2 = (list2.size());

        List<Integer> outFile = new ArrayList<>();
        Integer sizeOut = indexEnd1 + indexEnd2;

        for (int i = 0; i < sizeOut; i++) {
            if(index1 < indexEnd1 && (index2 >= indexEnd2 ||list1.get(index1)<list2.get(index2))){
                outFile.add(list1.get(index1));
                index1++;
            } else {
                outFile.add(list2.get(index2));
                index2++;
            }
        }
        return outFile;
    }

    public static List<Integer> getSortFileMergeDescending(List<Integer> list1, List<Integer> list2) {
        int index1 = list1.size()-1;
        int index2 = list2.size()-1;

        int indexEnd1 = 0;
        int indexEnd2 = 0;

        List<Integer> outFile = new ArrayList<>();
        Integer sizeOut = list1.size()+list2.size();

        for (int i = sizeOut-1; i >=0; i--) {
            if(index1 >= indexEnd1 && (index2<indexEnd2 ||list1.get(index1)>list2.get(index2))){
                outFile.add(list1.get(index1));
                index1--;
            } else {
                outFile.add(list2.get(index2));
                index2--;
            }
        }
        return outFile;
    }




}