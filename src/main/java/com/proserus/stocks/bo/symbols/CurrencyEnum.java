package com.proserus.stocks.bo.symbols;

import javax.swing.ImageIcon;

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
	WON("images/kr.png");
	
	private ImageIcon icon = null;
	private CurrencyEnum(String image){
		try{
		icon = new ImageIcon(getClass().getClassLoader().getResource(image));
		}catch(RuntimeException e){
			
		}
	}
	public ImageIcon getIcon() {
    	return icon;
    }
}
