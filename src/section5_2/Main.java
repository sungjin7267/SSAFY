package section5_2;
import java.util.*;

public class Main {
    public String solution(String str1, String str2){
        /*HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        String answer="";
        for(char c:str1.toUpperCase().toCharArray()){ //첫번째 문자 대문자 전환 후 개수 입력
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c:str2.toUpperCase().toCharArray()){ //두번째 문자 대문자 전환 후 개수 입력
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        for(char c:map1.keySet()){
            if(!map1.get(c).equals(map2.get(c))){
                answer= "NO";
                break;
            }else answer="YES";
        }
        return answer;*/
        String answer="YES";
        HashMap<Character,Integer>map=new HashMap<>();
        for(char x:str1.toCharArray()){ //해쉬 맵에 넣기
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char x:str2.toCharArray()){
            if(!map.containsKey(x)||map.get(x)==0) return "NO";
            map.put(x,map.get(x)-1);
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        Main T=new Main();
        System.out.println(T.solution(str1,str2));
    }
}
