for (int i = 0; i < categories.length; i++) {
            double remaining = budget[i] - spent[i];
            double percent = 0;
            String status;
 
            if (budget[i] > 0) {
                percent = (spent[i] / budget[i]) * 100;
            }
 
            if (budget[i] == 0 && spent[i] > 0) {
                status = "No budget set";
            } else if (percent > 100) {
                status = "OVER BUDGET";
            } else if (percent >= 80) {
                status = "Near limit";
            } else {  
                status = "Good";
            }
 
            System.out.printf("%-10s %10.2f %10.2f %10.2f %7.1f%%  %s%n",
                    categories[i], budget[i], spent[i], remaining, percent, status);
 
            totalSpent = totalSpent + spent[i];
            totalBudget = totalBudget + budget[i];
        }
 
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-10s %10.2f %10.2f %10.2f%n",
                "TOTAL", totalBudget, totalSpent, totalBudget - totalSpent);
 
        
        int maxIndex = 0;
        for (int i = 1; i < categories.length; i++) {
            if (spent[i] > spent[maxIndex]) {
                maxIndex = i;
            }
        }
 
        System.out.println("\nIncome          : " + income);
        System.out.println("Total spent     : " + totalSpent);
        System.out.println("Savings         : " + (income - totalSpent));
 
        if (totalSpent > 0) {
            System.out.println("Highest expense : " + categories[maxIndex]
                    + " (" + spent[maxIndex] + ")");
        }
 
        if (totalSpent > totalBudget && totalBudget > 0) {
            System.out.println("\nYou have spent MORE than your total budget. Control your expenses!");
        } else if (totalBudget > 0) {
            System.out.println("\nWell done! You are within your total budget.");
        }
 
        if (income - totalSpent < 0) {
            System.out.println("Alert: Your expenses are more than your income!");
        }
    }
}
 
