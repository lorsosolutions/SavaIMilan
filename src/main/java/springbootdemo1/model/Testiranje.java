package springbootdemo1.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity(name="testiranje")
public class Testiranje implements Serializable  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	public Testiranje(String ime) {
		this.ime=ime;		
	}
	
	public Testiranje () {}

	private String ime;
	
	public String getIme() {return ime;}
	public void setIme(String ime) {this.ime=ime;}
	
	public int getId() {return id;}
	
	
	@Override
	public String toString() {
		return "Ime je "+ime;
	}
	
}
