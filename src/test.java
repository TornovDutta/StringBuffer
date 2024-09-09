import java.text.DecimalFormat;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Hello");
        StringBuffer sb1=new StringBuffer("hi");
        StringBuffer sb2=new StringBuffer(30);
        System.out.println(sb);
        System.out.println(sb.toString());
        System.out.println(sb1);
        System.out.println(sb2);
        Random random=new Random();

        System.out.println(random.nextInt(0,500));
        DecimalFormat df=new DecimalFormat("0.0000");
        System.out.println(df.format(123.456789));
    }
}
