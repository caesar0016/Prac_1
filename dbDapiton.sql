create table customers(
	customerID int primary key,
	firstName varchar(25) not null,
	lastName varchar(25) not null,
	Email varchar(50),
	Gender varchar(10),
	birthdate date not null


);

create table product(
	product int primary key,
	Description text not null,
	Quantity int not null,
	Price decimal(10, 2),
	VendorID int not null

);

create table vendors(
	VendorID int primary key,
	Name varchar(20) not null,
	ContactNum bigint not null,
	CityAddress varchar(65) not null


);

alter table product
add foreign key(vendorID) references Vendors(VendorID)

