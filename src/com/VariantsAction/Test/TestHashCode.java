package com.VariantsAction.Test;

public class TestHashCode {

    public static void main(String[] args) {

      //  Object obj = new Object();
      //  System.out.println(obj.getClass());

        HashCode hashCode = new HashCode();
        System.out.println(hashCode.getClass());
    }
}
class HashCode implements Cloneable {

    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
