import java.util.*;

import static java.util.stream.Collectors.joining;

public class Main {

    //encoding functions
    public static boolean isNextInt(Integer itterator, String stringToEncode){
        char nextChar;
        try {
            nextChar = stringToEncode.charAt(itterator + 1);
        }catch (StringIndexOutOfBoundsException e){
            return false;
        }
        if(Character.isDigit(nextChar)){
            return true;
        }
        return false;
    }

    public static String reverseNumber(String number){
        StringBuilder stringBuilder = new StringBuilder(number);
        number = stringBuilder.reverse().toString();
        return number;
    }

    public static String VowelYSpaceToInt(char letter) {
        HashMap<String, String> vowelAndYMap = new HashMap<String, String>() {
            {
                put("a","1"); put("e","2"); put("i","3"); put("o","4"); put("u","5"); put("y"," "); put(" ","y");
            }
        };
        String letterNumber = vowelAndYMap.get(Character.toString(letter));
        return letterNumber;
    }

    public static String backALetter(char letter){
        int ascii = letter;
        ascii = ascii - 1;
        String backOneLetter = Character.toString((char) ascii);
        return backOneLetter;
    }

    // sorting functions
    public static boolean isNumber(char character){
        String stringChar = Character.toString(character);
        try{
            Integer.parseInt(stringChar);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public static boolean isVowel(char character){
        int ascii = character;
        if(ascii == 'a' || ascii == 'e' || ascii == 'i' || ascii == 'o' || ascii == 'u' || ascii == 'y' || ascii == ' '){
            return true;
        }
        return false;
    }

    public static boolean isConsinant(char character){
        if (character >= 'a' && character<='z' && false == isVowel(character)){
            return true;
        }
        return false;
    }


    public static String encode(String stringToEncode) {
        stringToEncode = stringToEncode.toLowerCase();
        String encodedString = "";
        for(int i=0; i<stringToEncode.length() ;i++){
            char currentChar = stringToEncode.charAt(i);
            if(isNumber(currentChar)){
                // check if next char is int
                boolean keepLooking = true;
                String number = "";
                while (keepLooking == true){
                    if (isNextInt(i, stringToEncode)){
                        number = number + stringToEncode.charAt(i);
                        i++;
                    }else{
                        number = number + stringToEncode.charAt(i);
                        keepLooking = false;
                    }
                }
                encodedString = encodedString + reverseNumber(number);
            }else if(isVowel(currentChar)){
                encodedString = encodedString + VowelYSpaceToInt(stringToEncode.charAt(i));
            }else if(isConsinant(currentChar)){
                encodedString = encodedString + backALetter(stringToEncode.charAt(i));
            }else{
                encodedString = encodedString + currentChar;
            }
        }
        return encodedString;
    }





        public static void main(String[] args) {
//        String string = "Hello World!";
//        System.out.println(encode(string));
            String a = "Hello World12!";
            String result = encode(a);
            System.out.println(result);





    }
}
