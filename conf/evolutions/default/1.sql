# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table persons (
  id                        bigint not null,
  name                      varchar(255),
  surname                   varchar(255),
  birthdate                 varchar(255),
  email                     varchar(255),
  favoritedatabase          varchar(255),
  notes                     varchar(255),
  constraint pk_persons primary key (id))
;

create sequence persons_seq;




# --- !Downs

drop table if exists persons cascade;

drop sequence if exists persons_seq;

