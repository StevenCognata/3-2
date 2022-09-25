import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskService {

    private List<Task> taskList = new ArrayList<>();
    

    private String newUniqueId(){
        return UUID.randomUUID().toString().substring(0, 10);
    }

    public void newTask(String name, String description){
        Task task = new Task(newUniqueId(), name, description);
        taskList.add(task);
    }

    public void removeTask(String id) {
        for (Task task : this.taskList){
			if (newUniqueId().equals(task.GetTaskId())) {
				taskList.remove(task);
            }
        }
    }

    public void updateName(String id, String name) throws Exception {
        for (Task task : this.taskList) {
            if (newUniqueId().equals(task.GetTaskId())) {
				task.updateAll(name);
			}
        }
    }

    public void updateDescription(String id, String description) {
        for (Task task : this.taskList) {
            if (newUniqueId().equals(task.GetTaskId())) {
                task.updateAll(description);
            }
        }
    }

    public List<Task> GetTaskList() {
		return this.taskList;
	}

    public void SetTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

}