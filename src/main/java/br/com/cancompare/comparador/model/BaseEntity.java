package br.com.cancompare.comparador.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.jboss.seam.solder.core.Veto;


@MappedSuperclass
@Veto
public interface BaseEntity extends Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long id = null;

    @Temporal(value = TemporalType.TIMESTAMP) Date createdOn = null;

    @Temporal(value = TemporalType.TIMESTAMP) Date modifiedOn = null;
    
    @PrePersist void initTimeStamps();

    @PreUpdate void updateTimeStamp();
}
