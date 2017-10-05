public class GetitGotitGood {


 public static void main(String args[]){

     String GetitGotitGood = null;

     for(int counter=1; counter<101; counter++)

     {
         GetitGotitGood= "";

         //Print "Get it" for multiples of 3
         if(counter%3==0)
         {
             GetitGotitGood+="Get it";
         }

         //Print "Got it" for multiples of 5
         if(counter%5==0)
         {
             GetitGotitGood+="Got it";
         }

         //Print "Good" for multiples of 10

         if (counter % 10 == 0)
         {
             GetitGotitGood+="Good";
         }

         //Convert to string value when displayed
         if(counter%3!=0 && counter%5!=0 && counter%10!=0)
         {
            GetitGotitGood=Integer.toString(counter) ;
     }
            System.out.println(GetitGotitGood);
     }

 }
}
