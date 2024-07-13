package com.example.persistence.repository;

import com.example.persistence.model.Foo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IFooRepository extends PagingAndSortingRepository<Foo, Long> {
}
