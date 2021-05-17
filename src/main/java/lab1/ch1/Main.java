package lab1.ch1;

public class Main {
    private void print(){
        for ( int i=1;i<=100;i++)
        {
            if(i%15 ==0)
            {
                System.out.print("FizzBuzz,");
                continue;
            }
            else if(i%3==0)
            {
                System.out.print("Fizz,");
                continue;
            }
            else if(i%5==0)
            {
                System.out.print("Buzz,");
                continue;
            }
            else if(i%7==0)
            {
                System.out.print("Rizz,");
                continue;
            }
            else if(i%11==0)
            {
                System.out.print("Jazz,");
                continue;
            }
            else
                System.out.print(i +",");

        }

    }
    public static void main ( String[] args)
    {
        Main mainObject = new Main();
        mainObject.print();
    }
}
