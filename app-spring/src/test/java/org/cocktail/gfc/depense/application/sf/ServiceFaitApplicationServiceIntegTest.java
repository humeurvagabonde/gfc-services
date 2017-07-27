package org.cocktail.gfc.depense.application.sf;

import javax.inject.Inject;

import org.cocktail.gfc.depense.api.CreerSfCommand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ServiceFaitApplicationServiceIntegTest {

    @Inject
    private ServiceFaitApplicationService sfAppService;
    
    @Test
    public void test() {
        sfAppService.creer(new CreerSfCommand(1L, 2017, "reference", "commentaire", "2017-04-27 14:12:22", 4L, "test", ""));
    }
}
