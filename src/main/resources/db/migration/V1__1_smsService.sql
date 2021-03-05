create table messages
(
    id UUID DEFAULT uuid_generate_v4() NOT NULL,
    fromNumber varchar(50)  not null,
    toNumber varchar(50)  not null,
    primary key (id)
)