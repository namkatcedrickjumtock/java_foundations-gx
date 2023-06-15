## Java Foundamentals
1- An expression is a piece of code the produces a value.

    Date now = new Date();
    String msg = "Hello World" + "!!";
    arrays are references types hence the new operator
    type value = reference type, array **size**.

 -  Arrays have a fixed length, which means new values can't be added to it.
 
        int[] numbers =**** new int[5]; 
        numbers[0] =1;
        numbers[1] =2;
        System.out.println(Arrays.toString(numbers));

- creating a 2-dimensional array to store a matrix.
  
       every array is a row in dimensional arrays
int[][] twoDimensionalArray = new int[2][3];
       by adding an extra [] increase the dimension of the array.
twoDimensionalArray[0][0]= 3;
twoDimensionalArray[0][1]= 5;

          System.out.println(Arrays.deepToString(twoDimensionalArray));
       System.out.println(msg.replace("!","*"));
       final float pi = 3.14F;

       defining a constant
       NB: the order of operation.
       - () always evaluated first.
       - /* secondly and
       +- thirdly.
       (10+3)*3 or 10+6 * 2
       ## Type casting.
       - a short can hold 2 bytes, int 4 bytes, long 8 bytes

       - all primitive types have a wrapper class for type casting
       - 
String x = "2";
double y = 2.1 + Double.parseDouble(x);
System.out.println(y);


### control Flows