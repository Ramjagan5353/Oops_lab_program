import java.util.HashMap;
import java.util.Map;

class map {
    public static void main(String[] args) {
        Map<String,Integer> obj=new HashMap<String,Integer>();
        obj.put("Jagan", 22);
        obj.put("Swathi", 22);
        obj.put("Ranga", 16);
        for(Map.Entry<String,Integer> m:obj.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}
