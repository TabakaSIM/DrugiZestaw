package pl.tabaka.dwudziestyMaja.FIFO;

import java.util.ArrayList;
import java.util.List;

public class FIFOPriority {

    ArrayList<FIFOEntry> list = new ArrayList<FIFOEntry>();
    FIFOGUI gui = new FIFOGUI();

    public FIFOPriority() {
        while(true){
           switch(gui.mainInput()){
               case "1":
                    push(gui.podajStringa(),gui.podajPriorytet());
                    continue;
               case "2":
                    if(list.isEmpty()) {
                       gui.errorBrakDanych();
                       continue;
                    }
                    this.submenu();
                    continue;
               case "3":
                    System.out.println("Bye, bye!");
                    break;
               default:
                    gui.error();
                    continue;
            }
        }
    }
    private void submenu(){
        while (true){
            if(list.isEmpty()) {
                gui.errorBrakDanych();
                break;
            }
            switch (gui.subMainInput()){
                case "1":
                    gui.show(this.popFirst());
                    break;
                case "2":
                    gui.show(this.popHighThree());
                    break;
                case "3":
                    gui.show(this.popHighest());
                    break;
                case "4":
                    break;
                default:
                    gui.error();
                    continue;
            }
        }
    }

    private void push(String string, int priority){
        list.add(new FIFOEntry(string, priority));
    }
    private FIFOEntry popFirst(){
        FIFOEntry ret =list.get(0);
        list.remove(0);
        return ret;
    }
    private FIFOEntry popHighThree(){
        int index=0;
        if(list.get(index).getPriority()<list.get(1).getPriority()) index=1;
        if(list.get(index).getPriority()<list.get(2).getPriority()) index=2;

        FIFOEntry ret =list.get(index);
        list.remove(index);
        return ret;
    }
    private FIFOEntry popHighest(){
        int index=0;
        for (int i=1;i< list.size();i++){
            if(list.get(index).getPriority()<list.get(i).getPriority()) index=i;
        }
        FIFOEntry ret =list.get(index);
        list.remove(index);
        return ret;
    }
}
