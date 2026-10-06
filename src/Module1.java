import java.util.Scanner;
public class SimpleExpenseAnalyser {
    static String[] categories = {"Food", "Rent", "Travel", "Shopping", "Bills", "Others"};
static double[] budget = new double[6];
    static double[] spent = new double[6];
 
    
    static String[] description = new String[100];
    static int[] categoryOf = new int[100];
    static double[] amount = new double[100];
    static int count = 0;
 
    static double income = 0;
    static Scanner sc = new Scanner(System.in);
