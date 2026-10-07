System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
 
        if (amt <= 0) {
            System.out.println("Amount must be greater than 0!");
            return;  
        }
 
        sc.nextLine();   
        System.out.print("Enter description: ");
        String desc = sc.nextLine();
   
      
        categoryOf[count] = cat - 1;
        amount[count] = amt;
        description[count] = desc;
        spent[cat - 1] = spent[cat - 1] + amt;
        count++;
 
        System.out.println("Expense added!");   
 
        
        if (budget[cat - 1] > 0 && spent[cat - 1] > budget[cat - 1]) {
            System.out.println("WARNING: You have crossed the budget for "
                    + categories[cat - 1] + "!");
        }
    }
 
    
    static void viewExpenses() {
        if (count == 0) {
            System.out.println("\nNo expenses added yet.");
            return;
        }
 
        System.out.println("\nNo.  Category     Amount     Description");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-4d %-12s %-10.2f %s%n",
                    i + 1, categories[categoryOf[i]], amount[i], description[i]);
        }
    }
 
    
    static void showReport(String month) {
        double totalSpent = 0;
        double totalBudget = 0;
 
        System.out.println("\n========== REPORT FOR " + month.toUpperCase() + " ==========");
        System.out.printf("%-10s %10s %10s %10s %8s  %s%n",
                "Category", "Budget", "Spent", "Remaining", "Used%", "Status");
