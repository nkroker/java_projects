package box3;

/**
 *
 * @author HP
 */
public class Box4 {
    private int w;
    private int h;
    private int d;
    public Box4(){
        w=2;
        h=4;
        d=6;
    }
    public Box4(int x,int y,int z){
        w=x;
        h=y;
        d=z;
    }
    public void setW(int w){
        this.w=w;
        
    }

public int getW(){
return w;
}
public void setH(int h){
this.h=h;
}
public int getH(){
return h;
}
public  void setD(int d){
this.d=d;
}
public int getD(){
return d;
}
public int volOfBox4(){
return w*h*d;
}
}