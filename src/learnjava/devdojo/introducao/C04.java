package learnjava.devdojo.introducao;

public class C04 {
    /**
     * Operators
     */
    public static void main(String[] args){
        int numb01 = 2;
        double numb02 = 5;
        double result = numb01 /numb02;
        //System.out.println("Value: " + (numb01 + numb02));
        //System.out.println(result);

        // % operator

        int module = 35 % 7;
        //System.out.println(module);

        // relational operators

        int x = 2;
        boolean isTwiceXBiggerThen = (x*2) > 10;
        //System.out.println(isTwiceXBiggerThen);

        //logical operators in pratice
        /**
         * AND
         */
        int age = 23;
        float salary = 2000F;
        boolean isOnTheImigrantRulesAtThirty;
        isOnTheImigrantRulesAtThirty = (age < 30 && salary >= 3381) || (age >= 30 && salary >= 4612);

        System.out.println("isOnTheImigrantRulesAtThirty: " + isOnTheImigrantRulesAtThirty);

        /**
         * OR
         */

        float myCurrentBudget = 250.10F;
        float myVaultMoney = 4000.50F;
        float playstationCost = 3999.99F;
        boolean isPlaystationPurchasable;

        isPlaystationPurchasable = (myCurrentBudget >= playstationCost) || (myCurrentBudget + myVaultMoney >= playstationCost);
        //System.out.println("Current budget: "+ (myCurrentBudget + myVaultMoney) +  " | Playstation price: "+ playstationCost + " isPlaystationPurchasable: " +isPlaystationPurchasable);

        // ASSIGNMENT Operators
        double exampleNumber = 1000.5D;
        exampleNumber += 200;
        exampleNumber -= 200;
        exampleNumber *= 2;
        exampleNumber /= 2;
        exampleNumber %= 1;

        System.out.println(exampleNumber);

        //Unary - increment
        int count = 0;
        count ++;
        count --;
        System.out.println(count++);
        System.out.println(count);
    }
}
