package com.example.TwoDataSources.Service;

import com.example.TwoDataSources.Entity.ClientMongo;
import com.example.TwoDataSources.Entity.ClientRDB;
import com.example.TwoDataSources.Repository.NoSql.UserNoSqlRepository;
import com.example.TwoDataSources.Repository.RDB.UserSqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserSqlRepository userSqlRepository;
    @Autowired
    private UserNoSqlRepository userNoSqlRepository;

    @Autowired
    public UserService(UserSqlRepository userSqlRepository, UserNoSqlRepository userNoSqlRepository) {
        this.userSqlRepository = userSqlRepository;
        this.userNoSqlRepository = userNoSqlRepository;
    }

    public ClientRDB saveUser(final ClientRDB clientRDB) {
        ClientRDB savedClientRDB = userSqlRepository.save(clientRDB);
        ClientMongo clientMongo = new ClientMongo(savedClientRDB.getId(), savedClientRDB.getName(), clientRDB.getEmail());
        ClientMongo savedClient = userNoSqlRepository.save(clientMongo);
        return savedClientRDB;
    }
}
