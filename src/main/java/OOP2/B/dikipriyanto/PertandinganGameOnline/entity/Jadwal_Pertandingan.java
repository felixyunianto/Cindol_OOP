package OOP2.B.dikipriyanto.PertandinganGameOnline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jadwal_Pertandingan {
    @Id
    @Getter @Setter
    private String id;

    @Getter @Setter
    private String nama_tim;

    @Getter @Setter
    private String grup;

    @Getter @Setter
    private String jam_tanding;

    @Getter @Setter
    private String tanggal_tanding;

}
