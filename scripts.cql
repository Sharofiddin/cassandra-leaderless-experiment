create table user_posts ( user_id UUID, update_at timestamp , content text , primary KEY ((user_id), update_at ));
insert into user_posts (user_id , update_at , content ) values (138f9a79-33c2-4a05-8ed5-ce899dc70582, totimestamp(now()), 'ok-duki-s4-4');
insert into user_posts (user_id , update_at , content ) values (a2d0cf3b-831f-4170-8676-6217febdb089, totimestamp(now()), 'ok-duki');

