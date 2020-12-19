package om.sri.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
@MappedSuperclass
@Getter 
@Setter
public abstract class SuperEntity {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "createdby", nullable = true)
	protected Integer createdby;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createddate", length = 10)
	protected Date createddate;
	
	@Column(name = "updatedby", nullable = true)
	protected Integer updatedby;
	
	
}
