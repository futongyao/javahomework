public class countdigits {
    public static void main(String[] args){
        int i,j,a[],b[],t;
        a=new int[200];
        b=new int[10];
        for(i=0;i<200;i++){
            a[i]= (int) (Math.random()*10);
            System.out.print(a[i]+" ");
            j=a[i];
            b[j]++;
            }
        System.out.println();
        for(t=0;t<10;t++){
            System.out.println(t+"有"+b[t]+"个");
        }
    }
}
