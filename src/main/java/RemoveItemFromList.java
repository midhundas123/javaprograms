import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveItemFromList {

    public static void main(String[] args) {
        String removeElement = "testNg";

        List myList= new ArrayList<String>();
        myList.add("fsf");
        myList.add("fsf4324");
        myList.add("testNg");
        System.out.println("before"+myList);
        Iterator itr= myList.iterator();
        while (itr.hasNext()){
            if (removeElement.equals(itr.next())){
                itr.remove();
            }
        }

        System.out.println("after"+myList);
    }

}
