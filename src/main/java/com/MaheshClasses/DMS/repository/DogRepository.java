/**
 * 
 */
package com.MaheshClasses.DMS.repository;
import org.springframework.data.repository.CrudRepository;
import com.MaheshClasses.DMS.Models.Dog;


import java.util.List;

/**
 * @author Mahesh Kollipara
 * Nov 12, 2023
 */
public interface DogRepository extends CrudRepository<Dog, Integer>
{
	List<Dog> findByName(String name);

}

