package springbootdemo1.model;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity(name="dokumenti")
public class Dokument implements Serializable  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	private String NazivFajla;
	private int ProfesorID;
	
	@Lob
	private Blob Fajl;
	
	private LocalDate DatumIzradeRada;
	
	private String ImeAutora;
	public Dokument() {}
	
	public Dokument(String naz,int profID,Blob faj, LocalDate datum, String ImeAutora ) {
		this.NazivFajla=naz;
		this.ProfesorID=profID;
		this.Fajl=faj;
		this.DatumIzradeRada=datum;
		this.ImeAutora=ImeAutora;
	}
	
	
	public int getId() {return id;}
	public String getNazivFajla() {return NazivFajla;}
	public LocalDate getDatumIzradeRada(){return DatumIzradeRada;}
	public int getProfesorID() {return ProfesorID;}
	public Blob getFajl() {return Fajl;}
	public String getImeAutora() {return ImeAutora;}
	
	
	@Override
	public String toString() {
		return "Ime je "+NazivFajla;
	}
	
	
}
