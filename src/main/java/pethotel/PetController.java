package pethotel;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class PetController{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }
}