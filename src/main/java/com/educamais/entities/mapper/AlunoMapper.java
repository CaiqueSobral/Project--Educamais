package com.educamais.entities.mapper;

import com.educamais.entities.Aluno;
import com.educamais.entities.dto.AlunoDTO;
import org.modelmapper.ModelMapper;

public class AlunoMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static AlunoDTO entityToDto(Aluno aluno) {
        return modelMapper.map(aluno, AlunoDTO.class);
    }

    public static Aluno dtoToEntity(AlunoDTO dto) {
        return modelMapper.map(dto, Aluno.class);
    }
}
