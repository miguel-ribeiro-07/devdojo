package learnjava.devdojo.introducao;

public class C09 {

    public static void main(String[] args) {
        byte dayInNumber = 4;

        switch(dayInNumber){
            case 1:
                System.out.println("Day : "+ dayInNumber + ", equal Sunday, so Weekend day");
                break;
            case 2:
                System.out.println("Day " + dayInNumber + ", equal Monday, so Business day");
                break;
            case 3:
                System.out.println("Day " + dayInNumber + ", equal Tuesday, so Business day");
                break;
            case 4:
                System.out.println("Day " + dayInNumber + ", equal Wednesday, so Business day");
                break;
            case 5:
                System.out.println("Day " + dayInNumber + ", equal Thursday, so Business day");
                break;
            case 6:
                System.out.println("Day " + dayInNumber + ", equal Friday, so Business day");
                break;
            case 7:
                System.out.println("Day " + dayInNumber + ", equal Saturday, so Weekend day");
                break;
            default:
                System.out.println("Out of range");
        }

        switch (dayInNumber){
            case 1:
            case 7:
                System.out.println("Weekend day");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business day");
                break;
            default:
                System.out.println("Out of range");
                break;
        }
    }
}
