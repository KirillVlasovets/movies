create table if not exists movies
(
    id serial primary key,
    name varchar(255) not null,
    director varchar(255) not null
);

-- insert into movies (name, director) values (
--                     'Pulp fiction',
--                     'Tarantino'
-- );
--
-- select * from movies;

-- drop table movies;