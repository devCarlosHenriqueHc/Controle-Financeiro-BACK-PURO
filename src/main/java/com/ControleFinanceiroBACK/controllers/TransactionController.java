package com.ControleFinanceiroBACK.controllers;

import com.ControleFinanceiroBACK.mappers.TransactionMapper;
import com.ControleFinanceiroBACK.services.TransactionServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionServices transactionServices;
    private final TransactionMapper transactionMapper;
}
