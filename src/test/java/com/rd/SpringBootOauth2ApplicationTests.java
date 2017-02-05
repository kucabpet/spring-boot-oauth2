package com.rd;

import com.rd.repositories.UserRepository;
import com.rd.services.models.User;
import com.rd.utils.UserUtils;
import java.util.List;
import javax.jws.soap.SOAPBinding;
import org.apache.log4j.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.rd.utils.UserUtils.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SpringBootOauth2ApplicationTests {

    private Logger log = Logger.getLogger(this.getClass());

    /**
     * Use for check right Spring Boot Test configurations
     */
    @Test
    public void simpleTest() {
        Assert.assertEquals(0, 0);
    }

    @Autowired
    private UserRepository userRepository;
            
    @Test
    public void findAllTest() {

        List<User> users = userRepository.findAll();

        Assert.assertNotNull("Expected not null", users);
        Assert.assertNotEquals("Expected not empty", 0, users.size());

        log.info("Users: ");
        users.forEach(e -> {
            Assert.assertNotNull("Expected not null", e);
            log.info(printUser(e));
        });
    }

}
