package com.RepeatActionOperation;

public class RepeatActionOperation5 {


    public static void main(String[] args) {

        new RepeatAction5().repeatActionOpr5();

    }
}

class RepeatAction5 implements InterRepeatAction5 {

    @Override
    public void repeatActionOpr5() {

        for (int i = 5000; i >= 0; i--) {

            if (i % 139 == 0) {

                System.out.println(i);
                break;

            }

        }

    }
}


interface InterRepeatAction5 {

    void repeatActionOpr5();

}
