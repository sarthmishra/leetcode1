SELECT c.name as Customers
FROM Customers c
left join Orders o on o.customerId  = c.id
where customerId is null;

