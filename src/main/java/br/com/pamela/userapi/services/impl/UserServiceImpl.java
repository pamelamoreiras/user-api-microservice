package br.com.pamela.userapi.services.impl;

import br.com.pamela.userapi.domain.User;
import br.com.pamela.userapi.repositories.UserRepository;
import br.com.pamela.userapi.services.UserService;
import br.com.pamela.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository;
    private final Environment env;

    @Override
    public User findById(Long id) {
        log.info("PAYROLL_SERVICE ::: Get request on" + env.getProperty("local.server.port") + "port");
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object Not Found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
