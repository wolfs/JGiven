package com.tngtech.jgiven.report.model;

import java.util.List;

import com.tngtech.jgiven.annotation.Table.HeaderType;

/**
 * Represents a data table argument.
 */
public class DataTable {

    /**
     * The type of the header
     */
    private HeaderType headerType;

    /**
     * The data of the table.
     */
    private List<List<String>> data;

    public DataTable( HeaderType headerType, List<List<String>> data ) {
        this.headerType = headerType;
        this.data = data;
    }

    public HeaderType getHeaderType() {
        return headerType;
    }

    public void setHeaderType( HeaderType headerType ) {
        this.headerType = headerType;
    }

    public List<List<String>> getData() {
        return data;
    }

    public void setData( List<List<String>> data ) {
        this.data = data;
    }

    @Override
    public boolean equals( Object o ) {
        if( this == o )
            return true;
        if( o == null || getClass() != o.getClass() )
            return false;

        DataTable dataTable = (DataTable) o;

        if( data != null ? !data.equals( dataTable.data ) : dataTable.data != null )
            return false;
        if( headerType != dataTable.headerType )
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = headerType != null ? headerType.hashCode() : 0;
        result = 31 * result + ( data != null ? data.hashCode() : 0 );
        return result;
    }
}
