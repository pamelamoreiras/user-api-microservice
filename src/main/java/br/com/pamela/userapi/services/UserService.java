package br.com.pamela.userapi.services;

import br.com.pamela.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
