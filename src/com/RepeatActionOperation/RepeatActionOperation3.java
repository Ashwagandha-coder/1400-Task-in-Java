package com.RepeatActionOperation;

public class RepeatActionOperation3 {


    public static void main(String[] args) {

        new RepeatAction3();

    }
}


class RepeatAction3 {

    private final FunRepeatAction3 funReapeatAction3 = () -> {

        for (int i = 10; i <= 100; i++) {

            if (i % 2 == 0)
                System.out.println(i);

        }

    };

    public RepeatAction3() { funReapeatAction3.repeatActionOpr3(); }


}

@FunctionalInterface
interface FunRepeatAction3 {

    void repeatActionOpr3();

}