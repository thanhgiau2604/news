package hello.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import hello.entity.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, String> {
	@Query("Select ad from Admin ad")
	List<Admin> LayAll();
}
