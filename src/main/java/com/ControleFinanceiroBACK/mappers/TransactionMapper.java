package com.ControleFinanceiroBACK.mappers;

import com.ControleFinanceiroBACK.dto.TransactionDTO;
import com.ControleFinanceiroBACK.entities.TransactionEntity;
import com.ControleFinanceiroBACK.model.TransactionModel;
import org.springframework.stereotype.Component;

@Component
public class TransactionMapper {

    public TransactionEntity toEntity(TransactionModel transactionModel) {
        TransactionEntity transactionEntity = new TransactionEntity();
        transactionEntity.setName(transactionModel.getName());
        transactionEntity.setAmount(transactionModel.getAmount());
        return transactionEntity;
    }

    public TransactionDTO toDTO(TransactionEntity transactionEntity) {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setId(transactionEntity.getId());
        transactionDTO.setName(transactionEntity.getName());
        transactionDTO.setAmount(transactionEntity.getAmount());
        return transactionDTO;
    }


}
