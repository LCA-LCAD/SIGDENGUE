# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table cupom_desconto (
  id                        bigint not null,
  nome_do_cliente           varchar(255),
  valor                     double,
  constraint pk_cupom_desconto primary key (id))
;

create table suspeito (
  numero_busca              integer,
  numero_notificacao        integer,
  data_notificacao          timestamp,
  nome_suspeito             varchar(255),
  nome_mae                  varchar(255),
  telefone1                 varchar(255),
  telefone2                 varchar(255),
  data_nascimento           timestamp,
  teve_dengue               boolean,
  outro_munipio             boolean,
  nome_outro_municipio      varchar(255),
  viajante                  boolean,
  viagem_recente            boolean,
  realizou_exame            boolean)
;

create sequence cupom_desconto_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists cupom_desconto;

drop table if exists suspeito;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists cupom_desconto_seq;

