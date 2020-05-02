
import kalender.afstand;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class testkal2
{
public static void main(String arg[])
{
    afstand a = new afstand();
// Beregn aftanden mellem d. 3/1 2001 og 3/1 1999
System.out.println(a.dato_diff(2001,1,3,1999,1,3));
// Her er ingen år 2000 problemer :)
}
}