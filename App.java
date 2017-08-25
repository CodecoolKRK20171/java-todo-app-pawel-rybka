/**
* Class representing the TodoApp application.
* It is the main entry point for this program.
*/

import java.util.Scanner;

public class App{
    
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String command = "";
        String userInput = "";
        Integer ordinalNumber = 0;
        TodoItem item;
        TodoList todoItems = new TodoList();

        while (!command.equals("exit")) {
            System.out.print("Please specify a command [list, add, mark, archive, exit]:");
            command = stdin.nextLine();

            if (command.equals("list")) {
                todoItems.listItems();

            } else if (command.equals("add")) {
                System.out.print("Description of task: ");
                userInput = stdin.nextLine();
                item = new TodoItem(userInput);
                todoItems.addItem(item);
                // System.out.println("Enter a date: ");

            } else if (command.equals("mark")) {
                System.out.print("Enter an ordinal number of task: ");
                try {
                    ordinalNumber = Integer.valueOf(stdin.nextLine());
                    todoItems.markItem(ordinalNumber-1);
                } catch (IndexOutOfBoundsException|NumberFormatException e) {
                    System.out.println("Enter a proper ordinal number.");
                }

            } else if (command.equals("archive")) {
                todoItems.archiveItems();
            }
        }
        stdin.close();
    }
  
}
