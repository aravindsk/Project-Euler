/**
 * Created by Kishore on 5/8/2015.
 */
public class Problem1 {
    public static void main(String[] args) {
        int sum=0;

        for(int i=1;i<1000;i++)
        {
            if (i%3==0 || i%5==0 )
            {
                sum = sum+i;
            }


        }

        System.out.println(sum);

    }

}
