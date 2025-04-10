package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);  // Operação que insere no banco de dados
	void update(Seller obj);  // Operação que atualiza o Banco de dados
	void deleteById(Integer id);  // Operação que deleta uma linha do banco conforme o id informado
	Seller findById(Integer id);  // Opeção que consulta um ojeto no banco de dados e retorna False ou True
	List<Seller> findAll();  // Operação que retorna todos os departamentos
	
	List<Seller> findByDepartment(Department department);   
	

}
