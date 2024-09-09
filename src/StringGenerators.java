import java.util.Random;

public class StringGenerators {
     String generator(int size){
        StringBuffer sb=new StringBuffer();
        Random random=new Random();
        for (int i = 0; i < size; i++) {
            char ch=(char) (random.nextInt(26)+97);
            sb.append(ch);
        }
        return sb.toString();
    }
}
