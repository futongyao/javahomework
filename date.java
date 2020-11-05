
import java.util.Date;

public class date {
    public static void main(String[] args){
    long i=10000;
    int j;
    for(j=0;j<8;j++){
        Date d1=new Date(i);
        System.out.println("经过"+i+"毫秒后的时间是： "+d1.toString());
        i=i*10;
    }
}
}

