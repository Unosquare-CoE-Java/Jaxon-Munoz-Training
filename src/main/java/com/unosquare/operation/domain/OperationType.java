package com.unosquare.operation.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@Table(name = "operation_types")
public class OperationType extends EntityBase<Integer>{

    @Column(name="operation_name",unique = true)
    private String operationName;

    @OneToMany(mappedBy = "operationType", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonBackReference
    private List<OperationHistory> operationHistories;
}
