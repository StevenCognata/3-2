import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import javax.naming.directory.InvalidAttributesException;

import org.junit.Before;

public class TaskTest {
    private String id = null;
    private String name = null;
    private String description = null;
    private String tooLongId = null;
    private String tooLongName = null;
    private String tooLongDescription = null;

    @Before
    void setUp() {
        id = "0";
        name = "Steven";
        description = "this is the description";
        tooLongId = "38423948394084910384092349348349843904";
        tooLongName = "aksdjfkadsjflaksdjfakadfkjdslkfjhsadlfkjasdfklsfjaskflsdajlfkdaslfk";
        tooLongDescription = "dfjdskfhdkjlfasdlfjkahdsfkjaosdjfhadskfhadskjfhasdjkfhasdfklahsdflkjadshflakj";
    }
   
    // get id
    @Test
	void GetTaskId() throws InvalidAttributesException {
        Task task = new Task(id, name, description);
        Assertions.assertEquals(id, task.GetTaskId());

	}

    // get name
    @Test
    void TestGetName() throws InvalidAttributesException {
        Task task = new Task(id, name, description);
        Assertions.assertEquals(name, task.GetName());
    }

    // get description
    @Test
    void TestGetDescription() throws InvalidAttributesException {
        Task task = new Task(id, name, description);
        Assertions.assertEquals(description, task.GetDescription());
    }

    @Test
    void SetNameTest() throws InvalidAttributesException {
        Task task = new Task(id, name, description);
        task.SetName(name);
        Assertions.assertEquals(name, task.GetName());
    }

    @Test
    void SetDescriptionTest() throws InvalidAttributesException {
        Task task = new Task(id, name, description);
        task.SetDescription(description);
        Assertions.assertEquals(description, task.GetDescription());
    }

    // too long description test (will fail)
    @Test
    void SetDescriptionFail() throws InvalidAttributesException {
        Task task = new Task(id, name, description);
        Assertions.assertThrows(IllegalArgumentException.class, () -> task.SetDescription(tooLongDescription));
    }

    // too long name test (will fail)
    @Test
    void SetNameFail() throws InvalidAttributesException {
        Task task = new Task(id, name, description);
        Assertions.assertThrows(IllegalArgumentException.class, () -> task.SetName(tooLongName));
    }

    // too long id (will fail)
    @Test
    void SetIdFail() throws InvalidAttributesException {
        Task task = new Task(id, name, description);
        Assertions.assertThrows(IllegalArgumentException.class, () -> task.SetTaskId(tooLongId));
    }

    // testing id with null
    @Test
    void SetIdNullTest() throws InvalidAttributesException {
        Task task = new Task(id, name, description);
        Assertions.assertThrows(IllegalArgumentException.class, () -> task.SetTaskId(null));
    }

    // testing name with null 
    @Test
    void SetNameNullTest() throws InvalidAttributesException {
        Task task = new Task(id, name, description);
        Assertions.assertThrows(IllegalArgumentException.class, () -> task.SetName(null));
    }

    // testing description with null
    @Test
    void SetDescriptionNullTest() throws InvalidAttributesException {
        Task task = new Task(id, name, description);
        Assertions.assertThrows(IllegalArgumentException.class, () -> task.SetDescription(null));
    }


}
