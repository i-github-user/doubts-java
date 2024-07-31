import java.util.*;
class Doubt2{
    public static void main(String[] args) {
        // ArrayList<ArrayList<String>> a=new ArrayList();

        ArrayList<String> alfa2=new ArrayList();
        alfa2.add("ijk");
        alfa2.add("lmn");

        ArrayList<String> alfa=new ArrayList();
        alfa.add("abc");
        alfa.add("def");
        // System.out.println(alfa.get(1));

        ArrayList<ArrayList<String>> coll=new ArrayList();
        coll.add(alfa);
        coll.add(alfa2);
        System.out.println(coll.get(1).get(1));
    }
    
}

//Doubt2.java

//What are these warnings?

// Type safety: The expression of type ArrayList needs unchecked conversion to conform to ArrayList<ArrayList<String>>

// ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized