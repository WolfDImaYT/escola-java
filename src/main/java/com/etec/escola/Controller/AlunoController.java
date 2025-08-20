package com.etec.escola.Controller;

import com.etec.escola.Models.Aluno;
import com.etec.escola.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno") // finir uma rota
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    //alistar o aluno:
    @GetMapping
    public List<Aluno> ListadeAlunos(){
        return alunoService.buscarAluno();
    }

    //salvar o aluno:
    @PostMapping // inserir
    public Aluno salvarnovoAluno(@RequestBody Aluno dadosAlunos){
        return alunoService.salvarAluno(dadosAlunos);
    }

    //buscar o aluno
    @GetMapping("/{id}")
    public Aluno buscarAlunos (@PathVariable Long id){
        return alunoService.buscarAlunoId(id);
    }


    //deletar o aluno
    @DeleteMapping("/{id}")
    public void excluirAluno (@PathVariable Long id){
        alunoService.deletarAluno(id);
    }
}
