package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "inventory")


public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
	@Column(name = "file_number")
	private String fileNumber;
	
		@Column(name = "description")
	private String description;
	
		@Column(name = "quantity")
	private String quantity;
		
		@Column(name = "print_size")
	private String printSize;
		
		@Column(name = "print_type")
	private String printType;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}
		
		public String getFileNumber() {
			return fileNumber;
		}

		public void setFileNumber(String fileNumber) {
			this.fileNumber = fileNumber;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getQuantity() {
			return quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public String getPrintSize() {
			return printSize;
		}

		public void setPrintSize(String printSize) {
			this.printSize = printSize;
		}

		public String getPrintType() {
			return printType;
		}

		public void setPrintType(String printType) {
			this.printType = printType;
		}
}
