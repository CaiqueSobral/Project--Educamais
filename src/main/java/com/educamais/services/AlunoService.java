package com.educamais.services;

import com.educamais.entities.Aluno;
import com.educamais.entities.Atividade;
import com.educamais.entities.ItemExtrato;
import com.educamais.entities.dto.AlunoDTO;
import com.educamais.entities.dto.AtividadeDTO;
import com.educamais.entities.mapper.AlunoMapper;
import com.educamais.repositories.AlunoRepository;
import com.educamais.services.exceptions.IdAlreadyRegisteredException;
import com.educamais.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<AlunoDTO> getAllAlunos() {
        return repository.findAll().stream().map(AlunoMapper::entityToDto).toList();
    }

    public AlunoDTO getAlunoByID(Long id){
        Optional<Aluno> aluno = repository.getAlunoById(id);
        return AlunoMapper.entityToDto(aluno.orElseThrow(() -> new ResourceNotFoundException(id)));
    }

    public AlunoDTO saveAluno(AlunoDTO dto) {
        if (!checkAlunoExists(dto.getId())) {
            return AlunoMapper.entityToDto(repository.save(AlunoMapper.dtoToEntity(dto)));
        }else{
            throw new IdAlreadyRegisteredException(dto.getId());
        }
    }

    public void deleteAlunoById(Long id){
        try{
            repository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }
    }

    public AlunoDTO addItemExtrato(Long id, Atividade atividade, String status){
        if(checkAlunoExists(id)) {
            Aluno aluno = AlunoMapper.dtoToEntity(getAlunoByID(id));
            aluno.addItemExtrato(new ItemExtrato(atividade, status));
            return AlunoMapper.entityToDto(repository.save(aluno));
        }else{
            throw new ResourceNotFoundException(id);
        }
    }

    private Boolean checkAlunoExists(Long id){
        Optional<Aluno> aluno = repository.getAlunoById(id);
        return aluno.isPresent();
    }
}
