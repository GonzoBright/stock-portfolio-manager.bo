package com.proserus.stocks.bo.analysis;

import java.math.BigDecimal;
import java.util.Calendar;

import org.apache.commons.lang3.Validate;

import com.proserus.stocks.bo.symbols.CurrencyEnum;
import com.proserus.stocks.bo.symbols.SectorEnum;
import com.proserus.stocks.bo.symbols.Symbol;
import com.proserus.stocks.bo.transactions.Label;
import com.proserus.stocks.bo.utils.BigDecimalUtils;
import com.proserus.stocks.bo.utils.LoggerUtils;

public class AnalysisImpl implements Analysis {
	public SectorEnum getSector() {
		return sector;
	}

	private BigDecimal averagePrice;
	private BigDecimal capitalGain;
	private BigDecimal capitalGainPercent;
	private BigDecimal commission;
	private BigDecimal totalCost;
	private BigDecimal costBasis;
	private CurrencyEnum currency = null;
	private BigDecimal dividend;
	private BigDecimal dividendYield;
	private BigDecimal duration;
	private BigDecimal durationCost;
	private BigDecimal longuestHolding;
	private BigDecimal marketGrowth;
	private BigDecimal marketValue;
	private BigDecimal overallReturn;

	private Label label;
	private int year;

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	private SectorEnum sector;
	private BigDecimal quantity;
	private BigDecimal quantityBuy;
	private BigDecimal quantitySold;
	private Calendar startOfPeriod;
	private Calendar endOfPeriod;

	public Calendar getStartOfPeriod() {
		return startOfPeriod;
	}

	public void setStartOfPeriod(Calendar startOfPeriod) {
		this.startOfPeriod = startOfPeriod;
	}

	public Calendar getEndOfPeriod() {
		return endOfPeriod;
	}

	public void setEndOfPeriod(Calendar endOfPeriod) {
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
	private BigDecimal totalSold;

	@Override
	public BigDecimal getAveragePrice() {
		return averagePrice;
	}

	@Override
	public BigDecimal getCapitalGain() {
		return capitalGain;
	}

	@Override
	@Deprecated
	public BigDecimal getCapitalGainPercent() {
		return capitalGainPercent;
	}

	@Override
	public BigDecimal getCommission() {
		return commission;
	}

	public CurrencyEnum getCurrency() {
		return currency;
	}

	@Override
	public BigDecimal getTotalCost() {
		return totalCost;
	}

	public BigDecimal getCostBasis() {
		return costBasis;
	}

	@Override
	public BigDecimal getDividend() {
		return dividend;
	}

	@Override
	public BigDecimal getDividendYield() {
		return dividendYield;
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

	public BigDecimal getTotalSold() {
		return totalSold;
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
	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public void setCostBasis(BigDecimal costBasis) {
		this.costBasis = costBasis;
	}

	public void setCurrency(CurrencyEnum currency) {
		// TODO Move this to CurrencyAnalysis.
		Validate.isTrue(symbol == null);
		Validate.isTrue(sector == null);
		// TODO bad validate.. need refactoring
		this.currency = currency;
	}

	@Override
	public void setSector(SectorEnum sector) {
		// TODO bad validate.. need refactoring
		Validate.isTrue(symbol == null);
		Validate.isTrue(currency == null);
		this.sector = sector;
	}

	@Override
	public void setDividend(BigDecimal dividend) {
		this.dividend = dividend;
	}

	@Override
	public void setDividendYield(BigDecimal dividendYield) {
		this.dividendYield = dividendYield;
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
		// TODO bad validate.. need refactoring
		Validate.isTrue(currency == null);
		Validate.isTrue(sector == null);
		this.symbol = symbol;
	}

	public void setTotalSold(BigDecimal totalSold) {
		this.totalSold = totalSold;
	}

	@Override
	public String toString() {
		assert LoggerUtils.validateCalledFromLogger() : LoggerUtils.callerException();
		return "AnalysisImpl [averagePrice=" + averagePrice + ", capitalGain=" + capitalGain + ", capitalGainPercent=" + capitalGainPercent
				+ ", commission=" + commission + ", totalCost=" + totalCost + ", costBasis=" + costBasis + ", currency=" + currency
				+ ", dividend=" + dividend + ", dividendYield=" + dividendYield + ", duration=" + duration + ", durationCost="
				+ durationCost + ", longuestHolding=" + longuestHolding + ", marketGrowth=" + marketGrowth + ", marketValue=" + marketValue
				+ ", overallReturn=" + overallReturn + ", label=" + label + ", year=" + year + ", sector=" + sector + ", quantity="
				+ quantity + ", quantityBuy=" + quantityBuy + ", quantitySold=" + quantitySold + ", startOfPeriod=" + startOfPeriod
				+ ", endOfPeriod=" + endOfPeriod + ", numberOfYears=" + numberOfYears + ", annualizedReturn=" + annualizedReturn
				+ ", symbol=" + symbol + ", totalSold=" + totalSold + "]";
	}

	public String getSnapshot() {
		StringBuilder sb = new StringBuilder();
		sb.append(", AvrPrc:" + BigDecimalUtils.setDecimalWithScale(averagePrice));
		sb.append(", CapGain:" + BigDecimalUtils.setDecimalWithScale(capitalGain));
		sb.append(", CapGainPrc:" + BigDecimalUtils.setDecimalWithScale(capitalGainPercent));
		sb.append(", Comm:" + BigDecimalUtils.setDecimalWithScale(commission));
		sb.append(", Cost:" + BigDecimalUtils.setDecimalWithScale(totalCost));
		sb.append(", Cur:" + (currency != null ? currency : null));
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
		sb.append(", StrtPrd:" + startOfPeriod.get(Calendar.YEAR) + "-" + startOfPeriod.get(Calendar.MONTH) + "-"
				+ startOfPeriod.get(Calendar.DAY_OF_MONTH));
		sb.append(", EndPrd:" + endOfPeriod.get(Calendar.YEAR) + "-" + endOfPeriod.get(Calendar.MONTH) + "-"
				+ endOfPeriod.get(Calendar.DAY_OF_MONTH));
		return sb.substring(2);
	}

	@Override
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int getYear() {
		return year;
	}
}
