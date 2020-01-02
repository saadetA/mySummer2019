package day33_methods;
import java.util.ArrayList;
public class Arraylist1 {
	public static void main(String[] args) {

		// declaration of arraylist:
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<>();

		// add(object):
		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("apple"); // index: 0 , size: 1
		shoppingList.add("orange"); // index: 1, size: 2
		shoppingList.add("grape"); // index: 2, size: 3

		System.out.println(shoppingList);

		// add(index, object): adds the object at the given index number
		// WE CANNOT SKIP THE INDEXES

		// shoppingList.add("Strawberry");
		shoppingList.add(1, "Strawberry");
		System.out.println(shoppingList);

		// shoppingList.add(5 , "Toyota Corolla"); // it does not skip indexes
		System.out.println(shoppingList);

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0, 5); // [5]
		numbers.add(1, 10); // [5, 10]
		numbers.add(2, 15); // [5, 10, 15]

		numbers.add(1, 1); // [5, 1, 10, 15]

		numbers.add(1, 6); // [5, 6, 1, 10, 15]

		System.out.println(numbers);

		// get(index number): returns the object
		ArrayList<String> names = new ArrayList<>();
		names.add("Homayra");
		names.add("Meri");
		names.add(1, "Mikrigul");
		names.add(1, "Tabriz");
		names.add(0, "Asiya");

		String str1 = names.get(1);
		System.out.println(str1);

	}

}
