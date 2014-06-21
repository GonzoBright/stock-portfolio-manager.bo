package com.proserus.stocks.bo.symbols;

import javax.swing.ImageIcon;

import org.apache.commons.lang3.Validate;

import com.proserus.stocks.bo.common.Usage;
import com.proserus.stocks.bo.utils.LoggerUtils;

public enum CurrencyEnum {
	//
	AUD("images/au.png"),
	BRL("images/bz.png"),
	CAD("images/ca.png"),
	CHF("images/ch.png"),
	CNY("images/cn.png"),
	CZK("images/cz.png"),
	EUR("images/eu.png"),
	GBP("images/gb.png"),
	HKD("images/hk.png"),
	ILS("images/il.png"),
	INR("images/in.png"),
	JPY("images/jp.png"),
	NZD("images/nz.png"),
	RUB("images/ru.png"),
	SEK("images/se.png"),
	SAR("images/za.png"),
	USD("images/us.png"),
	WON("images/kr.png"),
	ERROR("Error", Usage.INTERNAL);
	
	private ImageIcon icon = null;
    private Usage usage;
    private String imageName;
	private CurrencyEnum(String image){
		this(image, Usage.VISIBLE);
	}
	
	private CurrencyEnum(String imageName, Usage usage){
	    this.imageName = imageName;
        Validate.notNull(usage);
	    Validate.notNull(imageName);
        this.usage = usage;
        try {
            icon = new ImageIcon(getClass().getClassLoader().getResource(imageName));
        } catch (RuntimeException e) {

        }
    }
	
	public boolean isVisible(){
	    return Usage.VISIBLE.equals(usage);
	}
	
	
	public ImageIcon getIcon() {
    	return icon;
    }
	
	@Override
    public String toString() {
	    assert LoggerUtils.validateCalledFromLogger(): LoggerUtils.callerException();
        return "CurrencyEnum: name=" + name() + ", imageName=" + imageName + ", usage=" + usage;
    }
}
