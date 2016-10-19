/*
 *At an old railway station, you may still encounter one of the last remaining “train swappers”. 

A trainswapper is an employee of the railroad, whose sole job it is to 

rearrange the carriages of trains.
Once the carriages are arranged in the optimal order, all the train driver has to do, is drop the
carriages off, one by one, at the stations for which the load is meant.
The title “train swapper” stems from the first person who performed this task, at a station close to
a railway bridge. Instead of opening up vertically, the bridge rotated around a pillar in the center of
the river. After rotating the bridge 90 degrees, boats could pass left or right.
The first train swapper had discovered that the bridge could be operated with at most

//->>>>>>>>> two carriages on it.
//->>>>>>>>> By rotating the bridge 180 degrees, 
//->>>>>>>>> the carriages switched place, allowing him to rearrange the carriages 

(as a side effect, the carriages then faced the opposite direction, but train carriages can move either way, so who cares).
Now that almost all train swappers have died out, the railway company would like to automate
their operation. Part of the program to be developed, is a routine which decides for a given train the
least number of swaps of two adjacent carriages necessary to order the train. Your assignment is to
create that routine.

Input
The input contains on the first line the number of test cases (N ). Each test case consists of two input
lines. The first line of a test case contains an integer L, determining the length of the train (0 ≤ L ≤ 50).
The second line of a test case contains a permutation of the numbers 1 through L, indicating the current
order of the carriages. The carriages should be ordered such that carriage 1 comes first, then 2, etc.
with carriage L coming last.

Output
For each test case output the sentence: ‘Optimal train swapping takes S swaps.’ where S is an
integer.

Sample Input
3
3
1 3 2
4
4 3 2 1
2
2 1

Sample Output
Optimal train swapping takes 1 swaps.
Optimal train swapping takes 6 swaps.
Optimal train swapping takes 1 swaps.
 */
package assignment.pkg3;
import java.util.*;
/**
 *
 * @author leemartinc
 */
public class Assignment3 {
    public static int count;

    public static void main(String[] args) {
/*Input
The input contains on the first line the number of test cases (N ). Each test case consists of two input
lines. The first line of a test case contains an integer L, determining the length of the train (0 ≤ L ≤ 50).
The second line of a test case contains a permutation of the numbers 1 through L, indicating the current
order of the carriages. The carriages should be ordered such that carriage 1 comes first, then 2, etc.
with carriage L coming last.*/

        System.out.println("Enter the amount of trains and press enter."); //Sets amount of trains
        Scanner input = new Scanner (System.in);
        int numOfTrains = input.nextInt();
        
        if(numOfTrains == 1){System.out.println("There is "+ numOfTrains +" train.");}
        else{System.out.println("There are "+ numOfTrains +" trains.");}//Tells how many trains there are
        
        
        for (int n = 1; n <= numOfTrains; n++){
             System.out.println("---> Enter the length of train " + n +" and press Enter."); //set the length of train "n"
            Scanner length = new Scanner (System.in);
            int L = length.nextInt();
            int[] array = new int[L]; //creates array to create the "train"
            System.out.println("Enter the first carriage number of train " + n + " and press Enter.");
                             Scanner first = new Scanner (System.in);
                            int firstCarriage = first.nextInt();       //adds first carriage numbers and stores then in an temporary the created array
                             array[0] = firstCarriage;
                    for(int i = 1; i < L; i++){
                        System.out.println("Enter the next carriage number of train " + n + " and press Enter.");
                        Scanner pos = new Scanner (System.in);
                          int carriageNum = pos.nextInt();       //adds carriage numbers and stores then in an temporary the created array
                             array[i] = carriageNum;     
                    }
                    
                ////SORT THE ARRAY AND MOVE ON TO THE NEXT TRAIN
                
                System.out.println("Current carriage order of train " + n + " is " + Arrays.toString(array));
                
                System.out.println("Carriages will now be sorted.");
                
                sort(array);
                
                System.out.println("Sorting done.");
                
                System.out.println("Current carriage order of train " + n + " is " + Arrays.toString(array));
                 
                if(count == 1){System.out.println("Optimal train swapping takes "+ count +" swap.");}
                else{System.out.println("Optimal train swapping takes "+ count +" swaps.");}
                 
                System.out.println();
            }    
}

        public static int[] sort(int[] A){ //bubble sort?
           
            boolean swapped = true;
            count = 0;

            while ( swapped == true){
                for (int i = 0; i < A.length; i++){
                    
                    swapped = false;
                    
                    for (int j = 1; j <= i; j++){
                        if (A[j-1] > A[j]){
                            int temp = A[j-1];
                            A[j-1] = A[j];
                            A[j] = temp;
                            swapped = true;
                            count++;
                        } 
                    }
                }
            }
            return A;
        }
}
