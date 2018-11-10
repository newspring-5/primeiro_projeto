package sheik.primeiro.projeto.entity;

import javax.persistence.*;

@Entity
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long Id;
	private String nome;
	private String apelido;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
}
