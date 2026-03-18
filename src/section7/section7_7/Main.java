package section7.section7_7;
import java.util.*;

class Coordinate{
    int x,y;
    public Coordinate(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Main {
    public Coordinate[]solution(int num,Coordinate arry[]){

    }
    public static void main(String args[]){
        Main T=new Main();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Coordinate arry[]=new Coordinate[num];
        for(int i=0;i<num;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            arry[i]=new Coordinate(x,y);
        }
        for(Coordinate i:T.solution(num,arry)){
            System.out.println(i.x+" "+i.y);
        }
    }
}
