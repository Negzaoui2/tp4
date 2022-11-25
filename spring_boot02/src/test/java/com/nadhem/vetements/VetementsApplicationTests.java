package com.nadhem.vetements;



import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nadhem.vetements.entities.Marque;
import com.nadhem.vetements.entities.Vetement;
import com.nadhem.vetements.repos.VetementRepository;


@SpringBootTest
class VetementsApplicationTests {

	@Autowired
	private VetementRepository vetementRepository;
	
	@Test
	public void testCreateVetement() {
	Vetement prod = new Vetement("rtryry",240.4,new Date());
	vetementRepository.save(prod);
	}
	
	@Test
	public void testFindVetement()
	{
	Vetement p = vetementRepository.findById(1L).get();
	System.out.println(p);
	}
	
	@Test
	public void testUpdateVetement()
	{
	Vetement p = vetementRepository.findById(1L).get();
	p.setPrixVetement(2000.0);
	vetementRepository.save(p);
	
	System.out.println(p);
	}
	
	@Test
	public void testDeleteVetement()
	{
		vetementRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllVetements()
	{
		List<Vetement> prods = vetementRepository.findAll();
		
		for (Vetement p:prods)
			 System.out.println(p);
		
	}
	
	
	@Test
	public void testFindVetementByNom()
	{
	List<Vetement> prods = vetementRepository.findByNomVetement("PC Dell");
	
	for (Vetement p:prods) {
		 System.out.println(p);
	 
	}
	}
	
	@Test
	public void testFindVetementByNomContains()
	{
	List<Vetement> prods = vetementRepository.findByNomVetementContains("P");
	
	for (Vetement p:prods)
		 System.out.println(p);
	
	}
	
	@Test
	public void testfindByNomPrix()
	{
	List<Vetement> prods = vetementRepository.findByNomPrix("PS 4", 1000.0);
		for (Vetement p : prods)
			{
				System.out.println(p);
			}
	}
	
	
	@Test
	public void testfindByMarque()
	{
	Marque M = new Marque();
	M.setIdM(1L);
	
	List<Vetement> prods = vetementRepository.findByMarque(M);
	for (Vetement p : prods)
	{
		System.out.println(p);
	}
	}
	
	@Test
	public void findByMarqueIdCat()
	{
	List<Vetement> prods = vetementRepository.findByMarqueIdM(1L);
	for (Vetement p : prods)
	{
		System.out.println(p);
	}
	}
	
	
	@Test
	public void testfindByOrderByNomVetementAsc()
	{
	List<Vetement> prods =  vetementRepository.findByOrderByNomVetementAsc();
	for (Vetement p : prods)
		{
			System.out.println(p);
		}
	}
	
	@Test
	public void testTrierVetementsNomsPrix()
	{
	List<Vetement> prods = vetementRepository.trierVetementsNomsPrix();
	for (Vetement p : prods)
	{
	System.out.println(p);
	}
	}
	
	
}
