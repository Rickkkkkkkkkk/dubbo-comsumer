package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.service.IDubboComsumerService;
import com.example.demo.service.ITransactionService;

@Service
public class DubboComsumerServiceImpl implements IDubboComsumerService {
	
	@Reference(version = "1.0.0")
	private ITransactionService transactionServiceImpl;
	
	public void test() {
		transactionServiceImpl.test();
	}
	
}
