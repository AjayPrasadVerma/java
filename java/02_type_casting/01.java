class Casting{

public static void main(String a[]){

    byte b = 127;
    int num = b;  // implicit type casting

    int num1 = 23;
    byte k = (byte)num1;   // explicit type casting


    int num2 = 257;
    byte b2 = (byte)num2;   // byte range is -128 to 127 , but here we try to store outof range value (perform modulas operation 257%256 )

    System.out.println(b);
    System.out.println(a);
    System.out.println(k);
    System.out.println(b2);

    float f1 = 23.4f;
    int t = (int)f1;

    System.out.println(t);

    // Type Permotion

    byte b3 = 10;
    byte b4 = 30;

    int num4 = b3 * b4;

    System.out.println(num4);

}

}