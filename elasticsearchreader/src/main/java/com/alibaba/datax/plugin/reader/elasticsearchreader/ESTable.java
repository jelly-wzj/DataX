package com.alibaba.datax.plugin.reader.elasticsearchreader;

import java.util.ArrayList;
import java.util.List;

public class ESTable {
    private String name;
    private String nameCase;
    private String filter;
    private String deleteFilterKey;
    private List<ESField> column = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCase() {
        return nameCase;
    }

    public void setNameCase(String nameCase) {
        this.nameCase = nameCase;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getDeleteFilterKey() {
        return deleteFilterKey;
    }

    public void setDeleteFilterKey(String deleteFilterKey) {
        this.deleteFilterKey = deleteFilterKey;
    }

    public List<ESField> getColumn() {
        return column;
    }

    public void setColumn(List<ESField> column) {
        this.column = column;
    }
}