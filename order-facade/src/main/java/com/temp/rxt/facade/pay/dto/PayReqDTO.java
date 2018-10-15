package com.temp.rxt.facade.pay.dto;

/**
 * @author junrainbow
 * @Description
 * @Date:Create in 2018-10-15 11:08
 */
public class PayReqDTO {


    private String requestNo;
    private String amount;

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
