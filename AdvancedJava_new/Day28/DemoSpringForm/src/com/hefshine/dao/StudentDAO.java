package com.hefshine.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hefshine.bean.Student;

@Repository
public class StudentDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public List<Student> getAllRecords(){
		String query="select * from student";
		
		return jdbcTemplate.query(query, new StudentMapper());
	}
	
	
	private static final class StudentMapper implements RowMapper<Student>{

		@Override
		public Student mapRow(ResultSet rs, int row) throws SQLException {
			// TODO Auto-generated method stub
			Student s=new Student();
			s.setRollnumber(rs.getInt("rollnumber"));
			s.setFirstname(rs.getString("firstname"));
			s.setLastname(rs.getString("lastname"));
			
			return s;
		}
		
	}
	
	
}
