//Write a java program to print sum of all the elements of an array.
class ArraySum{
    int sum(int[] arr){
        int[] newArr = arr; int sum = 0;
        for (int i = 0; i< newArr.length; i++){  
            // System.out.print(newArr[i]+" ");
            sum = sum += newArr[i];
        } 
        return sum;
    }
}
public class Demo069 {
    public static void main(String[] args) {
        ArraySum obj = new ArraySum();
        int[] arr = {10,50,80,90};
        int sumOfArray = obj.sum(arr);
        System.out.println(sumOfArray);
    }
}