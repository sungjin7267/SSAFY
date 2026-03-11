package section4.section4_2;
import java.util.*;

public class Main {
    public ArrayList<Integer>solution(int num1,int[]arry1,int num2,int arry2[]){
        ArrayList<Integer>answer=new ArrayList<>();
        Arrays.sort(arry1);
        Arrays.sort(arry2);
        int p1 = 0,p2=0;
        while(p1<num1&&p2<num2){
           if(arry1[p1]<arry2[p2]) p1++;
           else if(arry1[p1]>arry2[p2]) p2++;
           else {
               answer.add(arry2[p2]);
               p1++;p2++;
           }
        }
        return answer;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int arry1[]=new int[num1];
        for(int i=0;i<num1;i++){
            arry1[i]=sc.nextInt();
        }
        int num2=sc.nextInt();
        int arry2[]=new int[num1];
        for(int i=0;i<num1;i++){
            arry2[i]=sc.nextInt();
        }
        Main T=new Main();
        for(int x:T.solution(num1,arry1,num2,arry2)){
            System.out.print(x+" ");
        }
    }
}
