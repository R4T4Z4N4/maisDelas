package com.delas.api.repository;

import com.delas.api.model.TokenRedefinicaoSenhaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TokenRedefinicaoSenhaRepository extends JpaRepository<TokenRedefinicaoSenhaModel, Long> {

    Optional<TokenRedefinicaoSenhaModel> findByToken(String token);  // Buscar token por valor
    Optional<TokenRedefinicaoSenhaModel> findByUsuarioId(Long usuarioId);  // Buscar token por ID do usuário

    void deleteByToken(String token);
}
