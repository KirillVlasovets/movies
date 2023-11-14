create table if not exists participants
(
    id serial primary key,
    name text not null,
    dob timestamp not null check (dob > '1920-01-01')
    );

create table if not exists movies
(
    id serial primary key,
    name text not null
);

create table if not exists positions
(
    id serial primary key,
    name text not null
);

create table if not exists characters
(
    id serial primary key,
    name text not null,
    movie_id integer references movies(id) not null
    );

create table if not exists movies_positions_participants_characters
(
    movie_id integer references movies(id) not null,
    position_id integer references positions(id) not null,
    participant_id integer references participants(id) not null,
    character_id integer references characters(id) null

    constraint actor_character check ( (position_id = 1) != (character_id is null) ),
    unique (movie_id, position_id, participant_id, character_id)
    );
