create table USER
(
    ID          int  auto_increment not null ,
    ACCOUNT_ID  VARCHAR(100),
    NAME        VARCHAR(50),
    TOKEN       CHAR(36),
    GMTCREATE   BIGINT,
    GMTMODIFIED BIGINT,
    constraint USER_PK
        primary key (ID)
);

