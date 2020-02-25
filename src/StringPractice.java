import java.util.HashMap;

public class StringPractice {

//    private String string= "z z";
    private String string = "If the product of two terms is zero then common sense says at least " +
            "one of the two terms has to be zero to start with. So if you move all the terms over to " +
            "one side, you can put the quadratics into a form that can be factored allowing that side of " +
            "the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

    private HashMap<String, Integer> charCount = new HashMap<>();
//    private static String[] alphabetKey = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    //write a program to count the number of times each character
    // occurs in a string and then print the results to the console
    public void stringPractice(){

        for(int i=0; i< string.length() ; i++){
            String thisChar = Character.toString(Character.toLowerCase(string.charAt(i)));
            //check if key exists, add to count under existing alphabetKey char
            if (charCount.containsKey(thisChar)){
                Integer thisCharCount = charCount.get(thisChar);
                charCount.put(thisChar.toString(), thisCharCount + 1);
            //else if not punctuation, add new alaphabetKey char if key does not exist
            } else if(!thisChar.equals(" ") & !thisChar.equals("'") & !thisChar.equals(".") & !thisChar.equals("’") & !thisChar.equals(",")){
                charCount.put(thisChar, 1);
            } else {
                continue;
            }
        }
        for (String pair:charCount.keySet()
             ) {
            String key = pair.toString();
            String value = Integer.toString(charCount.get(key));
            System.out.println(key + ": " + value);
        }

    }

}
