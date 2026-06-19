select firstName,lastName,a.city,a.state
from Person p 
left join address a on p.personId = a.personId;
