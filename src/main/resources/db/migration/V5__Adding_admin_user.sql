insert into users (username, password, enabled)
    VALUES ('db_user',
            '{bcrypt}$2a$10$0y8PiqBVGuLS3y85iiJPs.TtQDJaE2cueuf8r1ilJs9dORM.0DT.e',
            true);

insert into users (username, password, enabled)
    VALUES ('db_admin',
            '{bcrypt}$2a$10$0y8PiqBVGuLS3y85iiJPs.TtQDJaE2cueuf8r1ilJs9dORM.0DT.e',
            true);

insert into authorities (username, authority)
    VALUES ('db_user', 'ROLE_USER');

insert into authorities (username, authority)
    VALUES ('db_admin', 'ROLE_USER');

insert into authorities (username, authority)
    VALUES ('db_admin', 'ROLE_ADMIN');
