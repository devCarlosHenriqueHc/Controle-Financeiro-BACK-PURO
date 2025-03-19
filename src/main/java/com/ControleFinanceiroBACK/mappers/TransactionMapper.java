package com.ControleFinanceiroBACK.mappers;

import com.ControleFinanceiroBACK.dto.TransactionDTO;
import com.ControleFinanceiroBACK.entities.TransactionEntity;
import com.ControleFinanceiroBACK.model.TransactionModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TransactionMapper {

    // Converte de TransactionDTO para TransactionEntity
    public com.ControleFinanceiroBACK.entities.TransactionEntity toEntity(TransactionModel transactionModel) {
        TransactionEntity transactionEntity = new TransactionEntity();
        transactionEntity.setName(transactionModel.getName());
        transactionEntity.setAmount(transactionModel.getAmount());
        return transactionEntity;
    }

    // Converte de TransactionEntity para TransactionDTO
    public TransactionDTO toDTO(TransactionEntity transactionEntity) {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setId(transactionEntity.getId());
        transactionDTO.setName(transactionEntity.getName());
        transactionDTO.setAmount(transactionEntity.getAmount());
        return transactionDTO;
    }

    // Converte uma lista de TransactionEntity para uma lista de TransactionDTO
    public List<TransactionDTO> toDTOList(List<TransactionEntity> transactions) {
        return transactions.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}
