package springbootdemo1.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import springbootdemo1.dao.DokumentRepo;
import springbootdemo1.model.Dokument;;

@Service
@Transactional
public class DokumentService {

	private final DokumentRepo dokumentiRep;
	
	
	public DokumentService(DokumentRepo t) {
		
		this.dokumentiRep=t;
		
	}
	
	public List<Dokument> findAll() {
		List<Dokument> testTasks = new ArrayList<>();
		for (Dokument testTask : dokumentiRep.findAll()) {
			testTasks.add(testTask);
		}
		return testTasks;
	}

	public void delete(int id) {
		dokumentiRep.delete(id);
	}
		
}
