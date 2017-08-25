import java.util.ArrayList;

/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList{

    private ArrayList<TodoItem> todoItems;

    public TodoList() {
        this.todoItems = new ArrayList<>();
    }

    public void addItem(TodoItem task) {
        todoItems.add(task);
    }

    public void listItems() {
        Integer ordNumber = 0;
        for (TodoItem task : todoItems) {
            ordNumber++;
            System.out.format("%d. %s\n", ordNumber, task);
        }
    }

    // private void removeItem()
    public void archiveItems() {
        for (Integer i = 0; i < this.todoItems.size(); i++) {
            // System.out.println(todoItems.get(i).getIsDone());
            if (this.todoItems.get(i).getIsDone()) {
                this.todoItems.remove(todoItems.get(i));
                i--;
            }
        }
    }

    public void removeItem() {

    }

    public void markItem(Integer nrOfItem) {
        this.todoItems.get(nrOfItem).mark();
    }
}
