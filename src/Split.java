import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("hello i am tornov dutta");
        String[] arr=sb.toString().split(" ");
        System.out.println(Arrays.toString(arr));
    }
}
