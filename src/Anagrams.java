
public class Anagrams {

    static Integer letterCount(String string, String letter){
        Integer letterCount = 0;
        string = string.toLowerCase();
        for(int i=0; i<string.length(); i++){
            String letterUnderAssesment = Character.toString(string.charAt(i));
            if(letterUnderAssesment.equals(letter)){
                letterCount++;
            }
        }
        return letterCount;
    }

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        // Complete the function
        boolean anagramAssesment = true;
        // iterate over one string and compare key counts to second string
        int i = 0;
        while(i< b.length() & anagramAssesment == true){
            // check if both strings have same count of char under assesment & contain the char under assesment
            String bStringLetter = Character.toString(b.charAt(i));
            boolean assess = !a.contains(bStringLetter);
            boolean assessTwo = a.length() != b.length();
            // count the occurance of the char under assesment
            if (!a.contains(bStringLetter) | a.length() != b.length()){
                anagramAssesment = false;
            }

            for(int j=0; j<b.length(); j++){
                String letter = Character.toString(b.charAt(j));
                Integer aLetterCount = letterCount(a, letter);
                Integer bLetterCount = letterCount(b, letter);
                boolean assessThree = aLetterCount != bLetterCount;
                if(aLetterCount != bLetterCount){
                    anagramAssesment = false;
                }
            }
            i++;
        }
        //print results Not Anograms, or Anograms
        return anagramAssesment;
    }

    public String isThisAnAnagram(String a, String b){
//        This test case = false
//        String a = "marganaa";
//        String b = "anagramm";
//        scan.close();
        boolean ret = isAnagram(a, b);
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        return (ret) ? "Anagrams" : "Not Anagrams";
    }
}

