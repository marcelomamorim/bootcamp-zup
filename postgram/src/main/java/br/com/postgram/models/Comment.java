package br.com.postgram.models;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Comment {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=5, max=300)
	private String content;
	
	@OneToMany(mappedBy = "comment")
	private List<Reply> replies = new ArrayList<>();
	
	@NotNull
	private OffsetDateTime created_at;

}
