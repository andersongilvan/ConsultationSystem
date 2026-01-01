package ConsultationSystem.modules.doctors.entity;


import ConsultationSystem.modules.address.entity.Address;
import ConsultationSystem.modules.doctors.enums.Speciality;
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
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String crm;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Speciality speciality;

    @Column(nullable = false)
    private boolean active = true;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;


}
