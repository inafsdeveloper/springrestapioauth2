package com.example.service.impl;

import com.example.persistence.model.Foo;
import com.example.persistence.repository.IFooRepository;
import com.example.service.IFooService;

import java.util.Optional;

public class FooServiceImpl implements IFooService {
    private IFooRepository fooRepository;

    public FooServiceImpl(IFooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @Override
    public Optional<Foo> findById(Long id) {
        return fooRepository.findById(id);
    }

    @Override
    public Foo save(Foo foo) {
        return fooRepository.save(foo);
    }

    @Override
    public Iterable<Foo> findAll() {
        return fooRepository.findAll();
    }
}
