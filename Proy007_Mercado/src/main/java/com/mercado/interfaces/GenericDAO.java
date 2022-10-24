package com.mercado.interfaces;

import java.util.List;

public interface GenericDAO<T> {
	void add(T entidad);

	List<T> getAll();
}
