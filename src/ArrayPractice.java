import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

    String string = "Lorem ipsum dolor sit amet, eum repudiandae contentiones id, an quod nisl tibique vel. Mei ex dictas eligendi, nam ad assueverit consectetuer vituperatoribus. Enim ridens facilisi ne ius. Et nulla diceret eligendi quo. Ea scripta pertinax imperdiet vim, duo id expetenda suavitate. Cum ludus dolorum mediocrem cu, et feugiat dolorum vix, no nulla sanctus sed.\n" +
            "\n" +
            "Per in soleat gubergren constituam, luptatum delicatissimi per ea. Mea choro vocibus gloriatur ut, et persius impedit nam. Ea sit dolorem fastidii, ei qui vero reprimique scribentur. Fabulas invenire quo ad, nam saepe volutpat ex. Mei oratio molestie quaestio ei, in vel illud honestatis disputando, ius id minimum consectetuer signiferumque. Sint postea id duo, vix ea stet dolorem. In mel constituam complectitur conclusionemque, sint iriure constituam te mei.\n" +
            "\n" +
            "Facilis consequuntur eum ad, pri et virtute fabulas. Eum in ludus adipiscing. Ad vero consectetuer nec, ignota omnium suscipit ei qui. Quo in latine constituam.\n" +
            "\n" +
            "Euismod dolores suavitate pri id, sit an vitae erroribus appellantur, sint eleifend rationibus at pro. Vero dicunt eirmod ei pro. Vim movet alterum eruditi et, mea no justo bonorum, est ut duis consequat. Vix eu doctus diceret. Ad mel explicari reprimique. Ut sit libris tibique, mei utinam postea integre no.\n" +
            "\n" +
            "Cu quo cibo abhorreant, eam decore nominati id, duo omittam hendrerit at. Tota utamur luptatum sit no, sea eu zril pertinax. Pro ei ludus minimum omittam, ad eos autem necessitatibus, ne alii deleniti officiis sea. Molestie voluptaria ei mea, has probo facer et. Eu oblique labitur vix, quo ea clita accusam, in laoreet atomorum has.";

//    String[] array = string.split(" ");

    public void addArrayEven(){

        int arrayLength = 0;
        int evenIntsIterator = 0;
        String[] array = string.split(" ");
//        System.out.println("even integers in array: " + Arrays.toString(array));

        for(int i=0; i<array.length; i++){
            if(array[i].length() == 5) {
                arrayLength++;
            }
        }
        String[] evenInts = new String[arrayLength];
        for(int i=0; i<array.length; i++){
            if(array[i].length() == 5){
                evenInts[evenIntsIterator] = array[i];
                evenIntsIterator++;
//                System.out.println("evenIntsIterator: " + Integer.toString(evenIntsIterator));
//                System.out.println("arrayItem: " + Integer.toString(array[i]));
//                System.out.println("current array: " + Arrays.toString(evenInts));
            }
        }
        System.out.println("words with 5 char: " + Arrays.toString(evenInts));
    }
}
