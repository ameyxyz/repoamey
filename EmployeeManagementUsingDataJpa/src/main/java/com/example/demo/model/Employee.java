package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cts_emp_info")
@NoArgsConstructor
@AllArgsConstructor
@Data // @Setter @Getter @RequiredArgsConstructor @ToString @EqualsAndHashCode
public class Employee {
	@Id
	@Column(name = "empno")
	@Min(value = 1, message="Empid cannot be negative")
	private int empId;
	@NotBlank(message = "Emp Name cannot be Empty/Null/Blank")
	@Column(name = "ename", nullable = false, length = 10)
	@Size(min=6, max=15, message="Name Length must be (6,15)")
	private String empName;
	@Min(value=10000, message ="Salary cannot be below 10000")
	@Max(value=100000, message="Salary cannot be above 100000")
	private int empSal;
	@NotEmpty(message="Designation cannot null/empty")
	private String empDesg;
    

}