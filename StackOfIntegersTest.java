public class StackOfIntegersTest
{
	public static void main(String[] args) {
		StackOfIntegers obj = new StackOfIntegers(10);
		for(int i=0;i<10;i++){
		    obj.push(i);
		}
		System.out.println("Pop all elements in the stack, you will get: ");
		for(int i=0;i<10;i++){
		  //  obj.pop();
		    System.out.print(obj.pop() + " ");
		}
// 		System.out.println(obj.pop());
// 		obj.print();
	}
}
