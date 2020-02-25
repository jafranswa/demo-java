import com.sun.tools.javac.util.StringUtils;

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {

    public static boolean isNextInt(Integer itterator, String stringToEncode){
        char nextChar;
        try {
             nextChar = stringToEncode.charAt(itterator + 1);
        }catch (StringIndexOutOfBoundsException e){
            return false;
        }
        int ascii = (int)nextChar;
        if(48 <= ascii && ascii <=57){
            return true;
        }
        return false;
    }

    public static String reverseNumber(String integer){
        String number = integer;
        StringBuilder stringBuilder = new StringBuilder(number);
        number = stringBuilder.reverse().toString();
        return number;
    }

    public static String encodeVowelAndY(char letter) {
        HashMap<String, String> vowelAndYMap = new HashMap<String, String>() {
            {
                put("a","1"); put("e","2"); put("i","3"); put("o","4"); put("u","5"); put("y"," "); put(" ","y");
            }
        };
        String letterNumber = vowelAndYMap.get(Character.toString(letter));
        return letterNumber;
    }

    public static String backALetter(Character letter){
        int ascii = letter;
        ascii = ascii - 1;
        String backOneLetter = Character.toString((char) ascii);
        return backOneLetter;
    }

    public static boolean isNumber(String character){
        try{
            Integer.parseInt(character);
        }catch (Exception e){
            return false;
        }
        return true;
    }


    public static String encode(String stringToEncode) {
        stringToEncode = stringToEncode.toLowerCase();
        String encodedString = "";
        for(int i=0; i<stringToEncode.length() ;i++){
            String currentChar = Character.toString(stringToEncode.charAt(i));
            //determine case

            // is int
            if(isNumber(currentChar)){
                boolean keepLooking = true;
                String number = "";
                while (keepLooking == true){
                    if (isNextInt(i, stringToEncode)){
                        number = number + stringToEncode.charAt(i);
                        //if integers found advance loop
                        i++;
                    }else{
                        number = number + stringToEncode.charAt(i);
                        keepLooking = false;
                    }
                }
                encodedString = encodedString + reverseNumber(number);
            // is vowel
            }else if(currentChar.equals("a") || currentChar.equals("e") || currentChar.equals("i") ||
                    currentChar.equals("o") || currentChar.equals("u") || currentChar.equals("y")
                    || currentChar.equals(" ")){
                encodedString = encodedString + encodeVowelAndY(stringToEncode.charAt(i));
            // is other char
            }else if(currentChar.equals("?") ||currentChar.equals("!") ||currentChar.equals(".") ||currentChar.equals("\"")
                    ||currentChar.equals("\"") ||currentChar.equals("'") ||currentChar.equals(",")){
                        encodedString = encodedString + currentChar;
            // is consinant
            }else{
                encodedString = encodedString + backALetter(stringToEncode.charAt(i));

            }

            }
        return encodedString;

        }





        public static void main(String[] args) {
//        String string = "Hello World!";
//        System.out.println(encode(string));
            String a = "Hello World!";
            String result = encode(a);
            System.out.println(result);



    }
}
