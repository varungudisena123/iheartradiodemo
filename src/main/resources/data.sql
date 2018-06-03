create table if not exists station(stationId int, name varchar(255), hdEnabled boolean, callSign varchar(255));
insert into station 
values(1001,'rockon',false,'rock music');