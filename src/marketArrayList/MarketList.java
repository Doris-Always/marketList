package marketArrayList;

import java.util.ArrayList;

public class MarketList {
    private boolean isEmpty = true;

    private int counter = 0;
    private final ArrayList<String> marketList = new ArrayList<>();

    public boolean isEmpty() {
       return isEmpty;
    }

    public void addToList(String item) {
        marketList.add(item);
        counter++;
        isEmpty = false;
    }
    public String getIndexOfItem(int id) {

        return marketList.get(id);
    }
    public boolean removeItem(String item){
        counter--;
        return marketList.remove(item);

    }

    public boolean containsItem(String item) {
        if (marketList.contains(item)){
            return true;
        }

        return false;
    }

    public int clearAllItem(int size) {
        counter = 0;
        marketList.clear();
        return size;
    }

    public int sizeOfList() {
        return counter;
    }

    public void printList(){
        System.out.println("the market list" + marketList.size());
        for (int i = 0;i < marketList.size();i++){
            System.out.println((i+1) + " " + marketList.get(i));
        }
    }

    public void modifyList(int position,String newItem){
        marketList.set(position+1,newItem);
        System.out.println("item" + (position+1) + " "+ " has been modified");
    }



    public String findItem(String item){
//        boolean itemExist = marketList.contains(item);
        int positionOfItem = marketList.indexOf(item);
        if (positionOfItem >= 0){
            return marketList.get(positionOfItem);
        }
        return null;
    }



}
