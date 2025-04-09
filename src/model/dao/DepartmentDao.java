package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);  // Operação que insere no banco de dados
	void update(Department obj);  // Operação que atualiza o Banco de dados
	void deleteById(Integer id);  // Operação que deleta uma linha do banco conforme o id informado
	Department findId(Integer id);  // Opeção que consulta um ojeto no banco de dados e retorna False ou True
	List<Department> findAll();  // Operação que retorna todos os departamentos
		
}
