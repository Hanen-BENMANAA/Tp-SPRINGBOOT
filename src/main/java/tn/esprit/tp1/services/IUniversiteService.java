package tn.esprit.tp1.services;

import tn.esprit.tp1.entity.Universite;

import java.io.Serializable;
import java.util.List;

public interface IUniversiteService {

    public List<Universite> retrieveAllUniversites();
    public Serializable retrieveUniversite(Long universiteId);
    public Universite addUniversite(Universite f);
    public void removeUniversite(Long universiteId);
    public Universite modifyUniversite(Universite universite);

    // Here we will add later methods calling keywords and methods calling JPQL

}