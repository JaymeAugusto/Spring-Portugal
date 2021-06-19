package com.codegate.aula2;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
public class Emprego {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String titulo;

    @NotNull
    private String empresa;

    @NotNull
    private String descricao;
}
