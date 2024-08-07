package learnjava.devdojo.introducao;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Exercise {
    public static void main(String[] args) {
        String name = "Miguel Garcy";
        String address = "403 East";
        float salary = 1302.50F;
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, 01, 20);
        Date salaryDateUnformated = calendar.getTime();
        //MM uppercase because mm meaning minutes
        SimpleDateFormat formatObj = new SimpleDateFormat("dd/MM/yyyy");
        String salaryDate = formatObj.format(salaryDateUnformated);


        String report = "Im " + name + " salary date: " + salaryDate;

        System.out.println(report);

    }
}
