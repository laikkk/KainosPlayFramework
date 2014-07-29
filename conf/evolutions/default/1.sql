# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table persons (
  id                        bigint not null,
  name                      varchar(100),
  surname                   varchar(100),
  birthdate                 timestamp,
  email                     varchar(200),
  favoritedatabase          integer,
  notes                     varchar(5000),
  constraint pk_persons primary key (id))
;

create sequence persons_seq;




# --- !Downs

drop table if exists persons cascade;

drop sequence if exists persons_seq;

