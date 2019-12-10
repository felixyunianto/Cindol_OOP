package OOP2.B.dikipriyanto.PertandinganGameOnline.repo;

import OOP2.B.dikipriyanto.PertandinganGameOnline.entity.Jadwal_Pertandingan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PertandinganRepo extends JpaRepository<Jadwal_Pertandingan, String> {
}
