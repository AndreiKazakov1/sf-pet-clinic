package by.iba.sfpetclinic.services;

import by.iba.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);


}
