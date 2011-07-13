package com.proserus.stocks.model.transactions;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.proserus.stocks.model.common.PersistentModel;

@Entity
@NamedQueries( { @NamedQuery(name = "label.findAll", query = "SELECT s FROM Label s"),
        @NamedQuery(name = "label.findByName", query = "SELECT s FROM Label s WHERE label = :label"),
        @NamedQuery(name = "label.findSubLabels", query = "SELECT s FROM Label s WHERE label in (:labels)") })
public class Label extends PersistentModel implements Comparable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public Label() {
		// for JPA
	}

	//TODO next time we update the table, change "label" column name for "name"
	@Column(unique = true, nullable = false, name="label")
	//TODO add constraint to forbid empty string (or just blank space): LTRIM(LABEL) != ''
	//@Check(constraints = "LTRIM(LABEL) != ''")
	private String name;

	@ManyToMany(
	        cascade = {CascadeType.PERSIST,CascadeType.MERGE},
	        mappedBy = "labels",
	        targetEntity = Transaction.class
	    )
	private Collection<Transaction> transactions = new ArrayList<Transaction>();

	public void setTransactions(Collection<Transaction> transactions) {
		this.transactions = transactions;
	}

	//TODO Maybe the same transaction is set...
	public void addTransaction(Transaction t) {
		if (!transactions.contains(t)) {
			transactions.add(t);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void removeTransaction(Transaction t) {
		transactions.remove(t);
	}

	public Collection<Transaction> getTransactions() {
		return transactions;
	}

	public void setName(String name) {
		if (name == null) {
			throw new NullPointerException();
		}
		
		if (name.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.name = name.trim();
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return getName();
	}

	@Override
	public int compareTo(Object arg0) {
		if (arg0 instanceof Label) {
			return ((Label) arg0).toString().compareTo(toString());
		}
		return -1;
	}

	public boolean equals(Object obj) {
		return toString().equals(((Label) obj).toString());
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
