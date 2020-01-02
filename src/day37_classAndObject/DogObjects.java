package day37_classAndObject;

public class DogObjects {
public static void main(String[] args) {
	//once objemizi constrctor olarak create ediyoruz 1
Dog dog1=new Dog();
System.out.println(dog1.name);//dersekinitlze etmedigimiz icin null verir

//attributeleri(ozellikleri)initilze ediyoruz 2

dog1.breed="husky";
dog1.color="gray and white";
dog1.name="Holly";
dog1.age=25;
dog1.Gender='F';
dog1.size="small";

dog1.getinfo();

//ikinci objeyi create edip ozelikleri ona da create edebiliriz

Dog dog2=new Dog();
dog2.breed="husky";
dog2.color="black";
dog2.name="lika";
dog2.Gender='m';
dog2.food="sushi";

dog2.eat();

dog2.play();

dog1.play();


}
/*create a custom class for emplooyees assignment
Atrribuets;Employeename
           Employeid
            jobtitle
            ssn
            gender
            salary
Actions.getinfo
*
*
*
*/


}
