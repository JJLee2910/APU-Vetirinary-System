package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Customers;
import model.Diagnosis;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-03-17T15:10:27")
@StaticMetamodel(Pets.class)
public class Pets_ { 

    public static volatile SingularAttribute<Pets, Customers> owner;
    public static volatile SingularAttribute<Pets, String> id;
    public static volatile ListAttribute<Pets, Diagnosis> diagnoses;

}