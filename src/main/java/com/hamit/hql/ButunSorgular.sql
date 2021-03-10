
SELECT * FROM hibernatedb.bilgisayarhql;

-- aggregate function
select sum(bilgisayarFiyati) from bilgisayarhql;

select min(bilgisayarFiyati) from bilgisayarhql;

select max(bilgisayarFiyati) from bilgisayarhql;

select avg(bilgisayarFiyati) from bilgisayarhql;

select count(bilgisayarFiyati) from bilgisayarhql;

select count(*) from bilgisayarhql;

-- veri tekranını önlemek
select  distinct( bilgisayarFiyati) from bilgisayarhql
select count( distinct( bilgisayarFiyati)) from bilgisayarhql

-- where
select * from   bilgisayarhql where bilgisayarFiyati=12000;

--between
select * from  bilgisayarhql where bilgisayarFiyati between 12000 and 60000;

--like
select *    from bilgisayarhql where bilgisayarAdi like 'a%';  -- a ile başayan liste
select *    from bilgisayarhql where bilgisayarAdi like '%a'; -- a ile biten liste
select bilgisayarAdi    from bilgisayarhql where bilgisayarAdi like '%GL%'; -- içinde GL geçen liste
select bilgisayarAdi    from bilgisayarhql where bilgisayarAdi like 'M%t'; -- M ile başlayacak t ile bitecek listeler
select bilgisayarAdi from bilgisayarhql where bilgisayarAdi like 'Ms_%'; -- Ms ile başlasın


--limit
select * from  bilgisayarhql where bilgisayarIslemci='i7' order by bilgisayarAdi desc limit 3;
select * from  bilgisayarhql  limit 3;

-- group by
SELECT * FROM hibernatedb.bilgisayarhql;
select bilgisayarIslemci,min(bilgisayarFiyati),max(bilgisayarFiyati),avg(bilgisayarFiyati),sum(bilgisayarFiyati),count(bilgisayarFiyati)  
from bilgisayarhql group by bilgisayarIslemci















