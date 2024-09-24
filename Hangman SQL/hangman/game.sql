create table hangman.game
(
    GameID            int auto_increment
        primary key,
    PlayerID          int          not null,
    GameMode          varchar(50)  null,
    Word              varchar(100) null,
    RemainingAttempts int          null,
    Status            varchar(20)  null
);

