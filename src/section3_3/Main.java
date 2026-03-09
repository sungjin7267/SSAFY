package section3_3;
import java.util.*;

public class Main {
    public ArrayList<Character> solution(int num,int A[],int B[]){
        ArrayList<Character>answer=new ArrayList<>();
        for(int i=0;i<num;i++){
            int a=A[i], b=B[i];
            if(a==1){
                if(b==2){
                    answer.add('B');
                }else if(b==3){
                    answer.add('A');
                }else{
                    answer.add('D');
                }
            }else if(a==2){
                if(b==3){
                    answer.add('B');
                }else if(b==1){
                    answer.add('A');
                }else{
                    answer.add('D');
                }
            }else{
                if(b==1){
                    answer.add('B');
                }else if(b==2){
                    answer.add('A');
                }else{
                    answer.add('D');
                }
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int A[]=new int[num], B[]=new int[num];
        for(int i=0;i<num;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            B[i]=sc.nextInt();
        }
        Main T=new Main();
        for(char x:T.solution(num,A,B)){
            System.out.println(x);
        }
    }
}
