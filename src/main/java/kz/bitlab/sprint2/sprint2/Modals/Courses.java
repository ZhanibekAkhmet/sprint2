package kz.bitlab.sprint2.sprint2.Modals;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "courses")
@Getter
@Setter
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column(name = "name_course")
    private String nameCourse;
    @Column(name = "price")
    private int price;
    @Column(name = "description")
    private String description;
}
