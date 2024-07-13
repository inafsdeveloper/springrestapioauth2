package com.example.service;

import com.example.persistence.model.Foo;

import java.util.Iterator;
import java.util.Optional;

public interface IFooService {
    Optional<Foo> findById(Long id);

    Foo save(Foo foo);

    Iterable<Foo> findAll();
}
