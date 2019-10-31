package pethotel;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class OMapper implements RowMapper<Owner>{
    public Owner mapRow(ResultSet rs, int rowNum) throws SQLException {
        Owner owner = new Owner();
        owner.setOwnerName(rs.getString("Owner_name"));
        owner.setId(rs.getInt("id"));

        return owner;
    }
}