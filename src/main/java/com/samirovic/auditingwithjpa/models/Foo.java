package com.samirovic.auditingwithjpa.models;

import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
@Audited
public class Foo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Bar bar;
}
