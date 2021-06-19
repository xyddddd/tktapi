package com.domain.ticket;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {
    //订单号
    private Long orderNo;
    //渠道
    private String channel;
    //订单日期
    private Date crtDt;
    //国际?
    private Integer isInter;
    private List<Ticket> tickets;

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Date getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }

    public Integer getIsInter() {
        return isInter;
    }

    public void setIsInter(Integer isInter) {
        this.isInter = isInter;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
