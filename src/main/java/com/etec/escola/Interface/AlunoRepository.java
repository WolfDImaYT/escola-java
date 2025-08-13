package com.etec.escola.Interface;

import com.etec.escola.Models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {

}
