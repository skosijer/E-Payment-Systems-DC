package dc.insurance.repo; 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Kategorija;
import dc.insurance.domain.TipRizika;

@Repository
public interface TipRizikaRepository extends JpaRepository<TipRizika, Integer>{

	TipRizika findById(int id);
	List<TipRizika> findByNaziv(String naziv);
	List<TipRizika> findByKategorija(Kategorija kategorija);
}