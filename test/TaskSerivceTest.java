import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.Before;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;




public class TaskSerivceTest {
    private String id = null;
    private String name = null;
    private String description = null;
    private String tooLongId = null;
    private String tooLongName = null;
    private String tooLongDescription = null;

    @Before
    void setUp() {
        id = "00";
        name = "Steven";
        description = "this is the description";
        tooLongId = "38423948394084910384092349348349843904";
        tooLongName = "aksdjfkadsjflaksdjfakadfkjdslkfjhsadlfkjasdfklsfjaskflsdajlfkdaslfk";
        tooLongDescription = "dfjdskfhdkjlfasdlfjkahdsfkjaosdjfhadskfhadskjfhasdjkfhasdfklahsdflkjadshflakj";
    }

    @Test
    void createNewTaskTest() {
        TaskService service = new TaskService();
        service.newTask(name, description);
        Assertions.assertNotNull(service.GetTaskList().get(0).GetTaskId());
        Assertions.assertEquals("", service.GetTaskList().get(0).GetTaskId());
    }

    @Test 
    void createNewNameTest(){
        TaskService service = new TaskService();
        service.newTask(name, description);
        Assertions.assertEquals(name, service.GetTaskList().get(0).GetName());
        Assertions.assertNotNull(service.GetTaskList().get(0).GetName());
    }

    @Test
    void createNewDescriptionTest(){
        TaskService service = new TaskService();
        service.newTask(name, description);
        Assertions.assertEquals(name, service.GetTaskList().get(0).GetDescription());
        Assertions.assertNotNull(service.GetTaskList().get(0).GetDescription());
    }

    @Test 
    void newTaskNameTooLongTest() {
        TaskService service = new TaskService();
        service.newTask(name, description);
        assertThrows(IllegalArgumentException.class, () -> service.newTask(tooLongName, description));
    }

    @Test 
    void newTaskDescriptionTooLongTest() {
        TaskService service = new TaskService();
        service.newTask(name, description);
        assertThrows(IllegalArgumentException.class, () -> service.newTask(name, tooLongDescription));
    }

    @Test 
    void newTaskNullNameTest() {
        TaskService service = new TaskService();
        service.newTask(name, description);
        assertThrows(IllegalArgumentException.class, () -> service.newTask(null, description));
    }

    @Test 
    void newTaskNullDescriptionTest() {
        TaskService service = new TaskService();
        service.newTask(name, description);
        assertThrows(IllegalArgumentException.class, () -> service.newTask(name, null));
    }

    // remove task 
    @Test
    void removeTaskTest() throws Exception {
        TaskService service = new TaskService();
        service.newTask(name, description);
        assertEquals(1, service.GetTaskList().size());
        service.removeTask(service.GetTaskList().get(0).GetTaskId());
    }

    @Test
    void removeTaskNotFoundTest() throws Exception {
        TaskService service = new TaskService();
        service.newTask(name, description);
        assertEquals(1, service.GetTaskList().size());
        assertThrows(Exception.class, () -> service.removeTask(id));
    }

    @Test
    void updateNameTest() throws Exception {
        TaskService service = new TaskService();
        service.newTask(name, description);
        service.updateName(service.GetTaskList().get(0).GetTaskId(), name);
        assertEquals(name, service.GetTaskList().get(0).GetName());
    }

    @Test
    void updateDescriptionTest() throws Exception {
        TaskService service = new TaskService();
        service.newTask(name, description);
        service.updateName(service.GetTaskList().get(0).GetTaskId(), description);
        assertEquals(description, service.GetTaskList().get(0).GetDescription());
    }


    @Test
    void updateNameNotValidTest() throws Exception {
        TaskService service = new TaskService();
        service.newTask(name, description);
        assertThrows(Exception.class, () -> service.updateName(id, name));
    }

    @Test
    void updateDescriptionNotValidTest() throws Exception {
        TaskService service = new TaskService();
        service.newTask(name, description);
        assertThrows(Exception.class, () -> service.updateDescription(id, name));
    }


}






