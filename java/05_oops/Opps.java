/**
 * Method Overloading - Two method with same name but different parameters
 * 
 * in Stack Memory - Every method have its own stack memeory (local variable is the part of stack)
 * 
 * In Heap Memory - Instance variable stored in heap memory
 */

class Calculator{

    int num = 8;       // num is called instance variable and n1,n2,n3 called local variable

    public int add(int n1, int n2){
        System.out.println(num);
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2){
        return n1 + n2;
    }

}

class Opps{
    
    public static void main(String a[]){

        int num1 = 5;
        int num2 = 7;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);

        System.out.println(calc.num);
        
        System.out.println(result);

    }

}