package section5_1;
import java.util.*;

public class Main {
    public char solution(int stuNum,String s){
        /*HashMap<Character,Integer>map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        char answer=' ';
        map.put('A',0);
        map.put('B',0);
        map.put('C',0);
        map.put('D',0);
        map.put('E',0);
        for(int i=0;i<stuNum;i++) {
            char c = s.charAt(i);
            int value = map.get(c) + 1;
            map.put(c, value);
            if (value > max) {
                max = value;
            }
        }
        for(char c:map.keySet()){
            if(map.get(c)==max){
                answer=c;
            }
        }
        return answer;*/
        HashMap<Character,Integer>map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        char answer=' ';
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:map.keySet()){
            if(map.get(c)>max){
                max=map.get(c);
                answer=c;
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int stuNum=sc.nextInt();
        String s=sc.next();
        Main T=new Main();
        System.out.println(T.solution(stuNum,s));
    }
}
