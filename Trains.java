package homeWork2;


import lesson2.test2.Book;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;
import java.util.Arrays;
import java.sql.Time;

/**
 * Created by macbookair on 17.02.16.
 */

@XmlRootElement(name = "trains")
public class Trains {
    private int id = 0;

    @XmlElement(name = "train")
    private List<Train> list = new ArrayList<>();

    //    private HashMap<Integer, Train > map= new HashMap<>();
//    private Set<Map.Entry<Integer, Train>> list = map.entrySet();
    public Trains (){}

    public void add(Train train){
        id++;
        train.setId(id);
        list.add(train);

    }

    public List<Train> getList(){
        id = list.size();
        return list;
    }

//    public Train getTrain (int id){
//        Train train1 = map.get(id);
//        return train1;
//    }

    @Override
    public String toString(){
        return Arrays.deepToString(list.toArray());
    }

}
