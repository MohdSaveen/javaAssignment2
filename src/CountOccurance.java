import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sc=scanner.next();
        char[] ch=sc.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<sc.length();i++){
            if(map.containsKey(ch[i])){
                int z=map.get(ch[i]);
                map.put(ch[i],z+1);
            }else{
                map.put(ch[i],1);
            }
        }
        for(Map.Entry<Character,Integer>hm:map.entrySet()){
            System.out.println(hm.getKey()+"-"+hm.getValue());
        }
    }
}
