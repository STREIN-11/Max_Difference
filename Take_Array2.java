package com.company.Practice;
import java.util.*;

class Difference {
    public int[] elements;
    public int maximumDifference;
    public Difference(int []elements)
    {
        this.elements=elements;
    }
    void computeDifference(){
        int n=elements.length;
        Arrays.sort(elements);
//        maximumDifference=Math.abs(elements[n-1]-elements[0]);
        maximumDifference=Math.abs(elements[n-1]-elements[0]);
    }
} // End of Difference class
public class Take_Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}
