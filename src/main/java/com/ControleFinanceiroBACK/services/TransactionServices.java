package com.ControleFinanceiroBACK.services;

import com.ControleFinanceiroBACK.entities.TransactionEntity;
import com.ControleFinanceiroBACK.repositories.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServices {

    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    public void addTransaction(TransactionModel transactionModel) {
        TransactionEntity transactionEntity = transactionMapper.toEntity(transactionModel);
        transactionRepository.save(transactionEntity);
    }
}
