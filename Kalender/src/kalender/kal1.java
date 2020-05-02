// Filnavn = kal1.java
package kalender;
public class kal1
{
byte dageImdr[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
// Returnerer true hvis aar er et skudaar, ellers returneres false
boolean skudaar(int aar)
{
if ( (aar % 400 == 0) || (aar % 4 == 0 && aar % 100 != 0))
return true;
else return false;
}
// Modtager årstal, månedsnummer og dag i måned
// Returner dagnummeret (Den julianske dato)
public int julliansk_dag(int aar, int mdr, int dag)
{
int i;
for (i = 1; i < mdr; i++)
dag += dageImdr[i];
if (mdr > 2 && skudaar(aar))
dag++;
return dag;
}
}