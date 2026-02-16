package com.example.projeto.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_idosos")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class idoso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "historico_medico")
    private String historicoMedico;

    @Column(name = "data_criacao")
    @CreationTimestamp
    private LocalDateTime dataCriacao;
}