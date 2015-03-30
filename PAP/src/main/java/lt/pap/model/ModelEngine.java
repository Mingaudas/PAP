package lt.pap.model;

import java.time.YearMonth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "pap", name = "model_engine")
public class ModelEngine extends AbstractEntity {
	/**
     * 
     */
	private static final long serialVersionUID = 1783088191174527679L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "model_id")
	private Model model;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "engine_id")
	private Engine engine;

	@Column(name = "from_year", nullable = false)
	private YearMonth from;

	@Column(name = "to_year", nullable = false)
	private YearMonth to;

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public YearMonth getFrom() {
		return from;
	}

	public void setFrom(YearMonth from) {
		this.from = from;
	}

	public YearMonth getTo() {
		return to;
	}

	public void setTo(YearMonth to) {
		this.to = to;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj != null && obj instanceof ModelEngine && ((ModelEngine) obj)
				.getId().equals(getId()));
	}
}
