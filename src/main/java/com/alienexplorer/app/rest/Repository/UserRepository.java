package com.alienexplorer.app.rest.Repository;

import com.alienexplorer.app.rest.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
