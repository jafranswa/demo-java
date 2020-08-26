public class YeeHaw {

    public static String yeeHaw(String str) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                if(Character.getNumericValue(str.charAt(i)) % 2 == 0) {
                    result.append("Yee");
                }
                else if(Character.getNumericValue(str.charAt(i)) % 2 != 0) {
                    result.append("Haw");
                }
            }
            else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "MrJ3oh582z2s";
        System.out.println(yeeHaw(str));
    }
}