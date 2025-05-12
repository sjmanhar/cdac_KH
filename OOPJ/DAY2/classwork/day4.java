import java.util.Scanner; // for input
class Day4 {
       public static void main(String args[]){
/*
       int arr1[][]= new int[3][3]; 
       System.out.println(arr1.length);
       System.out.println(arr1[0].length);
       System.out.println(arr1[1].length);
       System.out.println(arr1[2].length);

       for(int i=0; i<arr1.length; i++){
               for(int j =0 ; j<arr1[i].length; j++){
       
               System.out.print(arr1[i][j]+ " ");

      }
     System.out.println();
}


       for(int i=0; i<arr1.length; i++){
               for(int j =0 ; j<arr1[i].length; j++){
               arr1[i][j]=10;
               System.out.print(arr1[i][j]);

      }
     System.out.println();
}

*/

//jagged array
        int arr1[][]= new int[3][]; 

arr1[0]= new int[2];
arr1[1]= new int[4];
arr1[2]= new int[3];

//System.out.println(arr1[0][0]);
/*
for(int i=0; i<arr1.length; i++){
               for(int j =0 ; j<arr1[i].length; j++){
       
               System.out.print(arr1[i][j]+ " ");

      }
     System.out.println();
}
*/
/*
       for(int i=0; i<3; i++){
               for(int j =0 ; j<4; j++){
               arr1[i][j]=10;
               System.out.print(arr1[i][j]);

      }
     System.out.println();
}
*/


//input by user

     Scanner sc = new Scanner(System.in);
     //int a =sc.nextInt();
     //float f= sc.nextFloat();
       //String s =sc.nextLine();
      char s = sc.next().charAt(0);
/*
nextLong();
nextDouble();
Byte();
Short();

next();
nextLine();
*/
 //    System.out.println("value of a:"+ a);
//     System.out.println("value of f:"+ f);
     System.out.println("hello "+ s);

}
}