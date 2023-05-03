package pl.tabaka.foremny.core;

import pl.tabaka.foremny.figury.*;

public class FigureHandler {

    public Figure use(int[] boki) {
        if(boki.length==0 ){
            return new Exeption();
        }
        if(boki.length!=1&!czyMozliwy(boki)){
            return new Exeption();
        }
        switch (boki.length){
            case 1:
                return koloHandler(boki);
            case 3:
                return trojkatHanlder(boki);
            case 4:
                return czworokatHanlder(boki);
            case 5:
                return pieciokatHanlder(boki);
            case 6:
                return szesciokatHanlder(boki);
        }
        return new Figure();
    }

    private Figure koloHandler(int[] boki) {
        return new Kolo(boki);
    }

    private Figure trojkatHanlder(int[] boki) {
        if(boki[1]==boki[0]|boki[1]==boki[2]){
            if(boki[0]==boki[2]){
                return new TrojkatRownoboczny(boki);
            }
            return new TrojkatRownoramienny(boki);
        }
        return new Trojkat(boki);
    }

    private Figure czworokatHanlder(int[] boki) {
        if(boki[0]==boki[2]&boki[1]==boki[3]){
            if(boki[0]==boki[1]){
                return new Kwadrat(boki);
            }
            return new Prostokat(boki);
        }
        return new Czworokat(boki);
    }

    private Figure pieciokatHanlder(int[] boki){
        if(czyForemny(boki)){
            return new PieciokatForemny(boki);
        }
        return new Pieciokat(boki);
    }

    private Figure szesciokatHanlder(int[] boki){
        if(czyForemny(boki)){
            return new SzesciokatForemny(boki);
        }
        return new Szesciokat(boki);
    }

    private boolean czyForemny(int[] boki){
        for(int i=0;i<boki.length-1;i++) {
            if(boki[i]!=boki[i+1]){
                return false;
            }
        }
        return true;
    }

    private boolean czyMozliwy(int[] boki) {
        int suma=0;
        int maxIndex=0;
        for(int i=0;i<boki.length;i++){
            if(boki[maxIndex]<boki[i]){
                maxIndex=i;
            }
            suma+=boki[i];
        }
        return suma-boki[maxIndex]>boki[maxIndex];
    }

}
