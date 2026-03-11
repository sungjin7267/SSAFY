package section4.section4_1;
import java.util.*;

public class Main {
    public ArrayList<Integer>solution(int num1,int num2,int[]arry1,int[]arry2){
        /*int answer[]=new int[num1+num2];
        int p1=0,p2=0,index=0;
        while(p1!=num1||p2!=num2){
            int n1=arry1[p1], n2=arry2[p2];
            if(p1==num1){
                answer[index]=n2;
                p2++;
            }else if(p2==num2){
                answer[index]=n1;
                p1++;
            }else{
                if(n1<n2){
                    answer[index]=n1;
                    p1++;
                }else{
                    answer[index]=n2;
                    p2++;
                }
            }
            index++;
        }
        return answer;*/
        ArrayList<Integer>answer=new ArrayList<>();
        int p1=0,p2=0;
        while(p1<num1&&p2<num2){
            if(arry1[p1]<arry2[p2]) answer.add(arry1[p1++]);
            else answer.add(arry2[p2++]);
        }
        while(p1<num1) answer.add(arry1[p1++]);
        while(p2<num2) answer.add(arry2[p2++]);
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int arry1[]=new int[num1+1];
        for(int i=0;i<num1;i++){
            arry1[i]=sc.nextInt();
        }
        int num2=sc.nextInt();
        int arry2[]=new int[num2+1];
        for(int j=0;j<num2;j++){
            arry2[j]=sc.nextInt();
        }
        Main T=new Main();
        for(int x:T.solution(num1,num2,arry1,arry2)){
            System.out.print(x+" ");
        }
    }
}
