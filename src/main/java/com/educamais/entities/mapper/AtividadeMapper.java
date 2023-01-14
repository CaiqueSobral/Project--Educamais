package com.educamais.entities.mapper;

import com.educamais.entities.Atividade;
import com.educamais.entities.dto.AtividadeDTO;
import org.modelmapper.ModelMapper;

public class AtividadeMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static AtividadeDTO entityToDto(Atividade atividade) {
        return modelMapper.map(atividade, AtividadeDTO.class);
    }

    public static Atividade dtoToEntity(AtividadeDTO dto) {
        return modelMapper.map(dto, Atividade.class);
    }
}
