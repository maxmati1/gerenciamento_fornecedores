package com.bn.ex7.services;

import com.bn.ex7.models.FornecedorModel;
import com.bn.ex7.repositories.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    private final FornecedorRepository repository;

    public FornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    public FornecedorModel criarFornecedor(FornecedorModel fornecedor) {
        return repository.save(fornecedor);
    }

    public List<FornecedorModel> findAll() {
        return repository.findAll();
    }

    public FornecedorModel buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarFornecedor(Long id) {
        repository.deleteById(id);
    }
}