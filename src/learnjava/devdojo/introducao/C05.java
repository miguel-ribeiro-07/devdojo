package learnjava.devdojo.introducao;

public class C05 {
    public static void main(String[] args){
        int age = 10;
        boolean isProhibited = age <= 18;

        if(!isProhibited) {
            System.out.println("Authorized | Age:" + age);
        }else System.out.println("Not authorized | Age:" + age);

    }
}
