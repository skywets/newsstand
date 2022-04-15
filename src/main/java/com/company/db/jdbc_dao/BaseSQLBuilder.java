package com.company.db.jdbc_dao;

import com.company.PrintedProduct;

public interface BaseSQLBuilder {
    String insert(PrintedProduct object);
    String delete(long id);
    String update(PrintedProduct object);
    String getByID(long id);
    public String getAll();
}


