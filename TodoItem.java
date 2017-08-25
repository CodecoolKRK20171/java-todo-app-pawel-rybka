/**
 * Class representing a single todo item.
 * 
 */
import java.util.Date;


public class TodoItem{
    private String task;
    private Date deadline;
    private boolean isDone;

    public TodoItem(String task) {//, Date deadline) {
        this.task = task;
        // this.deadline = deadline;
        this.isDone = false;
    }

    public String toString() {
        String output = "[";
        if (this.isDone) {
            output += "X";
        } else {
            output += " ";
        }
        output += "]";
        // output += this.deadline.toString();
        output += " " + task;

        return output;
    }

    public boolean getIsDone() {
        return this.isDone;
    }

    public void mark() {
        this.isDone = true;
    }

    public void unmark() {
        this.isDone = false;
    }
}
