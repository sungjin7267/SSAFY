package section7.section7_4;
import java.util.*;

public class Main {
    public int[] solution(int size,int n,int []arry){
        ArrayList<Integer>list=new ArrayList<>();
        int []answer=new int[size];
        for(int i=0;i<n;i++){
            if(list.contains(arry[i])){
                int index=list.indexOf(arry[i]);
                list.remove(index);
                list.add(arry[i]);
            }else{
                list.add(arry[i]);
            }
        }
        for(int i=0;i<size;i++){
            answer[i]=list.get(list.size()-i-1);
        }
        return answer;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int n=sc.nextInt();
        int arry[]=new int[n];
        for(int i=0;i<n;i++){
            arry[i]=sc.nextInt();
        }
        Main T=new Main();
        for(int x:T.solution(size,n,arry)){
            System.out.print(x+" ");
        }
    }
}
