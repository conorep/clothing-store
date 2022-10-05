package edu.greenriver.sdev.clothingstore.database;

//this file defines a data later with access to Clothing records

import edu.greenriver.sdev.clothingstore.model.Clothing;
import org.springframework.data.jpa.repository.JpaRepository;

//JpsRepository adds all CRUD methods for interacting with clothing records
public interface ClothingRepository extends JpaRepository<Clothing, Integer>
{
}
