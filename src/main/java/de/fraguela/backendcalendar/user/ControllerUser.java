package de.fraguela.backendcalendar.user;

import de.fraguela.backendcalendar.Session;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Map;


@RestController
public class ControllerUser {

    private Session test = new Session();


    //User Registration with unique Username and Mail
    @RequestMapping(method = RequestMethod.POST, value = "/user/register")
    public User register(@NotNull @RequestBody Map<String, String> input) {
        //check for double Username
        if (test.checkUserName(input.get("username")) == null && test.checkUserMail(input.get("mail")) == null) {
            User user = new User(input.get("mail"), input.get("password"), input.get("firstname"), input.get("lastname"), input.get("username"), LocalDate.parse(input.get("birth")));
            test.storeUser(user);
            return user;
        } else {
            //fetch from Database
            return null;
        }
    }

    //User Login with Mail and Password
    @RequestMapping(method = RequestMethod.POST, value = "/user/login")
    public User login(@NotNull @RequestBody Map<String, String> input){
        //Session User
        User check = test.checkUserMail(input.get("mail"));
        if (check != null && check.getPassword().equals(input.get("password"))) {
            return check;
        } else {
            //fetch from Database
            return null;
        }

    }

    //Config Data
}
