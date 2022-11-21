package com.unab.BackendSqlG53.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.BackendSqlG53.Entity.BitacorasFacturas;
import com.unab.BackendSqlG53.IRepository.IBitacorasFacturasRepository;
import com.unab.BackendSqlG53.IService.IBitacorasFacturasService;

@Service 
public class BitacorasFacturasService implements IBitacorasFacturasService{

	@Autowired IBitacorasFacturasRepository repository;

	@Override
	public List<BitacorasFacturas> all() {
		return repository.findAll();
	}

	@Override
	public Optional<BitacorasFacturas> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public BitacorasFacturas save(BitacorasFacturas bitacorasFacturas) {
		return repository.save(bitacorasFacturas);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
