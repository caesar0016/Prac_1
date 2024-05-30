--  1. Create Table

CREATE table flavors(
    itemCode int primary key identity(90, 5),
    itemDesc varchar(45),
    price FLOAT
);

insert into flavors(itemDesc, price) values
    ('Matcha', 120),
    ('Vanilla', 80),
    ('Strawberry', 90),
    ('Rocky Road', 150),
    ('Chocolate', 110);

--  2. retrieve values under itemCode
Select itemCode from flavors;

--  3. Retrive values of all Column
Select * from flavors

--  4. Retrive rows with values higher then 65 under price
Select * from flavors where price > 65;

--  5. Change the price of the row
--  with itemCode 101 - 75
update flavors set Price = 75 where ItemCode = 101;

Select * from flavors
