package com.Biblioteca.Biblioteca.IRepository;

import org.springframework.stereotype.Repository;

import com.Biblioteca.Biblioteca.Entity.ABaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface IBaseRepository<T extends ABaseEntity, ID> extends JpaRepository<T,Long> {
}
