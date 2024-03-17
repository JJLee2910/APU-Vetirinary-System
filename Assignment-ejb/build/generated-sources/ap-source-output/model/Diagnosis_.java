package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Pets;
import model.Vets;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-03-17T15:10:27")
@StaticMetamodel(Diagnosis.class)
public class Diagnosis_ { 

    public static volatile SingularAttribute<Diagnosis, Vets> vet;
    public static volatile SingularAttribute<Diagnosis, String> sessionDate;
    public static volatile SingularAttribute<Diagnosis, String> appointmentId;
    public static volatile SingularAttribute<Diagnosis, String> diagnosis;
    public static volatile SingularAttribute<Diagnosis, String> sessionTime;
    public static volatile SingularAttribute<Diagnosis, Long> id;
    public static volatile SingularAttribute<Diagnosis, Pets> pet;

}