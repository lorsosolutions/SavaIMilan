package springbootdemo1.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity(name="testiranje")
public class TestTask implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	public TestTask(String ime,java.util.Date dat,String imeA) {
		this.ime=ime;		
		this.datum=dat;

	}
	
	public TestTask () {}

	
	
	@Column(name="ime")
	private String ime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="datum")
	private java.util.Date datum;
	
	@Lob
	@Column(name="fajl")
	private byte[] fajl;
	

	
	public String getIme() {return ime;}
	public void setIme(String ime) {this.ime=ime;}
	
	public int getId() {return id;}
	
	public java.util.Date getDatum() {return datum;}
	public void setDatum(java.util.Date dat) {this.datum=dat;}
	
	public byte[] getFajl() {return fajl;}
	public void setDFajl(byte[] f) {this.fajl=f;}
	

	
	@Override
	public String toString() {
		return "Ime je "+ime;
	}
	
	
	
}
