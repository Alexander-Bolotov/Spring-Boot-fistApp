package ru.aibolotov.Spring.Boot.fistApp.repositories;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.aibolotov.Spring.Boot.fistApp.model.User;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface UserRepo extends JpaRepository<User, Long> {


    @Override
    List<User> findAll();

    @Override
    void delete(User user);

    @Override
    List<User> findAllById(Iterable<Long> iterable);

    @Override
    User getOne(Long aLong);

    @Override
    <S extends User> S save(S s);

    @Override
    Optional<User> findById(Long aLong);

    @Override
    void deleteById(Long aLong);

    @Override
    <S extends User> Optional<S> findOne(Example<S> example);

    @Override
    <S extends User> boolean exists(Example<S> example);



    //    List<User> getListUsers();//
//
//    void addUser(User user);//
//
//    User getUserById(Long id);//
//
//    void deleteUserById(Long id);//
//
//    User getUser(String name);//
//
//    boolean nameIsExist(String name);
}
