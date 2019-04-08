package mySqlManager;

import java.util.Date;

public class Query {
	
	private String userName;
	private String typeQuery;
	private String query;
	private Date date;
	private int numColumns;
	private String database;
	
	public Query(String userName, String typeQuery, String query, Date date, int numColumns, String database) {

		this.userName = userName;
		this.typeQuery = typeQuery;
		this.query = query;
		this.date = date;
		this.numColumns = numColumns;
		this.database = database;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTypeQuery() {
		return typeQuery;
	}

	public void setTypeQuery(String typeQuery) {
		this.typeQuery = typeQuery;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNumColumns() {
		return numColumns;
	}

	public void setNumColumns(int numColumns) {
		this.numColumns = numColumns;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}
	
}
