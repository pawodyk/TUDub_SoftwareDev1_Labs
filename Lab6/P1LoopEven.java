/**
 * Programmer: 	Pawel Wodyk 
 * StudentID: 	B00122935 
 * Written on:	05/12/18 
 * Function:
 * 		Prints the sum of all even integers between 1 and 40 inclusive using For Loop.
 */



class P1LoopEven{
    public static void main(String[] args) {
        int sum =0;
        
        for (int i = 1; i <=40; i++){
            if (i%2==0){
                //System.out.println(i); // this code was used for testing
                sum += i;
            }     
        }

        System.out.println("The sum of odd numbers between 1 and 40 is " + sum);
    }
}