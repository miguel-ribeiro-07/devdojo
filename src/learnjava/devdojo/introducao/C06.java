package learnjava.devdojo.introducao;

public class C06 {
    public static void main(String[] args){
        // age < 15 category junior
        // age >=15 && age < 18 category senior
        // age >=18 category masters

        int age = 10;
        String category = "";

        if(age < 15){
            category = "Junior category";
        } else if (age >= 15 && age < 18) {
            category = "Senior category";
        } else{
            System.out.println("Isn´t inside");
        }
        System.out.println(category);
    }
}
