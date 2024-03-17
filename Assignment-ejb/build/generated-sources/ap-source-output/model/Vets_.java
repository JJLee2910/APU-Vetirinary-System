package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Diagnosis;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-03-17T15:10:27")
@StaticMetamodel(Vets.class)
public class Vets_ { 

    public static volatile SingularAttribute<Vets, String> password;
    public static volatile SingularAttribute<Vets, String> expertise2;
    public static volatile SingularAttribute<Vets, String> expertise1;
    public static volatile SingularAttribute<Vets, String> id;
    public static volatile ListAttribute<Vets, Diagnosis> diagnoses;
    public static volatile SingularAttribute<Vets, String> email;

}