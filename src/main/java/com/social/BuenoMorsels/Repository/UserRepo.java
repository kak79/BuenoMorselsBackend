package com.social.BuenoMorsels.Repository;

import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social.BuenoMorsels.Beans.User;

@Repository
@Table(name="usr")
public interface UserRepo extends JpaRepository<User, Integer>{

	 User findById(int userId);

	 User findByUsername(String username);

	 User findByEmail(String email);

}


