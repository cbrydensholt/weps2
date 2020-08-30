package com.company;

import java.util.ArrayList;

public class Members extends Person{
    public Members(String name, int CPR, boolean isBasic, int fee) {
        super(name, CPR);
        this.isBasic = isBasic;
        this.fee = fee;
    }

    ArrayList<Members> membersArrayList = new ArrayList<>();


    //Members members = new Members("Hank", 20202082, true);


    boolean isBasic;
    int fee;

    public Members() {

    }


    public boolean isBasic() {
        return isBasic;
    }

    public void setBasic(boolean basic) {
        isBasic = basic;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
