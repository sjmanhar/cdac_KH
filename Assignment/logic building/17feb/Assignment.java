/* //que 1
class Assignment{
       public static void main(String args[]){
                System.out.println("hello cdac");
                System.out.print("shubhra jyotsna Manhar");
                }
          }
*/ 

/* //que 2
class Assignment{
       public static void main(String args[]){
                int a= 74, b= 36;
                System.out.print(a+b);
                }
          }
*/

/* //que3
class Assignment{
       public static void main(String args[]){
                int a= 50, b= 3;
                System.out.print(a/b);
                }
         }
*/

/* //que4
class Assignment{
       public static void main(String args[]){
                System.out.println(-5+8*6);
                System.out.println((55+9)%9);
                System.out.println(20+ -3 *5/8);
                System.out.println(5+15/3*2-8%3);

                }
         }
*/

/* //que5
class Assignment{
       public static void main(String args[]){
                int  a = 25;
                int b= 5;
                
                System.out.println(a + "*" + b + "="+ a*b);

                }
         }
*/
/*
//que6
class Assignment{
        public static void main(String args[]){
                int a = 125;
                int b= 24;
                
              int add= a+b;
              int  sub= a-b;
              int  mul= a*b;
              int  div= a/b;
              int  mod= a%b;

               System.out.println("125 + 24 = "+add);
               System.out.println("125 - 24 = "+sub);
               System.out.println("125 * 24 = "+mul);
               System.out.println("125 / 24 = "+div);
               System.out.println("125 % 24 = "+mod);
}
}
*/
/*
//que7

class Assignment{
        public static void main(String args[]){
             int a = 8;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}
*/
/*
//que8

class Assignment{
        public static void main(String args[]){
           int a =10 , b= 20;

           System.out.println("Before Swap");
           System.out.println("first number:" + a);
           System.out.println("second number:" + b);

           int x= a;
           a=b;
           b= x;

           System.out.println("After swap");
           System.out.println("first number:" + a);
           System.out.println("second number:" + b);

       }
}
*/
/*
//que 9

class Assignment{
        public static void main(String args[]){
int radius = 7;
double pi= 3.14159;
double Area = pi*radius*radius;
System.out.println(" area of the circle is " + Area);
}
}
*/
/*
//que 10

class Assignment{
        public static void main(String args[]){
         int a = 15;
         if(a%2 == 0)
            System.out.println(a +" is even");
         else
             System.out.println(a + " is odd");

           }
}
*/
/*
//que11

class Assignment {
    public static void main(String args[]) {
        int a = 12, b = 45, c = 22;

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is greatest");
            } else {
                System.out.println(c + " is greatest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is greatest");
            } else {
                System.out.println(c + " is greatest");
            }
        }
    }
}
*/
/*
//que 12

class Assignment {
    public static void main(String args[]) {

    int a = 12345, reversed = 0;

    for(;a != 0; a /= 10) {
      int digit = a % 10;
      reversed = reversed * 10 + digit;
    }

    System.out.println("Reversed Number: " + reversed);
}
}
*/
/*
//que 13 

class Assignment {
    public static void main(String args[]) {
    
    int a = 20, b = 40, c = 60;
    int Average= (a + b + c) /3;
    System.out.println("Average is: " + Average);
}
}
*/
/*
//que 14

class Assignment {
    public static void main(String args[]) {
    
    int num1 =0, num2=1;
    
    for(int i=1; i<=10; ++i){
        System.out.print(num1 + " ");
    int sum = num1 + num2;
    num1 = num2;
    num2 = sum;
    }
    
  }
}
*/
/*
//que 15

class Assignment {
    public static void main(String args[]) {
         int a=1 , n=5;
         for(int i=1; i<=n;i++){
            a*=i;
            }
    System.out.print(a + " " );
}
}
*/

//que16
/*
class Assignment {
    public static void main(String args[]) {

      int a = 17;
      if(a % 2==0){
         System.out.print(a + "is a not prime");
      }else{
         System.out.print(a + " is a prime");
      }
   }
}
*/

//que 17
/*
class Assignment {
    public static void main(String args[]) {
          int n = 6;
          for(int i =1 ; i<=n; i++){
          System.out.print(i);
          }
    }
}
*/

//que 18
/*
class Assignment {
    public static void main(String args[]) {
          int n = 25;
          double F =(n*9/5)+32;
          System.out.println(n+"C is equal to "+ F+ "F");

}
}
*/

//que19
/*
class Assignment {
    public static void main(String args[]) {
          int a = 3;
          int n = 4;
          int p = 1;

for (int i=1; i<=n; i++){
     p = p*a;
}

     System.out.print(a + "raised to the " + n + "is " + p);


}}

*/
//que 20

class Assignment {
    public static void main(String args[]) {
          int a = 123456, c = 0;
          for (; a != 0; a /= 10, ++c) {
    }

    System.out.println("Number of digits: " + c);
}}

