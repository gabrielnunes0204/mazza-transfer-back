package br.com.interBank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.interBank.repositories.TransferRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TransferService {

	@Autowired
	private TransferRepository transferRepository;
}
