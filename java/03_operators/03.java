/**
 * logical operator
 * AND ->  &&
 * OR ->  ||
 * NOT -> !
 * 
 */

class Opeartor{
    
    public static void main(String a[]){


        int x = 6;
        int y = 5;

        int a = 64;
        int b = 53;

        boolean result = (x > y && a < b) || !(x < y && a < b);

        System.out.println(result);
    }

}