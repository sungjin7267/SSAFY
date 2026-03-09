package section3_11;
import java.util.*;

public class Main {
    public int solution(int num,int [][]numArray){
        /*boolean check[][]=new boolean[num][num];
        int answerArray[]=new int[num];
        for(int i=0;i<num;i++){ //i가 지금 i번학생
            for(int j=0;j<5;j++){ //j가 학년
                int curr=numArray[i][j];
                for(int k=0;k<num;k++){//k가 다른학생
                    if(curr==numArray[k][j]&&i!=k){
                        check[i][k]=true; // i,j->(2,1),(2,2) k,j->
                    }
                }
            }
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(check[i][j]==true){
                    answerArray[i]+=1;
                }
            }
        }
        int answer=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num;i++){
            if(answerArray[i]>max){
                max=answerArray[i];
                answer=i+1;
            }
        }
        return answer;*/
        int answer=0, max=Integer.MIN_VALUE;
        for(int i=0;i<num;i++){//학생
            int check=0;
            for(int j=0;j<num;j++){ //다른 학생
                for(int k=0;k<5;k++){//학년
                    if(numArray[i][k]==numArray[j][k]){
                        check++;
                        break;
                    }
                }
            }
            if(max<check){
                max=check;
                answer=i+1;
            }
        }
        return answer;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int numArray[][]=new int[num][5];
        for(int i=0;i<num;i++){
            for(int j=0;j<5;j++){
                numArray[i][j]=sc.nextInt();
            }
        }
        Main T=new Main();
        System.out.println(T.solution(num,numArray));
    }
}
