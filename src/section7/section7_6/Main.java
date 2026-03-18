package section7.section7_6;
import java.util.*;

public class Main {
    public ArrayList<Integer>solution(int num,int arry[]){
        int []beforeArry=new int[num];
        ArrayList<Integer>answer=new ArrayList<>();
        for(int i=0;i<num;i++){ // 정렬 이전 배열 복사
            beforeArry[i]=arry[i];
        }
        Arrays.sort(arry);
        for(int i=0;i<num;i++){ //철수가 앞에 add
            if(beforeArry[i]!=arry[i]) answer.add(i+1);
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arry[]=new int[num];
        for(int i=0;i<num;i++){
            arry[i]=sc.nextInt();
        }
        Main T=new Main();
        for(int x:T.solution(num,arry)){
            System.out.print(x+" ");
        }
    }
}
