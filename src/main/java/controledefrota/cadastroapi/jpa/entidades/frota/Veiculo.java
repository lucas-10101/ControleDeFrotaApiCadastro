package controledefrota.cadastroapi.jpa.entidades.frota;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "veiculos")
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id; // TODO changelog

	private String placa;

	@Column(name = "codigo_interno")
	private String codigoInterno; // TODO changelog

	@Column(name = "numero_eixos")
	private Short numeroEixos; // TODO changelog

	@Column(name = "ano_fabricacao")
	private Short anoFabricacao; // TODO changelog

	@Column(name = "ano_modelo")
	private Short anoModelo; // TODO changelog

	private String chassi; // TODO changelog

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_marca_veiculo")
	private MarcaVeiculo marcaVeiculo; // TODO changelog

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_modelo_veiculo")
	private ModeloVeiculo modeloVeiculo; // TODO changelog

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_veiculo")
	private TipoVeiculo tipoVeiculo; // TODO changelog
}
