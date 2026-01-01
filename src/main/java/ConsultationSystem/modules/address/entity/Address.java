package ConsultationSystem.modules.address.entity;


import ConsultationSystem.modules.doctors.entity.Doctor;
import ConsultationSystem.modules.patient.entity.Patient;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String street;

    @Column
    private String neighborhood;

    @Column
    private String city;

    @Column
    private String state;

    @Column(name = "zip_code")
    private String zipCode;

    @OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
    private Doctor doctor;

    @OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
    private Patient patient;

}
