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
 
    public static void main(String[] args) {
 
        System.out.println("===== MONTHLY EXPENSE & BUDGET ANALYSER =====");
        System.out.print("Enter month name (e.g. October): ");
        String month = sc.nextLine();
 
        System.out.print("Enter your monthly income: ");
        income = sc.nextDouble();  
 
        int choice;
        do {
            System.out.println("\n---------- MENU ----------");
            System.out.println("1. Set budget");
            System.out.println("2. Add expense");
            System.out.println("3. View all expenses");
            System.out.println("4. Show report for " + month);
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
 
            switch (choice) {
                case 1:
                    setBudget();
                    break;
                case 2:
                    addExpense();
