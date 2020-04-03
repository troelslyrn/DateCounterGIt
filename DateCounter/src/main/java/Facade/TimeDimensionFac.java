/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.TimeDimension;
import InterFaces.DateCounterInterFace;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;

/**
 *
 * @author troel
 */
public class TimeDimensionFac implements DateCounterInterFace {

    private EntityManagerFactory emf;
    
    public TimeDimensionFac (EntityManagerFactory emf){
    this.emf = emf;
    }
    //ved at benytte mig EntityManager kan jeg benytte mig af( em.find til at hende TimeDimension ud fra id)
    @Override
    public TimeDimension GetTimeDimension(int id) {
        EntityManager em = emf.createEntityManager();
        try{
        em.getTransaction().begin();
        TimeDimension timeD = em.find(TimeDimension.class, id);
        em.getTransaction().commit();
        return timeD;
        } finally{
        em.close();
        }
    }
    //her laves der en metode der, der henter alle elementer fra TimeDimension og putter det ind på en liste.//
    
    @Override
    public List<TimeDimension> GetAllTimeDimensions() {
        EntityManager em = emf.createEntityManager();
        List<TimeDimension> timeDimensions = null;
        try{
        em.getTransaction().begin();
       //her sætter man listen timeDimensions = med alle elementer fra tabellen TimeDimension// 
       
        timeDimensions = em.createQuery("SELECT * FROM TimeDimension").getResultList();
        em.getTransaction().commit();
        return timeDimensions;
        }
        finally{
        em.close();
        }
    }
    
}
