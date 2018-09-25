package bd.ac.seu.server.modeltest;

import bd.ac.seu.server.model.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class OwnerTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Autowired
    private Phone phone;

    @Test
    public void testAllArgsContructor(){
    }
}
