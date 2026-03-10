package section5_4;
import java.util.*;

public class Main {
    public int solution(String str, String sub){
        int answer=0,lt=0,count=0;
        HashMap<Character,Integer>map1=new HashMap<>();
        for(char c:sub.toCharArray()){ //HashMap에 sub 문자 개수 입력
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        HashMap<Character, Integer>map2=new HashMap<>();
        for(int i=0;i<sub.length();i++){
            char curr=str.charAt(i);
            map2.put(curr,map2.getOrDefault(curr,0)+1);
        }
        if(map1.equals(map2)) answer++;
        for(int rt=sub.length();rt<str.length();rt++){
            map2.put(str.charAt(rt),map2.getOrDefault(str.charAt(rt),0)+1);
            map2.put(str.charAt(lt),map2.getOrDefault(str.charAt(lt),0)-1);
            if(map2.get(str.charAt(lt))==0){
                map2.remove(str.charAt(lt));
            }
            lt++;
            if(map1.equals(map2)) answer++;
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String sub=sc.nextLine();
        Main T=new Main();
        System.out.println(T.solution(str,sub));
    }
}
