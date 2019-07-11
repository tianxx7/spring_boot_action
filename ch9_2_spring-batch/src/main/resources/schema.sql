create table if not exists person
(
  id          NUMERIC not null primary key,
  name        varchar(20),
  age         NUMERIC,
  nation      varchar(20),
  address     varchar(20)
);