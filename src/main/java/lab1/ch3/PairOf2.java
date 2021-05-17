package lab1.ch3;

import java.util.Arrays;

public class PairOf2 {

    public int hasPairOf2(int a[], int size, int sum)
    {
        int l,r;
        int count=0;
        //sortez elementele
        Arrays.sort(a);

        /*
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);*/

        //initializam 2 indexi. Unul pt stanga si altul pt dreapta
        //ii folosim pentru a cauta elementele
        l=0;
        r=size-1;
        while(l<r)
        {
            if(a[l] + a[r] == sum)
            {
                count=count +1;
            }
            else if(a[l] + a[r] < sum)
                l++;
            else // >sum
                r--;
            return count;
        }

        return -1;
    }

    public static void main (String[] args)
    {
        PairOf2 pair = new PairOf2();
        int a[]={1,1,0,-1,-1};
        int sum=0;
        int size=a.length;

      System.out.println(pair.hasPairOf2(a,size,sum));
    }
}
