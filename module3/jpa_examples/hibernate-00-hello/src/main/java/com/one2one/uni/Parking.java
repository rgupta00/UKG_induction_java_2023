package com.one2one.uni;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//one -to -one :Eager :fetch = FetchType.EAGER
@Entity
@Table(name = "parking_table_one2one_uni_1")
public class Parking {
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int partingId;
		private String parkingLocation;

		@JoinColumn(name = "eid_fk")
		@OneToOne(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
		private Employee employee;

		public Parking(String parkingLocation) {
			this.parkingLocation = parkingLocation;
		}
}