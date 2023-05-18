insert into role values (uuid_to_bin(uuid()), 'UZMAN');
insert into role values (uuid_to_bin(uuid()), 'ANALIST');
insert into role values (uuid_to_bin(uuid()), 'MUDUR');

select * from role;
insert into user values ('leventguren@gmail.com', 'Levent GÜREN', null, null);
insert into user values ('gozdeakbalik@gmail.com', 'Gözde AKBALIK', null, null);
insert into user values ('serdaryasemin@gmail.com', 'Serdar YASEMİN', null, null);
insert into user values ('arifaydogdu@gmail.com', 'Arif AYDOĞDU', null, null);
select * from user;

insert into user_role values (uuid_to_bin(uuid()), 
   (select id from role where name = 'UZMAN'),
   'leventguren@gmail.com');
insert into user_role values (uuid_to_bin(uuid()), 
   (select id from role where name = 'MUDUR'),
   'leventguren@gmail.com'); 
   
insert into user_role values (uuid_to_bin(uuid()), 
   (select id from role where name = 'ANALIST'),
   'gozdeakbalik@gmail.com'); 
insert into user_role values (uuid_to_bin(uuid()), 
   (select id from role where name = 'UZMAN'),
   'gozdeakbalik@gmail.com'); 
   
insert into user_role values (uuid_to_bin(uuid()), 
   (select id from role where name = 'UZMAN'),
   'serdaryasemin@gmail.com'); 
   
insert into user_role values (uuid_to_bin(uuid()), 
   (select id from role where name = 'UZMAN'),
   'arifaydogdu@gmail.com'); 
select * from user_role;
   