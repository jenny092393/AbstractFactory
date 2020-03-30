import java.util.ArrayList;
import java.util.List;


public class ItemDaoImpl implements ItemDao {

    //list is working as a database
    public ArrayList<Item> items;

    public ItemDaoImpl() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(Item item){
        items.add(item);
    }

    @Override
    public void printItem(){
        for(Item items: items){
            System.out.println(items.printInfo());
        }
    }

    @Override
    public void delItem(int idItem){
        int index = 0;

        for(Item item: items){

            if( item.getId() == idItem ){
                items.remove(index);
            }

            index++;
        }
    }

    @Override
    public void updateItem(int idItem, Item newItem){
        int index = 0;

        for(Item item: items){

            if( item.getId() == idItem){
                items.set(index, newItem);
            }

            index++;
        }
    }
}