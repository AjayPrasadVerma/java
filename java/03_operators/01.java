class Opeartor{
    
    public static void main(){

        int num1 = 288;
        int num2 = 87;

        int result = num1 + num2;

        int result1 = num1/num2;

        int result2 = num1 % num2;

        // num1 += 1
        num1 ++;  // post - increment
        ++num1;  // pre-increment

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

        System.out.println("=================");

        int res = num2++;  /// fetch the value and then increment
        int res = ++num2;  /// first increment 
        System.out.println(res);
    }

}