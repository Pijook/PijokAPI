package pl.pijok.api;

import org.bukkit.Material;

public class Utils {

    public static boolean isMaterial(String a){
        try{
            Material.valueOf(a);
            return true;
        }
        catch (IllegalArgumentException e){
            return false;
        }
    }

    public static boolean isInteger(String a){
        try{
            Integer.valueOf(a);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public static double round(double a, int precision){
        int multiplier = (int) Math.pow(10, precision);
        a = a * multiplier;
        a = (int) a;
        a = a / multiplier;
        return a;
    }

}
