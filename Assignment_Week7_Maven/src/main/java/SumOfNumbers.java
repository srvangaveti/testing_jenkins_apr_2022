
public class SumOfNumbers {

    //Method to generate the sum of all numbers up to the number inputted
    public int generate(int x){
        int sum = 0;
        for(int i = 1; i <= x; i++){
            sum = sum + i;
        }
        return sum;
    }

}
