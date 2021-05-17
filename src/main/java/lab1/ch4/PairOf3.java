package lab1.ch4;

public class PairOf3 {
    public int hasPairOf3(int a[], int size,int sum)
    {
        int count=0;
        int l,r;
        for(int i=0;i< size-2;i++)
        {
            for(int j=i+1;j<size-1;j++)
            {
                for(int k=j+1;k<size;k++)
                {
                    if(a[i]+a[j]+a[k]==sum)
                    {
                        count =count+1;
                        return count;
                    }

                }

            }

        }

        return -1;
    }
    public static void main(String [] args)
    {
        PairOf3 pair= new PairOf3();
        int a[]={-1,-1,-1,2};
        int sum=0;
        int size= a.length;
        pair.hasPairOf3(a,size,sum);
    }
}
