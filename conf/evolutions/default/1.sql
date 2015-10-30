# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table cupom_desconto (
  id                        bigint not null,
  nome_do_cliente           varchar(255),
  valor                     float,
  constraint pk_cupom_desconto primary key (id))
;

create table endereco (
  id                        bigint not null,
  suspeito_numero_busca     integer not null,
  tipo                      varchar(255),
  logradouro                varchar(255),
  numero                    integer,
  geo_inconsistente         boolean,
  numero_quarteirao         integer,
  tempo_permanencia         varchar(255),
  turnos                    varchar(255),
  dias_semana               varchar(255),
  constraint pk_endereco primary key (id))
;

create table rg (
  n_lote                    integer not null,
  localidade                varchar(255),
  n_quart                   integer,
  constraint pk_rg primary key (n_lote))
;

create table suspeito (
  numero_busca              integer not null,
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
  realizou_exame            boolean,
  constraint pk_suspeito primary key (numero_busca))
;

create sequence cupom_desconto_seq;

create sequence endereco_seq;

create sequence rg_seq;

create sequence suspeito_seq;

alter table endereco add constraint fk_endereco_suspeito_1 foreign key (suspeito_numero_busca) references suspeito (numero_busca);
create index ix_endereco_suspeito_1 on endereco (suspeito_numero_busca);



# --- !Downs

drop table if exists cupom_desconto cascade;

drop table if exists endereco cascade;

drop table if exists rg cascade;

drop table if exists suspeito cascade;

drop sequence if exists cupom_desconto_seq;

drop sequence if exists endereco_seq;

drop sequence if exists rg_seq;

drop sequence if exists suspeito_seq;

