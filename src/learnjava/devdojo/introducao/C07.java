package learnjava.devdojo.introducao;

public class C07 {
    public static void main(String[] args) {
        //ternary operators
        float salary = 500F;
        float ps5Cost = 4000F;
        String canBuyPs5 = (12 * salary) >= ps5Cost ? "i can but it in one year" : "i can´t buy this ps5 =(";

        System.out.println(canBuyPs5);

        // TAXES in Netherlands
        float salaryPerMonth = 5000.0F;
        float tax;
        if(salaryPerMonth <= 34712.00F){
            tax = 9.7F;
        }else if(salaryPerMonth <= 68507.00F){
            tax = 37.35F;
        }else tax = 49.5F;
        System.out.print(tax + " %");
    }
}
