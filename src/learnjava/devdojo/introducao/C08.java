package learnjava.devdojo.introducao;

public class C08 {
    public static void main(String[] args){
        // for switch need one of primitive types Char, int, byte, enum, short or String
        int dayOfWeek = 4;
        char gender = 'Q';

        switch(dayOfWeek){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Isn´t a day of week");
                break;
        }

        switch (gender){
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Not a specific gender");
        }
    }
}