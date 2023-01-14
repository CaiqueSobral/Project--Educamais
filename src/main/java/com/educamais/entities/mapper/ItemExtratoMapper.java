package com.educamais.entities.mapper;

import com.educamais.entities.ItemExtrato;
import com.educamais.entities.dto.ItemExtratoDTO;
import org.modelmapper.ModelMapper;

public class ItemExtratoMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static ItemExtratoDTO entityToDto(ItemExtrato itemExtrato) {
        return modelMapper.map(itemExtrato, ItemExtratoDTO.class);
    }

    public static ItemExtrato dtoToEntity(ItemExtratoDTO itemExtratoDTO) {
        return modelMapper.map(itemExtratoDTO, ItemExtrato.class);
    }
}
