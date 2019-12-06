public class AliasPractice {
    public static void main(String args[]) {
        Num n1 = new Num(56);
        Num n2 = new Num(57);
//        Integer i1 = new Integer(23);
//        Integer i2 = new Integer(24);

        n1 = n2;
        System.out.println("n1 has " + n1);    //expect 57

        n2 = 90;
        System.out.println ("n2: " + n2);
        System.out.println ("n1: " + n1);

/*
        i1 = i2;
        System.out.println(i1);

        i2 = 60;
        System.out.println(i1);
        System.out.println(i2);

 */
    }//end main method

}//end class AliasPractice
