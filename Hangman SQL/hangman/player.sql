create table hangman.player
(
    PlayerID int auto_increment
        primary key,
    Username varchar(50)  not null,
    Email    varchar(100) not null,
    Password varchar(100) not null
);

