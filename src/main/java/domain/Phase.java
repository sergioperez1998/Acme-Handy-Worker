
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Phase extends DomainEntity {

	//Attribute
	private String	title;
	private String	description;
	private Date	startMoment;
	private Date	finishMoment;
	private int		number;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}
	@NotNull
	public Date getStartMoment() {
		return this.startMoment;
	}

	public void setStartMoment(final Date startMoment) {
		this.startMoment = startMoment;
	}
	@NotNull
	public Date getFinishMoment() {
		return this.finishMoment;
	}

	public void setFinishMoment(final Date finishMoment) {
		this.finishMoment = finishMoment;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(final int number) {
		this.number = number;
	}


	//Relationships
	private Fix_up_Task	fixUpTask;


	@NotNull
	@Valid
	public Fix_up_Task getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final Fix_up_Task fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

}
