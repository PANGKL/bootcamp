select * from course;

with cs001 as(
	select * 
    from course
	where course_code = 'cs001'
),

cs002 as(
	select * 
	from course
	where course_code = 'cs002'
)

select * from cs001 c2;

-- 28 Aug
select * from ORDERS
union all
select * from orders
union all
select 100,1000,2 from dual
;  -- 數量一樣照可union

-- union
select * from orders
union
select * from orders
;

insert into orders values (5,550,2);
select * from orders;

select * 
from CUSTOMERS c, orders o
where  c.id = o.id
;




-- View (Share database, but filter which data can be read by other department staff
create view VCUSTOMER_ORDERS 
as
select C.name, c.vip, O.amount
from customers c, orders o
where c.id = o.id
;
drop view VCUSTOMER_ORDERS;

select * from VCUSTOMER_ORDERS;



delimiter //
create procedure insert_result
 begin
		declare res_avg_amt decimal(10,2);
        declare customer_cursor cursor for
			select  o.customer_id
            from customer c
            
 
 end;
 delimiter;
 
 -- create customer_order_report
 create table customer_order_report(
	customer_id int primary key,

 )



create procedure calc_avg_amount(in cid integer, out avg_amt decimal(10,2))

delimiter 
begin
	declare calc_cursor cursor for
	select o.customer_id, (sum(o.amount) / count(1)) as avg_sale_amount
	from customer c , orders, o
	where c.id = o.customer_id
	and c.id = CID
    group by o.customer_id
	;
    open customer_cursor;
    calc_cursor: loop -- loop though departments
    fetch calc_cursor into cust_id, total amount;
    end loop;
    
    close customer_cursor
    
end;
delimiter;

-- table trigger

alter table customers add order_count int;

delimiter 
create trigger Trigger_count_order
after insert on orders
for each row
begin
	update customers
    set order_count = order_count + 1
    where id = new.customer_id; -- order
    -- new.amount, new.id
end;
//
delimiter ; 

select * from orders;
insert into orders values (7,1000,2);















