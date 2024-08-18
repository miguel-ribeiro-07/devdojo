package learnjava.devdojo.introducao;

public class C10 {
    public static void main(String[] args) {
        byte num = 1;

        /*while(num <= 10){
            System.out.println("Counting " + num);
            num++;
        }*/

        /*do{
            System.out.println("Counting version 2.0 " + num);
            num++;
        }while(num <= 10);*/

        for(int i = 0; i <= 10; i++){
            System.out.println("Counting " + i);
        }
    }
}
