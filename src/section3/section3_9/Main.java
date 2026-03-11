package section3.section3_9;
import java.util.*;

public class Main {
    public int solution(int num,int[][]numArray){
 /*       int max=0;
        for(int i=0;i<num;i++){
            int tmp=0;
            for(int j=0;j<num;j++){
                tmp+=numArray[i][j];
            }
            if(tmp>max){
                max=tmp;
            }
            tmp=0;
            for(int j=0;j<num;j++){
                tmp+=numArray[j][i];
            }
            if(tmp>max){
                max=tmp;
            }
            tmp=0;
            if(i==0){
                for(int j=0;j<num;j++){
                    tmp+=numArray[j][j];
                }
            }
            if(tmp>max){
                max=tmp;
            }
            tmp=0;
            if(i==num-1){
                for(int j=0;j<num;j++){
                    tmp+=numArray[j][i-j];
                }
            }
            if(tmp>max){
                max=tmp;
            }
        }
        return max;*/
        int max=Integer.MIN_VALUE;
        int sum1,sum2;
        for(int i=0;i<num;i++){
            sum1=sum2=0;
            for(int j=0;j<num;j++){
                sum1+=numArray[i][j];
                sum2+=numArray[j][i];
            }
            max=Math.max(max,sum1);
            max=Math.max(max,sum2);
        }
        sum1=sum2=0;
        for(int i=0;i<num;i++){
            sum1+=numArray[i][i];
            sum2+=numArray[i][num-i-1];
        }
        max=Math.max(max,sum1);
        max=Math.max(max,sum2);
        return max;
    }
    public static void main(String []args){
        Main T=new Main();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int [][]numArray=new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                numArray[i][j]=sc.nextInt();
            }
        }
        System.out.println(T.solution(num,numArray));

    }
}
