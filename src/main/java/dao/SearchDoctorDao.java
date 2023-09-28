package dao;

//I am trying to merge 2 branches using command prompt
import domain.SearchDoctor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.sql.SQLException;

public class SearchDoctorDao {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate= jdbcTemplate;
    }

    public SearchDoctor getDoctorByName(String doctorName) throws SQLException{
        String sql ="select *from DoctorsDetails where doctorName= ?";
        return jdbcTemplate.queryForObject(sql , new Object[]{doctorName}, new BeanPropertyRowMapper<SearchDoctor>(SearchDoctor.class));
    }
    public SearchDoctor getDoctorByRegistrationNumber(String doctorRegistrationNumber) throws SQLException{
        String sql ="select *from DoctorsDetails where doctorRegistrationNumber= ?";
        return jdbcTemplate.queryForObject(sql , new Object[]{doctorRegistrationNumber}, new BeanPropertyRowMapper<SearchDoctor>(SearchDoctor.class));
    }

    public SearchDoctor getDoctorByCity(String city) throws SQLException{
        String sql ="select *from DoctorsDetails where city= ?";
        return jdbcTemplate.queryForObject(sql , new Object[]{city}, new BeanPropertyRowMapper<SearchDoctor>(SearchDoctor.class));
    }

    public SearchDoctor getDoctorByGender(String gender) throws SQLException{
        String sql ="select *from DoctorsDetails where gender= ?";
        return jdbcTemplate.queryForObject(sql , new Object[]{gender}, new BeanPropertyRowMapper<SearchDoctor>(SearchDoctor.class));
    }

}
