package com.example.TwoDataSources.Service;

import com.example.TwoDataSources.Entity.ClientMongo;
import com.example.TwoDataSources.Entity.ClientRDB;
import com.example.TwoDataSources.Model.UserDTO;
import com.example.TwoDataSources.Repository.NoSql.UserNoSqlRepository;
import com.example.TwoDataSources.Repository.RDB.UserSqlRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserSqlRepository userSqlRepository;
    @Autowired
    private UserNoSqlRepository userNoSqlRepository;


    public UserDTO saveUser(final UserDTO userDTO) {

        UserDTO userOut = new UserDTO();

        ClientRDB clientRDB = new ClientRDB();
        BeanUtils.copyProperties(userDTO, clientRDB);

        ClientRDB savedClientRDB = userSqlRepository.save(clientRDB);
        ClientMongo clientMongo = new ClientMongo(clientRDB.getId(), clientRDB.getName(), clientRDB.getEmail());
        ClientMongo savedClient = userNoSqlRepository.save(clientMongo);

        BeanUtils.copyProperties(savedClient, userOut);
        return userOut;
    }
}
