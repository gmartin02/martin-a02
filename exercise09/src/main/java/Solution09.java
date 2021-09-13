import java.util.Scanner;

public class Solution09 {
    private static final Scanner input = new Scanner(System.in);
    private static final int CONVERSION_FACTOR = 350;
    private static int length;
    private static int width;
    private static int area;
    private static double gallonsPaint;

    public static void main(String[] args) {
        getUserInput();
        area = getArea(length, width);
        gallonsPaint = getGallonsPaint(area);
        printOutput();
    }

    public static void getUserInput(){
        System.out.println("What is the length of the ceiling?");
        String input1 = input.nextLine();
        length = Integer.parseInt(input1);

        System.out.println("What is the width of the ceiling?");
        String input2 = input.nextLine();
        width = Integer.parseInt(input2);


    }
    public static int getArea(int length, int width){
        area = length * width;
        return area;
    }

    public static double getGallonsPaint(int area) {
        gallonsPaint = (double)area/CONVERSION_FACTOR;
        gallonsPaint = Math.ceil(gallonsPaint);
        return gallonsPaint;
    }

    public static void printOutput(){
        System.out.println("You will need to purchase " + (int)gallonsPaint + " gallons of paint to cover " + area + " square feet.");
    }
}
