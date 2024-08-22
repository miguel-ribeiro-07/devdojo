package learnjava.devdojo.introducao;

import java.util.Arrays;

public class C11 {
    public static void main(String[] args){
        /*String[] cars = {"car 1", "car 2"};
        System.out.println(Arrays.toString(cars));*/

        int pointer = 0;

        for(int i = 0; i <= 1000; i++){
          if(i % 2 == 0) System.out.println(i);
        }

        while(pointer <= 10){
            if(pointer % 2 == 0) System.out.println(pointer);
            pointer++;
        }

        do{
            if(pointer % 2 == 0) System.out.println(pointer);
            pointer++;
        }while(pointer <= 10);
    }
}
