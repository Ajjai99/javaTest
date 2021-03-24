package JavaCollection;

public class CollectionDemo8 
{
	/*ANS : 18 -> B. Change the Herbivore interface to interface Herbivore<E extends Animal> extends Hungry<E> {} 
	 *  D. Change the Sheep class to class Sheep extends Plant implements Carnivore<Wolf> { public void
	munch(Wolf x) {} } 

	 */

}
interface Hungry<E> { 
	void munch(E x);
	}
interface Carnivore<E extends Animal> extends Hungry<E> 
{
	
}
interface  Herbivore<E extends Animal> extends Hungry<E> 
{
	
}
abstract class Plant 
{
	}
class Grass extends Plant 
{
	}
abstract class Animal 
{
	}
class Sheep extends Animal implements  Herbivore<Sheep>
{
public void munch(Sheep x) {}
}
class Wolf extends Animal implements Carnivore<Wolf> 
{ 
	public void munch(Wolf x)
	{} 
	
//Carnivore<Sheep> 
/*{
public void munch(Sheep x) {}
} */
}

/*18 -> B. Change the Herbivore interface to interface Herbivore<E extends Animal> extends Hungry<E> {} 
 *  D. Change the Sheep class to class Sheep extends Plant implements Carnivore<Wolf> { public void
munch(Wolf x) {} } 

 */

/* 19-> B. 2 2 3 4 */