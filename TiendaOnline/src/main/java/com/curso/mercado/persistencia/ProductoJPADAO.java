package com.curso.mercado.persistencia;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.curso.mercado.constants.QueryConstants;
import com.curso.mercado.entidades.Producto;

public class ProductoJPADAO implements GenericDAO<Producto> {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("OraceHRPU");

	@Override
	public void add(Producto entidad) {
		EntityManager em = this.factory.createEntityManager();

		try {
			em.getTransaction().begin();

			em.persist(entidad);

			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();

			em.getTransaction().rollback();
		} finally {
			if (em.isOpen())
				em.close();
		}

	}

	@Override
	public List<Producto> getAll() {
		EntityManager em = this.factory.createEntityManager();
		List<Producto> productos = new LinkedList<>();

		try {
			Query query = em.createNamedQuery(QueryConstants.PRODUCTO_FINDALL);
			productos = query.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em.isOpen())
				em.close();
		}

		return productos;
	}

	@Override
	public Producto getByID(int id) {
		EntityManager em = this.factory.createEntityManager();
		Producto producto = null;

		try {
			Query query = em.createNamedQuery(QueryConstants.PRODUCTO_FINDBYID);
			query.setParameter("idProducto", id);

			producto = (Producto) query.getSingleResult();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em.isOpen())
				em.close();
		}

		return producto;
	}

	@Override
	public void delete(int id) {
		EntityManager em = this.factory.createEntityManager();

		try {
			em.getTransaction().begin();

			Producto prod = em.find(Producto.class, id);

			em.remove(prod);

			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();

			em.getTransaction().rollback();
		} finally {
			if (em.isOpen())
				em.close();
		}

	}

	@Override
	public void update(Producto entidad) {
		EntityManager em = this.factory.createEntityManager();

		try {
			em.getTransaction().begin();

			em.merge(entidad);

			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();

			em.getTransaction().rollback();
		} finally {
			if (em.isOpen())
				em.close();
		}

	}

}
