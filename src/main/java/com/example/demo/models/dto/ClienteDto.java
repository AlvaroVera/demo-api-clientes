package com.example.demo.models.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {

    @JsonIgnore
    private Integer id;

    private String nombres;

    private String apellidos;

    private String tipoDocumento;

    private String numeroDocumento;
}
