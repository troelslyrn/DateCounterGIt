
package kalender;
public class afstand
{
public int dato_diff(int aar1, int mdr1, int dag1,
int aar2, int mdr2, int dag2)
{
int diffDage,i;
kal1 a = new kal1();
diffDage = a.julliansk_dag(aar1, mdr1, dag1) -
a.julliansk_dag(aar2, mdr2, dag2);
for (i = aar2; i < aar1; i++)
if (a.skudaar(i))
diffDage += 366;
else diffDage += 365;
return diffDage;
}
}