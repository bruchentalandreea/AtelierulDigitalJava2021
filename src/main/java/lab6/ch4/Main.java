package lab6.ch4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List elements = Arrays.asList(1,2,3,4,5,76,56,33,77);
        Collections.sort(elements);
        System.out.println(elements);

        List newList = new ArrayList();
        for(int i=0;i<=elements.size()/2; i++){
            if(elements.size()%2==1 && i==elements.size()/2)
            {
                System.out.println(elements.get(i) + " ");
            }
            else
            {
                System.out.println(elements.get(i) + " ");
                System.out.println(elements.get(elements.size()-i-1) + " ");
            }
        }

    }
}
