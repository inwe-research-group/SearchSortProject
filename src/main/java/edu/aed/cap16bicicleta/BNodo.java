package edu.aed.cap16bicicleta;

import uni.aed.model.Bicicleta;

public class BNodo {
    Bicicleta data;
    BNodo next;

    public BNodo(Bicicleta data) {
        this.data=data;
        this.next=null;        
    }
    public BNodo(Bicicleta data,BNodo n) {
        this.data=data;
        this.next=n;
    }
    
}
