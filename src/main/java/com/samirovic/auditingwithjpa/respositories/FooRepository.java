package com.samirovic.auditingwithjpa.respositories;

import com.samirovic.auditingwithjpa.models.Bar;
import com.samirovic.auditingwithjpa.models.Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FooRepository extends JpaRepository<Foo, Long> {
}
