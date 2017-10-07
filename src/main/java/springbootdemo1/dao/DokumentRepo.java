package springbootdemo1.dao;

import org.springframework.data.repository.CrudRepository;

import springbootdemo1.model.Dokument;

public interface DokumentRepo extends CrudRepository<Dokument, Integer> {

}
