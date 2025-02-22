package br.com.interBank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.interBank.services.TransferService;

@RestController
@RequestMapping(value = "/transfer-bank")
@CrossOrigin(origins = "http://localhost:4200")
public class TransferController {

	@Autowired
	private TransferService transferService;

}
