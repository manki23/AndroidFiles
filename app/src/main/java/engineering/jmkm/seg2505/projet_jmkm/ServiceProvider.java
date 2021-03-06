package engineering.jmkm.seg2505.projet_jmkm;


import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ServiceProvider extends UserAccount {

    private Map<String, String> availability;

    public ServiceProvider(String firstName,String lastName, String eMail,String phoneNumber, String userName, String nameOfCountry, String nameOfCity){
        super(firstName,lastName, eMail,phoneNumber, userName, nameOfCountry, nameOfCity);

        availability = new LinkedHashMap<>();
    }
    // Adding new availability
    public void addAvailability(String day, String time){
        availability.put(day,time);
    }
    // Delete an availability
    public void deleteAvailability(String day){
        availability.remove(day);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void deleteAvailability(String day, String time){
        availability.remove(day, time);
    }

    // return the availability of a precised day
    public String getAvailability(String day){


        return " ";
    }
    // print all availabilities
    public String toString(){
        System.out.println("Availabilities of << " + this.getUserName() +" >> ");
        Set<Map.Entry<String, String>> setAvailability = availability.entrySet();
        for (Map.Entry<String, String> e : setAvailability) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        return " ";
    }
}
