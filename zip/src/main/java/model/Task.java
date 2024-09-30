package model;

import jakarta.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status; // ENUM com valores: NAO_INCIADO, EM_ANDAMENTO, CONCLUIDO

}

