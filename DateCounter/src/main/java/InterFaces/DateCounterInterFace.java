/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterFaces;
import Entity.TimeDimension;
import java.util.List;

/**
 *
 * @author troel
 */

//her laver jeg et interface som kan implementeres i facaden//
public interface DateCounterInterFace {
 /* her laver jeg en "skabelon" til hvordan en get TimeDimension skal sættes op 
    jeg havde oprindeligt sat databasen op med en date db_date som ville se sådan ud i Databasen (2017-01-01) men 
    for at benytte dette, vil jeg skulle bruge jave date class som jeg ikke måtte, så har valgt at køre på id istedet) 
    */
    public TimeDimension GetTimeDimension (int id);
 /*
    her laver jeg en "skabelon" til metode get all. det vil fungere, ved at der laves en liste om TimeDimension
    */
    public List <TimeDimension> GetAllTimeDimensions ();
}