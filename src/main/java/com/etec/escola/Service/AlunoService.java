package com.etec.escola.Service;

import com.etec.escola.Interface.AlunoRepository;
import com.etec.escola.Models.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> buscarAluno(){
        return alunoRepository.findAll();
    }

    public Aluno salvarAluno(Aluno Aluno){
        return alunoRepository.save(Aluno);
    }
    public Aluno buscarAlunoId(Long id){
        return alunoRepository.findById(id).orElse(null);
    }

    public void deletarAluno (Long id){
       alunoRepository.deleteById(id);
    }
}

