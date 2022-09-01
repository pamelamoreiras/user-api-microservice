package br.com.pamela.userapi.services.impl;

import br.com.pamela.userapi.domain.User;
import br.com.pamela.userapi.repositories.UserRepository;
import br.com.pamela.userapi.services.UserService;
import br.com.pamela.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object Not Found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
