package com.RepeatActionOperation;

public class RepeatActionOperation4 {


    public static void main(String[] args) {

        new RepeatAction4();

    }
}

class RepeatAction4 {

    public RepeatAction4() {
        FunRepeatAction4 funRepeatAction4 = () -> {

            int i = 189;

            while (true) {

                i++;
                if (i % 17 == 0) {
                    System.out.println(i);
                    break;
                }

            }


        };
        funRepeatAction4.repeatActionOpr4(); }






}

@FunctionalInterface
interface FunRepeatAction4 {

    void repeatActionOpr4();


}
