package section6.section6_3;
import java.util.*;

public class Main {
    public int solution(int num, int arr[][],int chance,int chanceArr[]){
        Stack<Integer>stack=new Stack<>();
        int answer=0;
        for(int x:chanceArr){
            int pick=0;
            for(int i=0;i<num;i++){
                if(arr[i][x-1]!=0){
                    pick=arr[i][x-1];
                    arr[i][x-1]=0;
                    break;
                }
            }
            if(pick==0) continue; //0밖에 없을때 다음 x로 넘어감
            if(stack.isEmpty()){
                stack.push(pick);
            }else{
                int curr=stack.pop();
                if(curr==pick){//하나 pop한 뒤에 pick와 같으면 냅두고 answer+2하기
                    answer+=2;
                }else{ //아니라면 다시 넣고, pick도 넣기
                    stack.push(curr);
                    stack.push(pick);
                }
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[][]=new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int chance=sc.nextInt();
        int chanceArr[]=new int[chance];
        for(int i=0;i<chance;i++){
            chanceArr[i]=sc.nextInt();
        }
        Main T=new Main();
        System.out.println(T.solution(num,arr,chance,chanceArr));
    }
}
