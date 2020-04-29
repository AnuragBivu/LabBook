package com.cg.iter.entitie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name ="trainee")
	public class Trainee {
		@Id
		 private Integer traineeId;
	    @Column(name ="name",length=20)
	    private String traineeName;
	    
	    @Column(name ="location",length=20)
	    private String traineeLocation;
	    
	    @Column(name ="domain",length=20)
	    private String traineeDomain;

	    public Trainee() {
			// TODO Auto-generated constructor stub
		}

	

		public Trainee(Integer traineeId, String traineeName, String traineeLocation, String traineeDomain) {
			super();
			this.traineeId = traineeId;
			this.traineeName = traineeName;
			this.traineeLocation = traineeLocation;
			this.traineeDomain = traineeDomain;
		}



		public Integer getTraineeId() {
			return traineeId;
		}



		public void setTraineeId(Integer traineeId) {
			this.traineeId = traineeId;
		}



		public String getTraineeName() {
			return traineeName;
		}

		public void setTraineeName(String traineeName) {
			this.traineeName = traineeName;
		}

		public String getTraineeLocation() {
			return traineeLocation;
		}

		public void setTraineeLocation(String traineeLocation) {
			this.traineeLocation = traineeLocation;
		}

		public String getTraineeDomain() {
			return traineeDomain;
		}

		public void setTraineeDomain(String traineeDomain) {
			this.traineeDomain= traineeDomain;
		}
		
}
