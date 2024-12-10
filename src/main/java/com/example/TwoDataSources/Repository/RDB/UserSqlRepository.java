package com.example.TwoDataSources.Repository.RDB;

import com.example.TwoDataSources.Entity.ClientRDB;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserSqlRepository  extends JpaRepository<ClientRDB, Long>
{

}
