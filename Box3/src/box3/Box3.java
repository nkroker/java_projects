/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box3;

/**
 *
 * @author HP
 */
public class Box3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box4 p=new Box4();
        Box4 p1=new Box4(30,40,60);
        System.out.println("values of w, h,d are \n"+ p1.getW()+"\t"+ p1.getH()+"\t"+ p1.getD());
        p1.setW(10);
        p1.setH(20);
        p1.setD(30);
        System.out.println("the values of w,h,d \n"+p1.getW()+"\t"+ p1.getH()+"\t"+ p1.getD());
        System.out.println("volOFBox4"+ p1.volOfBox4());
    }
    
}
 