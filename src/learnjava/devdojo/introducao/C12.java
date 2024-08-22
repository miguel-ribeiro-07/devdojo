package learnjava.devdojo.introducao;

public class C12 {
    public static void main(String[] args) {
        for (int employeeNumber = 0; employeeNumber <= 50; employeeNumber++) {
            if(employeeNumber > 25) break;
            System.out.println("Employee number: " + employeeNumber);
        }
    }
}
