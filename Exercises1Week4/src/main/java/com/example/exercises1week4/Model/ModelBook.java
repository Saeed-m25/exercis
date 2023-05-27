package com.example.exercises1week4.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.processing.Generated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class ModelBook {

    @Id
    @NotNull
    private Integer id;
    @NotEmpty
    private String title;
    @NotEmpty
    private String Author;
    @NotEmpty
    @Column(columnDefinition = "check Academic or Mystery or Novel")
    private String Category;
    @NotNull
    private Integer ISBN;
    @NotNull
    @Min(50)
    private Integer numberOfPages;
}

