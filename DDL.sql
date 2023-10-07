create database northwind;

create schema northwind;

CREATE TABLE northwind.categories
(      
    CategoryID SERIAL PRIMARY KEY,
    CategoryName VARCHAR(25),
    Description VARCHAR(255)
);

CREATE TABLE northwind.customers
(      
    CustomerID SERIAL PRIMARY KEY,
    CustomerName VARCHAR(50),
    ContactName VARCHAR(50),
    Address VARCHAR(50),
    City VARCHAR(20),
    PostalCode VARCHAR(10),
    Country VARCHAR(15)
);

CREATE TABLE northwind.employees
(
    EmployeeID SERIAL PRIMARY KEY,
    LastName VARCHAR(15),
    FirstName VARCHAR(15),
    BirthDate TIMESTAMP,
    Photo VARCHAR(25),
    Notes VARCHAR(1024)
);

CREATE TABLE northwind.shippers(
    ShipperID SERIAL PRIMARY KEY,
    ShipperName VARCHAR(25),
    Phone VARCHAR(15)
);

CREATE TABLE northwind.suppliers(
    SupplierID SERIAL PRIMARY KEY,
    SupplierName VARCHAR(50),
    ContactName VARCHAR(50),
    Address VARCHAR(50),
    City VARCHAR(20),
    PostalCode VARCHAR(10),
    Country VARCHAR(15),
    Phone VARCHAR(15)
);

CREATE TABLE northwind.products(
    ProductID SERIAL PRIMARY KEY,
    ProductName VARCHAR(50),
    SupplierID INTEGER,
    CategoryID INTEGER,
    Unit VARCHAR(25),
    Price NUMERIC,
	FOREIGN KEY (CategoryID) REFERENCES northwind.categories (CategoryID),
	FOREIGN KEY (SupplierID) REFERENCES northwind.suppliers (SupplierID)
);

CREATE TABLE northwind.orders(
    OrderID SERIAL PRIMARY KEY,
    CustomerID INTEGER,
    EmployeeID INTEGER,
    OrderDate TIMESTAMP,
    ShipperID INTEGER,
    FOREIGN KEY (EmployeeID) REFERENCES northwind.employees (EmployeeID),
    FOREIGN KEY (CustomerID) REFERENCES northwind.customers (CustomerID),
    FOREIGN KEY (ShipperID) REFERENCES northwind.shippers (ShipperID)
);

CREATE TABLE northwind.orderDetails(
    OrderDetailID SERIAL PRIMARY KEY,
    OrderID INTEGER,
    ProductID INTEGER,
    Quantity INTEGER,
	FOREIGN KEY (OrderID) REFERENCES northwind.orders (OrderID),
	FOREIGN KEY (ProductID) REFERENCES northwind.products (ProductID)
);

