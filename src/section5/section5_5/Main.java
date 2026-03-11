package section5.section5_5;
import java.util.*;

public class Main {
    public int solution(int num1,int num2,int[]arr){
        int answer=-1;
        TreeSet<Integer>Tset=new TreeSet<>(Collections.reverseOrder()); //큰수부터 내림차순
        for(int i=0;i<num1;i++){
            for(int j=i+1;j<num1;j++){
                for(int k=j+1;k<num1;k++){
                    Tset.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int cnt=0;
        for(int x:Tset){
            cnt++;
            if(cnt==num2) return x;
        }
        return answer;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int arr[]=new int[num1];
        for(int i=0;i<num1;i++){
            arr[i]=sc.nextInt();
        }
        Main T=new Main();
        System.out.println(T.solution(num1,num2,arr));
    }
}
