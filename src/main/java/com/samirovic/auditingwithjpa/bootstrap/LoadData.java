package com.samirovic.auditingwithjpa.bootstrap;

import com.samirovic.auditingwithjpa.models.Bar;
import com.samirovic.auditingwithjpa.models.Foo;
import com.samirovic.auditingwithjpa.respositories.FooRepository;
import org.hibernate.envers.Audited;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadData implements CommandLineRunner {

    @Autowired
    private FooRepository fooRepository;

    @Override
    public void run(String... args) {
        Bar bar = Bar.builder().name("bar1").build();
        Foo foo = Foo.builder().name("foo1").bar(bar).build();
        this.fooRepository.save(foo);
    }
}
