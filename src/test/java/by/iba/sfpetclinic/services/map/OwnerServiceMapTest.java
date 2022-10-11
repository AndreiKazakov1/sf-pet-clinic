package by.iba.sfpetclinic.services.map;

import by.iba.sfpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;
    Long ownerId = 1L;

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(), new PetServiceMap());
        ownerServiceMap.save(Owner.builder().id(ownerId).build());

    }


    @Test
    void findAll() {
        Set<Owner> ownerSet =ownerServiceMap.findAll();
        assertEquals(1L, ownerSet.size());
    }

    @Test
    void deleteById() {
    }

    @Test
    void delete() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByLastName() {
    }

    @Test
    void save() {
    }
}