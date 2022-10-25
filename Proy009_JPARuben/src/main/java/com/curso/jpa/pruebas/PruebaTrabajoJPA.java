package com.curso.jpa.pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.curso.jpa.entities.Trabajo;

public class PruebaTrabajoJPA {
	public static void main(String[] args) {

		// factoria de entity manager
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OracleHRPU");

		// obtener un entity manager que conecta con HR de oracle y mapea clases entidad
		EntityManager em = factory.createEntityManager();

		// obtener el trabajo con id = AD_VP
		Trabajo t = em.find(Trabajo.class, "AD_VP");
		System.out.println(t);

		// crear un nuevo trabajo
		Trabajo tNuevo = new Trabajo("BE_OLS", "Oficial Técnico de maquinaria", Double.valueOf(6000),
				Double.valueOf(12000));

		// insert
		// iniciamos un nuevo contexto transaccional para luego confirmar y comitear
		try {
			em.getTransaction().begin();
			em.persist(tNuevo);
			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();

			em.getTransaction().rollback();
		}

		// update - metodo 1 - despues de un "find"
		try {
			em.getTransaction().begin();

			Trabajo tDesdeBD = em.find(Trabajo.class, tNuevo.getId());
			tDesdeBD.setMaxSalary(Double.valueOf(8399290));

			em.getTransaction().commit(); // hace la update aqui (update + commit)
		} catch (Exception e) {
			e.printStackTrace();

			em.getTransaction().rollback();
		}

		// update - metodo 2 - metodo "merge"
		try {
			em.getTransaction().begin();

			Trabajo tDesdeBDMerge = em.merge(tNuevo);

			tNuevo.setTitle("akdasdj"); // esto NO persiste conra BBDD cuando hacemos commit

			tDesdeBDMerge.setTitle("akdasdj"); // esto SI persiste conra BBDD cuando hacemos commit

			em.getTransaction().commit(); // solo hace una update, tras todos los cambios en la transaccion
		} catch (Exception e) {
			e.printStackTrace();

			em.getTransaction().rollback();
		}

		// delete
		try {
			em.getTransaction().begin();

			em.remove(em.find(Trabajo.class, tNuevo.getId())); // primero hay que hacer un find del objeto, sino da un
																// error

			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();

			em.getTransaction().rollback();
		}

		// consulta JPAQuery
		try {
			em.getTransaction().begin();

			Query query = em.createQuery("SELECT t from Trabajo t");

			List<Trabajo> trabajos = query.getResultList();

			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();

			em.getTransaction().rollback();
		}

	}
}
