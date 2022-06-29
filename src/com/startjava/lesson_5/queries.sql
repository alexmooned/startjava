--выведите всю таблицу
select * from Jaegers;
--отобразите только не уничтоженных роботов
select * from Jaegers where status != 'Destroyed';
--отобразите роботов нескольких серий, например Mark-1 и Mark-6
select * from Jaegers where mark in ('Mark-1','Mark-5');
--отсортируйте таблицу по убыванию по столбцу mark
select * from Jaegers order by mark desc;
--отобразите самого старого робота
select * from Jaegers where id = (select t.id from
(select id, min(launch) from Jaegers group by id limit 1) t);
--отобразите роботов, которые уничтожили больше/меньше всех kaiju
select * from Jaegers where kaijuKill in 
(select min(kaijuKill) from Jaegers
    union 
 select max(Jaegers) from Jaegers);
 --отобразите средний вес роботов
 select avg(weight) from Jaegers;
 --увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
 update Jaegers set kaijuKill = kaijuKill + 1 where status != 'Destroyed';
 --удалите уничтоженных роботов
 delete from Jaegers where status = 'Destroyed';