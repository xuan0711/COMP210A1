package a1;

/* Do not remove any code that is here.
 You may add new code if you wish to
 new data fields or helper methods. 
 Also note that this skeleton will not compile as is,
 since the methods that return things do not contain
 return statements... so you need to add them.
*/

public class Summer {
   private int[] nums;
   private int count;
   // Any other data fields you decide you need can go here.

   public Summer(int n) {
      /* In this constructor, first allocate an array that hold n ints and put that in nums.
      Hint: If you add an extra field to store the index of the next open slot in the array,
      you would need to do something with that field here.
      */
      /*Your code here */
      nums= new int[n];
      count=0;
   }

   public void add( int num ) {
      // In this method, take the parameter num and put that value into the Summer.
      /*Your code here */
      nums[count]=num;
      count++;
   }

   public int sum ( ) {
     /* In this method, go through the array and add up all the ints
      that have been stored in it so far.
      Note that the sum of ints is of type int, so return the int sum you get.  */
      int result=0;
      /*Your code here*/
      for (int num : nums) {
         result = result + num;
      }
      return result;
   }

   public int high ( ) {
     /* Find the largest number stored in the array so far
      and return it. */
      /*what is the biggest number*/
      /*Your code here */
      int maximum=nums[0];
      for(int i=1; i<count;i++){
         if(maximum<nums[i]){
            maximum=nums[i];
         }
      }
      return maximum;
   }

   public int low ( ) {
     /* Find the smallest number stored in the array so far
      and return it. */
      //go up tp count//
      /*Your code here */
      int minimum=nums[0];
      for(int i=1; i<count;i++){
         if(minimum>nums[i]){
            minimum=nums[i];
         }
      }
      return minimum;

   }

   public double average( ) {
     /* Find the average of all the numbers stored in the array
      so far, and return it.
      Note that the average of ints might produce a double, so
      we are returning a double.

      HEADS UP
      This method might get called before there are any
      ints stored in the array, so you need to guard
      against divide by zero.
      We will simply define the average of no numbers
      to be 0.0 so return that if the array has no numbers in it.
       */
      double aver=0.0;
      if (count!=0) {
         aver = (double)sum() /(double)count;
         return aver;
      } else {
         return aver;
      }
   }

   public double avgOver( int thresh ) {

   /* Similar to average() except we want to only average up
      stored numbers that are ABOVE ( > ) the threshold
      parameter "thresh".

      Hint: Look at examples 1 and 2 in the readme make sure you
      understand how to calculate avgOver.

      HEADS UP
      We have the same divide by zero issue here as in average()
      so again if you are trying to take an average on no numbers
      simply return 0.0
   */
      int sum=0;
      int c=0;
      double result=0.0;
      for (int num : nums) {
         if (num > thresh) {
            sum += num;
            c++;
         }
      }
      if (c!=0){
         result=(double)sum/(double)c;
         return result;
      } else{
         return result;
      }
   }

   public int count ( ) {
      //Return the number of ints that have been stored in the array.
      return count;
   }
}
