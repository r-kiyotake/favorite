SET CHARSET utf8mb4;
CREATE DATABASE IF NOT EXISTS todo_tb DEFAULT CHARACTER SET utf8mb4;

USE todo_tb;


drop table if exists 'favorites';
create table if not exists 'favorites'(
    'id' serial,
    'title' varchar(255),
    'detail' varchar(255),
    'delete_flag' numeric(1) default 0,
    'created_at' timestamp,
    'updated_at' timestamp
)