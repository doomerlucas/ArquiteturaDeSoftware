package previsao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class previsao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dia;
	private Integer tempMin;
	private Integer tempMax;
	private Integer umi;
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Integer getTempMin() {
		return tempMin;
	}

	public void setTempMinima(Integer tempMin) {
		this.tempMin = tempMin;
	}

	public Integer getTempMax() {
		return tempMax;
	}

	public void setTempMax(Integer tempMax) {
		this.tempMax = tempMax;
	}

	public Integer getUmi() {
		return umi;
	}

	public void setUmi(Integer umi) {
		this.umi = umi;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}