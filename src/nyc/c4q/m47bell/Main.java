package nyc.c4q.m47bell;
/*Marbella Vidals
*Access code 2-1
*Week 1 Review
*/

public class Main {

    public static void main(String[] args) {
       /* int i = 3;
        System.out.println(i);

            for (i = 0;i< 10;i++){
                    //System.out.println("hello, world");
                    System.out.println(i);
            }

        System.out.println(i);//i is ten because i is less than 10 is false!, will exit loop because the condition was no longer true (i <10)

         int k=0;

        while(k<10){
            System.out.println(k);
            k++;
        }

        */
        /*
        int k=0;

        while(terminate(k)){ // returning a method terminate within a while loop
          k++;
          System.out.println(k);

        }
        */
        //using a for loop to call a method
        for(int i=0;i< 10; i++){

            System.out.println(i);
            System.out.println(weLoveJava("C4Q"));// prints out java 10x; C4Q will be linked to the variable

        }

    }

    public static String weLoveJava(String myStr){

        //System.out.println("We love Java!");
        System.out.println(myStr);
        return "c4q is awesome";
    }

    public static boolean terminate(int k){
        //declaring a method- terminate and will return you a boolean value
        if (k <10) {
            return true;
        } else {
            return false;

        }


    }
}
