package learnjava.devdojo.introducao;

public class C13 {
    public static void main(String[] args){
        float valueCar = 13500;
        int installments = 0;
        float installmentsValue = valueCar;

        while(installmentsValue > 1000){
            if(installments <= 0) installments = 1;
            installmentsValue = valueCar / installments;
            if(installmentsValue < 1000) break;
            System.out.println("Value: " + installmentsValue + " Installments/Months: " + installments);
            installments++;
        }

    }
}
