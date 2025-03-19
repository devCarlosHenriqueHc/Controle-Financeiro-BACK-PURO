package com.ControleFinanceiroBACK.services;

import com.ControleFinanceiroBACK.dto.TransactionDTO;
import com.ControleFinanceiroBACK.entities.TransactionEntity;
import com.ControleFinanceiroBACK.mappers.TransactionMapper;
import com.ControleFinanceiroBACK.model.TransactionModel;
import com.ControleFinanceiroBACK.repositories.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    public TransactionEntity addTransaction(TransactionModel transactionModel) {
        // Converte a Model para entidade
        TransactionEntity transactionEntity = transactionMapper.toEntity(transactionModel);
        // Salva a transação no banco de dados
        return transactionRepository.save(transactionEntity);
    }

    public List<TransactionEntity> getAllTransactions() {
        // Retorna todas as transações do banco de dados
        return transactionRepository.findAll();
    }


}
