package section3_6;
import java.util.*;

public class Main {
    public ArrayList<Integer>solution(int num,int []numArray){
        ArrayList<Integer> answer=new ArrayList<>();
        for(int i=0;i<num;i++){
            /*int tmp=numArray[i];
            int res=0;
            while(tmp>0){
                int t=tmp%10; //가장 오른쪽 숫자 빼기
                res=res*10+t; //이전 숫자는 다음 자릿수로 넘기고, 받은 가장 오른쪽 숫자를 옆에 넣기
                tmp=tmp/10; // 사용한 가장 오른쪽 숫자 쳐내기
            }*/
            String str=String.valueOf(numArray[i]);
            str=new StringBuilder(str).reverse().toString();
            int currNum=Integer.parseInt(str);
            int count=0;
            if(currNum==1){
                count=1;
            }
            for(int j=2;j<=Math.sqrt(currNum);j++){
                if(currNum%j==0||currNum==1) count++;
            }
            if(count==0){
                answer.add(currNum);
            }
        }
        return answer;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int numArray[]=new int[num];
        for(int i=0;i<num;i++){
            numArray[i]=sc.nextInt();
        }
        Main T=new Main();
        for(int x: T.solution(num,numArray)){
            System.out.print(x+" ");
        }
    }
}
