package com.ControleFinanceiroBACK.controllers;

import com.ControleFinanceiroBACK.dto.TransactionDTO;
import com.ControleFinanceiroBACK.entities.TransactionEntity;
import com.ControleFinanceiroBACK.mappers.TransactionMapper;
import com.ControleFinanceiroBACK.model.TransactionModel;
import com.ControleFinanceiroBACK.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;
    private final TransactionMapper transactionMapper;

//    @GetMapping
//    public ResponseEntity<List<TransactionDTO>> getAllTransactions() {
//        List<com.ControleFinanceiroBACK.entities.TransactionEntity> transactions = transactionService.getAllTransactions();
//        List<TransactionDTO> transactionDTOs = transactionMapper.toListDTO(transactions);
//        return ResponseEntity.ok(transactionDTOs);
//    }

    @PostMapping
    public ResponseEntity<TransactionDTO> addTransaction(@RequestBody TransactionModel transactionModel) {
        TransactionEntity savedTransaction = transactionService.addTransaction(transactionModel);
        return ResponseEntity.ok(transactionMapper.toDTO(savedTransaction));
    }
}
