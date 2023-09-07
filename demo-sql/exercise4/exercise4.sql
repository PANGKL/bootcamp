create database bootcamp_exercise4;
use bootcamp_exercise4;

create table players (
    player_id integer not null unique, 
    group_id integer not null
);

create table matches (
    match_id integer not null unique, 
    first_player integer not null, 
    second_player integer not null, 
    first_score integer not null, 
    second_score integer not null
);
insert into players values
(20,2),
(30,1),
(40,3),
(45,1),
(50,2),
(65,1)
;
insert into matches values
(1,30,45,10,12),
(2,20,50,5,5),
(13,65,45,10,10),
(5,30,65,3,15),
(42,45,65,8,4)
;

select * from players;
select * from matches;




with total as( 
select player, sum(score) as score
from (select first_player as player, sum(first_score) as score
from matches 
group by first_player
union
select second_player as player, sum(second_score) as score
from matches 
group by second_player) as total_score
group by player
)
, result as(
select ROW_NUMBER() OVER (partition by group_id order by score desc, player) as order_bygp, players.*,total.*
from players
left join total
on player_id = player )

-- select *
-- from result;
select group_id, player_id
from result
where order_bygp = 1
;















