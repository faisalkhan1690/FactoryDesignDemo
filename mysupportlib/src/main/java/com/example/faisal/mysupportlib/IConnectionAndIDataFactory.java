package com.example.faisal.mysupportlib;

/**
 * Created by faisal on 12/2/2015.
 */
public class IConnectionAndIDataFactory {
    public static IConnectionAndIData getInstance(String libChoice){
        if(libChoice.equals("One")){
            return new MyLibImpOne();
        }else  if(libChoice.equals("Two")){
            return new MyLibImpTwo();
        }else if(libChoice.equals("Three")){
            return new MyLibImpThree();
        }else{
            return null;
        }
    }
}
