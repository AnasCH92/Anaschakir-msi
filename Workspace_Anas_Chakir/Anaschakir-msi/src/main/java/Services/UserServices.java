package anas.msi.userapi.Services;

import anas.msi.userapi.entities.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    Page<User> selectAll(Pageable page);
    User insert(User U);

}

