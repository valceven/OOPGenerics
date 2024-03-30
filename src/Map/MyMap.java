package Map;

import java.util.ArrayList;

public class MyMap <X,Y>{

    ArrayList <X> keys;
    ArrayList <Y> values;

    public MyMap(){
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(X key, Y value){
        int temp = keys.indexOf(key);
        if(temp == -1){
            keys.add(key);
            values.add(value);
        }else{
            values.set(temp,value);
        }
    }

    public Y get(X key){
        if(keys.contains(key)){
            return values.get(keys.indexOf(key));
        }else {
            return null;
        }
    }

    public Y remove(X key){
        int index = keys.indexOf(key);
        if(index != -1){
               keys.remove(index);
               return values.remove(index);
        }else{
            return null;
        }
    }



}
