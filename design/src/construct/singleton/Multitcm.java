package construct.singleton;

import java.util.ArrayList;
import java.util.List;

public class Multitcm {
    private static final int count = 5;
    private static List<Multitcm> multitcmList = new ArrayList<Multitcm>();
    private static List<Integer> nameList = new ArrayList<Integer>();
    private Multitcm(int f) {
        nameList.add(f);
    }
    static {
        for(int i = 0; i < count ; i ++) {
            multitcmList.add(new Multitcm(i));
        }
    }
    public static Multitcm getInstance(){
        return multitcmList.get((int)(Math.random()*multitcmList.size()));
    }
    public static Multitcm getInstance(int i){
        return multitcmList.get(i);
    }
}
