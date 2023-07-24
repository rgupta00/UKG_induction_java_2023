package com.one2one.uni;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "emp_table_one2one_uni_1")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int empId;
		private String empName;

		public Employee(String empName) {
			this.empName = empName;
		}
}