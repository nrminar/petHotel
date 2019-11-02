package pethotel;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PMapper implements RowMapper<PetEntity>{
    public PetEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        PetEntity pet = new PetEntity();
        pet.setId(rs.getInt("id"));
        pet.setPetName(rs.getString("p_name"));
        pet.setPetBreed(rs.getString("p_breed"));
        pet.setPetOwnerId(rs.getInt("p_owner_id"));
        pet.setPetColor(rs.getString("p_color"));
        pet.setCheckIn(rs.getBoolean("p_checkIn"));
        
        return pet;
    }
}