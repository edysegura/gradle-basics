public class Todo {

    def id
    def done = false
    def description
	
	static void main(args) {
		def todos = [
			new Todo([description: "Learn Java!!!"]),
			new Todo([description: "Learn Groovy!!!"]),
			new Todo([description: "Learn Gradle!!!"]),
			new Todo([description: "Learn JavaScript!!!"])
		]		
		
		todos.each { todo ->
			println "${todo.description} ${todo.done}"
		}
	}
}
