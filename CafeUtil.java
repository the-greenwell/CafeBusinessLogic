import java.util.ArrayList;

public class CafeUtil{
    public int getStreakGoal(){
        int result = 0;
        for(int i=0; i < 10; i++){
            result += i + 1;
        }
        return result;
    }
    public int getStreakGoal(int numWeeks){
        int result = 0;
        for(int i=0; i < numWeeks; i++){
            result += i + 1;
        }
        return result;
    }
    public double getOrderTotal(double[] prices){
        double total = 0;
        for(double price : prices){
            total += price;
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(String.format("%d %s", i, menuItems.get(i)));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println(String.format("Hello, %s! There are %d people in front of you.", userName, customers.size()));
        customers.add(userName);
        System.out.println(customers);
    }
}