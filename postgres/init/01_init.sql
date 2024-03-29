CREATE USER newuser WITH PASSWORD 'password';

CREATE TABLE favorites(
    id serial,
    title varchar(255),
    detail varchar(255),
    delete_flag numeric(1) default 0,
    created_at timestamp default CURRENT_TIMESTAMP,
    updated_at timestamp default CURRENT_TIMESTAMP
)