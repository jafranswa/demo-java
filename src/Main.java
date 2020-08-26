import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class Main {


        public static void main(String[] args)throws Exception {
            FileReader fileReader = new FileReader("/Users/jacob/IdeaProjects/demo-java/input.txt");
            Encode encoder = new Encode();

//            {
//                try {
//                    fileReader = new FileReader("/Users/jacob/IdeaProjects/demo-java/input.txt");
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//            }
            BufferedReader bufferedReader = new BufferedReader(fileReader, 8);
            String firstLine = bufferedReader.readLine();
            String secondLine = bufferedReader.readLine();
            String string = "Hello World!";
            String result = Encode.encode(string);
            System.out.println(firstLine);
            System.out.println(secondLine);
            bufferedReader.close();




    }
}
//package com.program;
//
//        import com.program.Utils;
//        import java.util.*;
//
//class Solution {
//    public static void main(String[] args) {
//        String data = Utils.getUserInput();
//        String[] numberList = data.split("\\n");
//        for(int i=0; i<numberList.length; i++){
//            String currentNumber = numberList[i];
//            if(currentNumber.equals("42")){
//                break;
//            }else{
//                System.out.print(currentNumber + "\n");
//            }
//        }
//    }
//}