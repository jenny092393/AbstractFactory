import java.util.ArrayList;
class TipoItemDaoImpl implements TipoItemDao{


    public ArrayList <TipoItem> tipoItems;

    public TipoItemDaoImpl(){
        tipoItems = new ArrayList<>();
    }

    @Override
    public void addTipoItem(TipoItem tipoItem){
        tipoItems.add(tipoItem);
    }

    @Override
    public void printTipoItem(){
        for(TipoItem tipoItem :  tipoItems){
            System.out.println(tipoItem.printInfo());
        }
    }

    @Override
    public void delTipoItem(int idTipoInfo){
        int index = 0;

        for(TipoItem tipoItem: tipoItems){
            if(tipoItem.getIdDescription() == idTipoInfo){
                tipoItems.remove(index);
            }

            index++;
        }
    }

    @Override
    public void updateTipoItem(int idTipoItem, TipoItem newTipoItem){
        int index = 0;

        for(TipoItem tipoItem: tipoItems){
            if(tipoItem.getIdDescription() == idTipoItem){
                tipoItems.set(index, newTipoItem);
            }
            index++;
        }
    }
}