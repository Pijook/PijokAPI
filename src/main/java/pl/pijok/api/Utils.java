package pl.pijok.api;

import org.bukkit.Material;

import java.util.*;

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

    public static Map<String, Integer> sortStringIntegerMap(Map<String, Integer> unsortedMap, final boolean order) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortedMap.entrySet());

        // Sorting the list based on values
        list.sort((o1, o2) -> {
            if (order) {
                return o1.getValue().compareTo(o2.getValue());
            } else {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static Map<String, Double> sortStringDoubleMap(Map<String, Double> unsortedMap, final boolean order) {
        List<Map.Entry<String, Double>> list = new LinkedList<>(unsortedMap.entrySet());

        list.sort((o1, o2) -> {
            if (order) {
                return o1.getValue().compareTo(o2.getValue());
            } else {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Map<String, Double> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static double randomDoubleInRange(double rangeMin, double rangeMax){
        Random r = new Random();
        return rangeMin + (rangeMax - rangeMin) * r.nextDouble();
    }

}
