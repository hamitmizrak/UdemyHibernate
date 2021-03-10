
--aggregate
select aggregate from tabloAdi;

--where 
select aggregate from tabloAdi where sutunAdi;

--where between 
select aggregate from tabloAdi where sutunAdi between sayi1 and sayi2;

--like
select aggregate from tabloAdi where sutunAdi like '%asd%';

-- limit
select aggregate from tabloAdi limit 3;

-- gruop by
select sutunAdi, aggregate from tabloAdi group by sutunAdi;

