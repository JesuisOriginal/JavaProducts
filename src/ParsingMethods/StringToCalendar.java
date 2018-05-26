package ParsingMethods;

import Controller.ControllerInput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StringToCalendar {

    public Calendar stringToCalendar() {
        ControllerInput input = new ControllerInput();
        String entra1 = input.input();
        Calendar calendar = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            calendar = Calendar.getInstance();
            calendar.setTime(sdf.parse(entra1));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return calendar;
    }



}
