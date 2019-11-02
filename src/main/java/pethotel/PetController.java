package pethotel;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PetController{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }
    //Get Owners
    @RequestMapping("/owners")
    public List<Owner> getOwners(){
        String query = "SELECT * FROM owners;";
        List<Owner> owners = jdbcTemplate.query(query, new OMapper());
        return owners;
    }
    //Get Pets
    @RequestMapping("/pets")
    public List<PetEntity> getPets(){
        String query = "SELECT * FROM pets;";
        List<PetEntity> pets = jdbcTemplate.query(query, new PMapper());
        return pets;
    }
    //Post Pets
    @PostMapping("/pets")
    public void addPet(@RequestBody PetEntity  petentity){
        System.out.println(petentity.getPetOwnerId());
        System.out.println(petentity.getPetName());
        System.out.println(petentity.getBreedName());
        System.out.println(petentity.getColor());
        String query = "INSERT INTO pets ( p_owner_id, p_name, p_breed, p_color) VALUES (?, ?, ?, ?);";
        try{
            jdbcTemplate.update(query, petentity.getPetOwnerId(), petentity.getPetName(), petentity.getBreedName(), petentity.getColor());
        } catch (Exception e) {
            System.err.println(e);
            throw e;
        }

    }

}