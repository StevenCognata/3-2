import java.util.UUID;

public class Task {
    private String taskId;
    private String name;
    private String description;

    public Task(String taskId, String name, String description) {
        this.taskId = UUID.randomUUID().toString().substring(0, 10);;
        this.name = name;
        this.description = description;
    }

    public String GetTaskId() {
        return taskId;
    }

    public void SetTaskId(String taskId){
        if (taskId == null || taskId.length()>10){
            throw new IllegalArgumentException("Invalid or characters exceed 10");
        } else {
            this.taskId = taskId;
        }
        
    }

    public String GetName() {
        return name;
    }

    public void SetName(String name) {
        if (name == null || name.length()>20){
            throw new IllegalArgumentException("Invalid or characters exceed 20");
        } else {
            this.name = name;
        }
        
    }

    public String GetDescription(){
        return description;
    }

    public void SetDescription(String description){
        if (description == null || description.length()>50) {
            throw new IllegalArgumentException("Invalid or characters exceed 50");
        } else {
            this.description = description;
        }
    }

    public void updateAll(String name2) {
    }
}
