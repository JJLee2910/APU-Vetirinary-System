package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Pets;
import model.Vets;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-03-17T15:10:27")
@StaticMetamodel(Appointments.class)
public class Appointments_ { 

    public static volatile SingularAttribute<Appointments, Vets> vet;
    public static volatile SingularAttribute<Appointments, String> appointmentTime;
    public static volatile SingularAttribute<Appointments, Long> id;
    public static volatile SingularAttribute<Appointments, String> appointmentDate;
    public static volatile SingularAttribute<Appointments, Pets> pet;

}