package com.unosquare.operation.domain;

import lombok.*;
import org.hibernate.annotations.Table;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="user_seq")
    @SequenceGenerator(name="user_seq", initialValue=1, allocationSize=1)
    @Id
    @Column(name="id")
    private Long id;
}
