insert into movies (name) values ('Pulp Fiction');
insert into movies (name) values ('Kill Bill');
insert into movies (name) values ('Kill Bill 2');
insert into movies (name) values ('The Shawshank Redemption');
insert into movies (name) values ('The Matrix');
insert into movies (name) values ('The Matrix 2');
insert into movies (name) values ('Avatar');
insert into movies (name) values ('Avatar 2');
insert into movies (name) values ('Coco');

insert into characters (name, movie_id) values ('Mia Wallace', 1);
insert into characters (name, movie_id) values ('Vincent Vega', 1);
insert into characters (name, movie_id) values ('Winston Wolf', 1);
insert into characters (name, movie_id) values ('Jules Winnfield', 1);
insert into characters (name, movie_id) values ('Marsellus Wallace', 1);
insert into characters (name, movie_id) values ('Jimmie Dimmick', 1);

insert into characters (name, movie_id) values ('The Bride', 2);
insert into characters (name, movie_id) values ('Gogo Yubari', 2);
insert into characters (name, movie_id) values ('Elle Driver', 2);
insert into characters (name, movie_id) values ('Bill', 2);

insert into characters (name, movie_id) values ('The Bride', 3);
insert into characters (name, movie_id) values ('Pai Mei', 3);
insert into characters (name, movie_id) values ('Elle Driver', 3);
insert into characters (name, movie_id) values ('Esteban Vihaio', 3);
insert into characters (name, movie_id) values ('Budd', 3);

insert into characters (name, movie_id) values ('Andy Dufresne', 4);
insert into characters (name, movie_id) values ('Warden Norton', 4);
insert into characters (name, movie_id) values ('Brooks Hatlen', 4);


insert into positions (name) values ('Actor'); --id = 1 used in constraint in movies_positions_participants_characters
insert into positions (name) values ('Producer');
insert into positions (name) values ('Director');


insert into participants (name, dob) values ('Quentin Tarantino', '1963-03-27');
insert into movies_positions_participants_characters (movie_id, position_id, participant_id, character_id)
values (1, 3, 1, null), -- pulp fiction, director
       (1, 1, 1, 6), -- pulp fiction, actor
       (2, 3, 1, null), -- kill bill, director
       (3, 3, 1, null); -- kill bill 2, director

insert into participants (name, dob) values ('Uma Thurman', '1970-04-29');
insert into movies_positions_participants_characters (movie_id, position_id, participant_id, character_id)
values (1, 1, 2, 1), -- pulp fiction, actor
       (2, 1, 2, 7), -- kill bill, actor
       (3, 1, 2, 11); -- kill bill 2, actor

insert into participants (name, dob) values ('John Travolta', '1954-02-18');
insert into movies_positions_participants_characters (movie_id, position_id, participant_id, character_id)
values (1, 1, 3, 2); -- pulp fiction, actor

insert into participants (name, dob) values ('Samuel L. Jackson', '1948-12-21');
insert into participants (name, dob) values ('Ving Rhames', '1959-05-12');
insert into participants (name, dob) values ('Harvey Keitel', '1939-05-13');

insert into participants (name, dob) values ('Chiaki Kuriyama', '1984-08-10');
insert into participants (name, dob) values ('Lucy Liu', '1968-12-02');
insert into participants (name, dob) values ('Ai Maeda', '1983-10-04');
insert into participants (name, dob) values ('Daryl Hannah', '1960-12-03');
insert into participants (name, dob) values ('David Carradine', '1936-12-08');

insert into participants (name, dob) values ('Gordon Liu', '1951-08-22');
insert into participants (name, dob) values ('Michael Parks', '1940-04-24');
insert into participants (name, dob) values ('Michael Madsen', '1958-09-25');

insert into participants (name, dob) values ('Tim Robbins', '1958-10-16');
insert into participants (name, dob) values ('Bob Gunton', '1945-11-15');
insert into participants (name, dob) values ('James Whitmore', '1921-10-01');

insert into participants (name, dob) values ('Frank Darabont', '1959-01-28');
insert into participants (name, dob) values ('Niki Marvin', '1951-12-01');
insert into participants (name, dob) values ('Lawrence Bender', '1957-10-17');
