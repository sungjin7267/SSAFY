package section3.section3_1;

import java.util.*;
public class Main {
    public ArrayList<Integer> solution(int num,int numArray[]){
        /*int answer[]=new int[num];
        answer[0]=numArray[0];
        int index=1;
        for(int i=1;i<num;i++){
            if(numArray[i]>numArray[i-1]){
                answer[index]=numArray[i];
                index++;
            }
        }
        int answer2[]=new int[index];
        for(int i=0;i<index;i++){
            answer2[i]=answer[i];
        }
        return answer2;*/
        ArrayList <Integer> answer=new ArrayList<>();
        answer.add(numArray[0]);
        for(int i=1;i<num;i++){
            if(numArray[i]>numArray[i-1]){
                answer.add(numArray[i]);
            }
        }
        return answer;
    }
    public static void main(String args[]) {
        Main T=new Main();
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        int numArray[]=new int[num];
        for(int i=0;i<num;i++) {
            numArray[i] = Integer.parseInt(sc.next());
        }
        for(int x:T.solution(num,numArray)){
            System.out.print(x+" ");
        }
    }
}
