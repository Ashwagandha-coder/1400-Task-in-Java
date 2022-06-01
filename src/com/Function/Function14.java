package com.Function;

import java.util.Scanner;

public class Function14 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int ab = scanner.nextInt();
        int ad = scanner.nextInt();
        int cd = scanner.nextInt();
        int bd = new RectangleBAD().PayMentSideBD(ad,ab);
        int bc = new RectangleBDC().PayMentSideBC(bd,cd);

        int perimetrBAD = new RectangleBAD().PerimetrBAD(ad,ab,bd);
        int perimetrBDC = new RectangleBDC().PerimetrBDC(bd,cd,bc);

        new ImplSumPerimetr(perimetrBAD, perimetrBDC);




    }
}
class RectangleBAD {

    public int PayMentSideBD(int ad, int ab) {

        int bd = (int) (Math.pow(ad,2) + Math.pow(ab, 2));
        int result = (int) Math.pow(bd, 0.5);

        return result;
    }


    public int PerimetrBAD(int ad, int ab, int bd) { return ad + ab + bd; }

}



class RectangleBDC {

    public int PayMentSideBC(int bd, int cd) {

        int bc = (int) (Math.pow(cd,2) + Math.pow(bd,2));
        int result = (int) Math.pow(bc, 0.5);

        return result;

    }

    public int PerimetrBDC(int bd, int cd, int bc) { return bd + cd + bc; }


}
@FunctionalInterface
interface Perimetr {

    void SumPerimetr();

}

class ImplSumPerimetr {

    private int PERIMETR_BAD;
    private int PERIMETR_BDC;

    public ImplSumPerimetr(int PERIMETR_BAD, int PERIMETR_BDC) {
        this.PERIMETR_BAD = PERIMETR_BAD;
        this.PERIMETR_BDC = PERIMETR_BDC;
        perimetr.SumPerimetr();
    }

    Perimetr perimetr = () -> System.out.println(this.PERIMETR_BAD + this.PERIMETR_BDC);



}

// task 14.14
