package com.proserus.stocks.model.analysis;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import com.proserus.stocks.model.symbols.CurrencyEnum;
import com.proserus.stocks.model.symbols.Symbol;
import com.proserus.stocks.utils.BigDecimalUtils;

public class AnalysisImpl implements Analysis {
	private BigDecimal averageCostPerDay;
	private BigDecimal averagePrice;
	private BigDecimal capitalGain;
	private BigDecimal capitalGainPercent;
	private BigDecimal commission;
	private BigDecimal cost;
	private CurrencyEnum currency = null;
	private BigDecimal dividend;
	private BigDecimal dividendYield;
	private BigDecimal duration;
	private BigDecimal durationCost;
	private BigDecimal longuestHolding;
	private BigDecimal marketGrowth;
	private BigDecimal marketValue;
	private BigDecimal overallReturn;

	private BigDecimal quantity;
	private BigDecimal quantityBuy;
	private BigDecimal quantitySold;
	private DateTime startOfPeriod;
	private DateTime endOfPeriod;

	public DateTime getStartOfPeriod() {
		return startOfPeriod;
	}

	public void setStartOfPeriod(DateTime startOfPeriod) {
		this.startOfPeriod = startOfPeriod;
	}

	public DateTime getEndOfPeriod() {
		return endOfPeriod;
	}

	public void setEndOfPeriod(DateTime endOfPeriod) {
		this.endOfPeriod = endOfPeriod;
	}

	public BigDecimal getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(BigDecimal numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public BigDecimal getAnnualizedReturn() {
		return annualizedReturn;
	}

	public void setAnnualizedReturn(BigDecimal annualizedReturn) {
		this.annualizedReturn = annualizedReturn;
	}

	private BigDecimal numberOfYears;

	private BigDecimal annualizedReturn;

	private Symbol symbol = null;
	private BigDecimal totalPriceHolding;
	private BigDecimal totalSold;

	public BigDecimal getAverageCostPerDay() {
		return averageCostPerDay;
	}

	@Override
	public BigDecimal getAveragePrice() {
		return averagePrice;
	}

	@Override
	public BigDecimal getCapitalGain() {
		return capitalGain;
	}

	@Override
	public BigDecimal getCapitalGainPercent() {
		return capitalGainPercent;
	}

	@Override
	public BigDecimal getCommission() {
		return commission;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public CurrencyEnum getCurrency() {
		return currency;
	}

	@Override
	public BigDecimal getCurrentCost() {
		return cost;
	}

	@Override
	public BigDecimal getDividend() {
		return dividend;
	}

	@Override
	public BigDecimal getDividendYield() {
		return dividendYield;
	}

	public BigDecimal getDuration() {
		return duration;
	}

	public BigDecimal getDurationCost() {
		return durationCost;
	}

	public BigDecimal getLonguestHolding() {
		return longuestHolding;
	}

	@Override
	public BigDecimal getMarketGrowth() {
		return marketGrowth;
	}

	@Override
	public BigDecimal getMarketValue() {
		return marketValue;
	}

	@Override
	public BigDecimal getOverallReturn() {
		return overallReturn;
	}

	@Override
	public BigDecimal getQuantity() {
		return quantity;
	}

	public BigDecimal getQuantityBuy() {
		return quantityBuy;
	}

	public BigDecimal getQuantitySold() {
		return quantitySold;
	}

	@Override
	public Symbol getSymbol() {
		return symbol;
	}

	public BigDecimal getTotalPriceHolding() {
		return totalPriceHolding;
	}

	public BigDecimal getTotalSold() {
		return totalSold;
	}

	public void setAverageCostPerDay(BigDecimal averageCostPerDay) {
		this.averageCostPerDay = averageCostPerDay;
	}

	@Override
	public void setAveragePrice(BigDecimal averagePrice) {
		this.averagePrice = averagePrice;
	}

	@Override
	public void setCapitalGain(BigDecimal capitalGain) {
		this.capitalGain = capitalGain;
	}

	@Override
	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	@Override
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public void setCurrency(CurrencyEnum currency) {
		// TODO Move this to CurrencyAnalysis.
		if (symbol != null) {
			throw new IllegalStateException();
		}
		this.currency = currency;
	}

	@Override
	public void setDividend(BigDecimal dividend) {
		this.dividend = dividend;
	}

	@Override
	public void setDividendYield(BigDecimal dividendYield) {
		this.dividendYield = dividendYield;
	}

	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	public void setDurationCost(BigDecimal durationCost) {
		this.durationCost = durationCost;
	}

	public void setLonguestHolding(BigDecimal longuestHolding) {
		this.longuestHolding = longuestHolding;
	}

	@Override
	public void setMarketGrowth(BigDecimal marketGrowth) {
		this.marketGrowth = marketGrowth;
	}

	@Override
	public void setMarketValue(BigDecimal marketValue) {
		this.marketValue = marketValue;
	}

	@Override
	public void setOverallReturn(BigDecimal overallReturn) {
		this.overallReturn = overallReturn;
	}

	@Override
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public void setQuantityBuy(BigDecimal quantityBuy) {
		this.quantityBuy = quantityBuy;
	}

	public void setQuantitySold(BigDecimal quantitySold) {
		this.quantitySold = quantitySold;
	}

	public void setSymbol(Symbol symbol) {
		if (currency != null) {
			throw new IllegalStateException();
		}
		this.symbol = symbol;
	}

	public void setTotalPriceHolding(BigDecimal totalPriceHolding) {
		this.totalPriceHolding = totalPriceHolding;
	}

	public void setTotalSold(BigDecimal totalSold) {
		this.totalSold = totalSold;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(", AvrCost/D:" + BigDecimalUtils.setDecimalWithScale(averageCostPerDay));
		sb.append(", AvrPrc:" + BigDecimalUtils.setDecimalWithScale(averagePrice));
		sb.append(", CapGain:" + BigDecimalUtils.setDecimalWithScale(capitalGain));
		sb.append(", CapGainPrc:" + BigDecimalUtils.setDecimalWithScale(capitalGainPercent));
		sb.append(", Comm:" + BigDecimalUtils.setDecimalWithScale(commission));
		sb.append(", Cost:" + BigDecimalUtils.setDecimalWithScale(cost));
		sb.append(", Cur:" + currency);
		sb.append(", Div:" + BigDecimalUtils.setDecimalWithScale(dividend));
		sb.append(", DivYld:" + BigDecimalUtils.setDecimalWithScale(dividendYield));
		sb.append(", Dur:" + BigDecimalUtils.setDecimalWithScale(duration));
		sb.append(", DurCst:" + BigDecimalUtils.setDecimalWithScale(durationCost));
		sb.append(", LongstHold:" + BigDecimalUtils.setDecimalWithScale(longuestHolding));
		sb.append(", MrktGrwt:" + BigDecimalUtils.setDecimalWithScale(marketGrowth));
		sb.append(", MrktValue:" + BigDecimalUtils.setDecimalWithScale(marketValue));
		sb.append(", OvralRtrn:" + BigDecimalUtils.setDecimalWithScale(overallReturn));
		sb.append(", Qty:" + BigDecimalUtils.setDecimalWithScale(quantity));
		sb.append(", QtyBuy:" + BigDecimalUtils.setDecimalWithScale(quantityBuy));
		sb.append(", QtySold:" + BigDecimalUtils.setDecimalWithScale(quantitySold));
		sb.append(", StrtPrd:" + startOfPeriod.getYear() + "-" + startOfPeriod.getMonthOfYear() + "-" + startOfPeriod.getDayOfMonth());
		sb.append(", EndPrd:" + endOfPeriod.getYear() + "-" + endOfPeriod.getMonthOfYear() + "-" + endOfPeriod.getDayOfMonth());
		return sb.substring(2);
	}
}
