package com.hefshine.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hefshine.bean.Student;

@Repository(value = "student_dao")
public class StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insertData(Student s) {
		String query="insert into student values(?,?,?)";
		
		return jdbcTemplate.update(query, s.getRollnumber(),s.getFirstname(),s.getLastname());
		
	}
	
	public int updateData(Student s) {
		String query="update student set firstname=?, lastname=? where rollnumber=?";
		
		return jdbcTemplate.update(query, new Object[] {s.getFirstname(),s.getLastname(),s.getRollnumber()});
		
	}
	
	public List<Student> getAllrecord(){
		String query="select * from student";
		
		return jdbcTemplate.query(query,new StudentMapper());
		
	}
	
	public Student getParticularData(int rollnumber) {
		String query="select * from student where rollnumber=?";
		
		//return jdbcTemplate.queryForObject(query, new Object[] {rollnumber}, new StudentMapper());
		return jdbcTemplate.queryForObject(query, new StudentMapper(),rollnumber);
	}
	
	
	public static final class StudentMapper implements RowMapper<Student>{

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
