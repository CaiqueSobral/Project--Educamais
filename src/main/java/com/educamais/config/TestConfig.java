package com.educamais.config;

import com.educamais.entities.Aluno;
import com.educamais.entities.Atividade;
import com.educamais.entities.ItemExtrato;
import com.educamais.repositories.AlunoRepository;
import com.educamais.repositories.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private ItemExtratoRepository ierepository;

    @Autowired
    private AtividadeRepository atividadeRepository;

    @Override
    public void run(String... args) throws Exception {
        Atividade atv1 = new Atividade(null, "trabalho", 10.0);
        atividadeRepository.save(atv1);

        Aluno a2 = new Aluno(2001L, "Caique", "Vida Ativa");
        alunoRepository.save(a2);

        Aluno a1 = new Aluno(2003L, "Suxu", "Vida Ativa");

        ItemExtrato ie = new ItemExtrato(atv1, "positivo");
        ierepository.save(ie);

        ItemExtrato ie1 = new ItemExtrato(atv1, "negativo");
        ierepository.save(ie1);

        a1.addItemExtrato(ie);
        a1.addItemExtrato(ie1);

        alunoRepository.save(a1);
    }
}


