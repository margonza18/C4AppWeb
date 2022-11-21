package com.unab.BackendSqlG53.IService;

import java.util.List;
import java.util.Optional;

import com.unab.BackendSqlG53.Entity.BitacorasFacturas;

public interface IBitacorasFacturasService {
	public List<BitacorasFacturas> all();

	public Optional<BitacorasFacturas> findById(Integer id);

	public BitacorasFacturas save(BitacorasFacturas bitacorasFacturas);

	public void delete(Integer id);
}