package learnjava.devdojo.introducao;

public class C07 {
    public static void main(String[] args){
        //ternary operators
        int salary = 500;
        float ps5Cost = 4000;
        String canBuyPs5 = (12 * salary) >= ps5Cost ? "i can but it in one year" : "i can´t buy this ps5 =(";

        System.out.println(canBuyPs5);
    }
}
