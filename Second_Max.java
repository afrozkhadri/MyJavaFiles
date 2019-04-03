
public class Second_Max {


public static void main(String[] args) {
    int[] tab = maximum(12);
    System.out.println("Largest digit: " + tab[0]);
    System.out.println("Second largest digit: " + tab[1]);
}
public static int[] maximum(int max){
    int num = max;
    int largest = -1;
    int secondLargest = -1;
    while(num != 0){
        int rightDigit = num % 10;
        num /= 10;

        if(rightDigit > largest) {
            secondLargest = Math.max(secondLargest, largest);
            largest = rightDigit;

        } else if(rightDigit > secondLargest)
            secondLargest = rightDigit;
    }
    return new int[]{largest,secondLargest};
    }
}