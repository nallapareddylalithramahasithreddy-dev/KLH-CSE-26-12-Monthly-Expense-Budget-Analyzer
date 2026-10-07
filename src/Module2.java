break;
                case 3:
                    viewExpenses();
                    break;
                case 4:
                    showReport(month);  
                    break;
                case 5:
                    System.out.println("Thank you! Bye.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }
 
    
    static void showCategories() {  
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i]);
        }
    }
 
    
    static void setBudget() {
        System.out.println("\nEnter budget for each category:");
        for (int i = 0; i < categories.length; i++) {
            System.out.print(categories[i] + ": ");
            budget[i] = sc.nextDouble();
        }
        System.out.println("Budget saved!");
    }
 
    
    static void addExpense() {
        if (count == 100) {
            System.out.println("Expense list is full!");
            return;
        }
 
        System.out.println("\nSelect category:");
        showCategories();
        System.out.print("Enter category number: ");
        int cat = sc.nextInt();
 
        if (cat < 1 || cat > 6) {
            System.out.println("Invalid category!");
            return;
        }
 
