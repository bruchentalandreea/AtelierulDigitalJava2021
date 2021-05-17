package lab1.ch2;

public class FooBarQix {

    public String compute(int n)
    {
        String toReturn = "";
        if(n%3==0){
            toReturn+="Foo";
        }
        if(n%5==0)
        {
            toReturn+="Bar";
        }
        if(n%7==0)
        {
            toReturn+="Qix";
        }
        String s=String.valueOf(n);
        for(int i =0;i<String.valueOf(n).length();i++)
        {
            char c=s.charAt(i);
            if(c=='3')toReturn+="Foo";
            if(c=='5')toReturn+="Bar";
            if(c=='7')toReturn+="Qix";
        }
        return toReturn;
    }

    public static void main (String[] args)
    {
        FooBarQix foo=new FooBarQix();
        for(int i=0;i<=100;i++) {
            System.out.println(i+ " "+ foo.compute(i));
        }
    }
}