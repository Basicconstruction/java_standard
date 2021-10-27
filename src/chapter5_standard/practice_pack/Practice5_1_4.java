package chapter5_standard.practice_pack;

import java.util.HashMap;
import java.util.Map;

public class Practice5_1_4 {
    public static void main(String[] argv){
        String[] sarr = {"a","b","a","b","c","a","b","c","b"};
        Map<String,Integer> map = new HashMap<>();
        for(String s:sarr){
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }
        }
        System.out.println(map);
    }
}
