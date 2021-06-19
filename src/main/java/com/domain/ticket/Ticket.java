package com.domain.ticket;

import java.io.Serializable;
import java.util.List;

public class Ticket implements Serializable {
    //票号
    private String tktNo;
    private List<Pax> paxList;

    public String getTktNo() {
        return tktNo;
    }

    public void setTktNo(String tktNo) {
        this.tktNo = tktNo;
    }

    public List<Pax> getPaxList() {
        return paxList;
    }

    public void setPaxList(List<Pax> paxList) {
        this.paxList = paxList;
    }
}
