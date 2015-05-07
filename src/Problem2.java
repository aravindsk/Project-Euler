/**
 * Created by Kishore on 5/8/2015.
 */
public class Problem2 {
    public static void main(String[] args) {
int temp,i=0,j=1,sum=0;
        //for (int i=1,j=2; i<100; )

        while (true)
        {
          temp=i;
            i=j;
            j=temp+i;

            if( j>=4000000) {
                break;
            }
            if(j%2==0)
                sum+=j;
            System.out.println(sum);
        }


    }
}
