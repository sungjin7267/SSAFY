package section7.section7_7;
import java.util.*;

class Coordinate implements Comparable<Coordinate>{
    public int x,y;
    Coordinate(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public int compareTo(Coordinate o){
        if(this.x==o.x) return this.y-o.y;
        else return this.x-o.x;
    }
}
public class Main {
    /*public Coordinate[]solution(int num,Coordinate arry[]){
        for(int i=0;i<num;i++){
            for(int j=0;j<num-1-i;j++){
                if(arry[j].x>arry[j+1].x){ //x값 비교해서 이전이 크면 switch
                    Coordinate tmp=arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=tmp;
                }
                else if(arry[j].x==arry[j+1].x){ //같다면 y값 비교
                    if(arry[j].y>arry[j+1].y){
                        Coordinate tmp=arry[j];
                        arry[j]=arry[j+1];
                        arry[j+1]=tmp;
                    }
                }
            }
        }
        return arry;
    }*/
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<Coordinate> arry=new ArrayList<>();
        for(int i=0;i<num;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            arry.add(new Coordinate(x,y));
        }
        Collections.sort(arry);
        for(Coordinate x:arry){
            System.out.println(x.x+" "+x.y);
        }
    }
}
