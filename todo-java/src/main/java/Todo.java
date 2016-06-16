import java.util.List;
import java.util.ArrayList;

public class Todo {

    private Long id;
    private Boolean done = false;
    private String description;

    public Todo() {
    }

    public Todo(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
	
	public static void main(String[] args) {
		List<Todo> todos = new ArrayList<Todo>();
		
		todos.add(new Todo("Learn Java!!!"));
		todos.add(new Todo("Learn Groovy!!!"));
		todos.add(new Todo("Learn Gradle!!!"));
		todos.add(new Todo("Learn JavaScript!!!"));
		
		for(Todo todo : todos) {
			System.out.println(todo.getDescription() + ": " + todo.getDone());
		}
	}
}
