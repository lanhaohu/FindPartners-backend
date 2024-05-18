package com.dex.FindPartners.service;

import com.dex.FindPartners.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/*** @Author lanhaohu
 * Date:2024/2/7 17:00
 * Version 1.0
 *Description:

 */

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void testAddUser() {
        User user = new User();
        user.setUsername("Dex");
        user.setUserAccount("123");
        user.setAvatarUrl("https://st0.dancf.com/static/02/202306090204-51f4.png");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("456");


        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

}