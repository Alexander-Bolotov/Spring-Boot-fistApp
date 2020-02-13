package ru.aibolotov.Spring.Boot.fistApp.repositories;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.aibolotov.Spring.Boot.fistApp.model.Role;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

    @Override
    <S extends Role> boolean exists(Example<S> example);

    List<Role> findAll();

    @Override
    Optional<Role> findById(Long aLong);

    @Override
    <S extends Role> Optional<S> findOne(Example<S> example);

//    Role getRoleByName(String roleName);

}
