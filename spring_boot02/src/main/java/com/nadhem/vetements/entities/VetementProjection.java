package com.nadhem.vetements.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomProd", types = { Vetement.class })
public interface VetementProjection {
	
  public String getNomVetement();
  
}
