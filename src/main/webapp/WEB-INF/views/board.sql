CREATE TABLE board(
b_num NUMBER(20) PRIMARY KEY,
title VARCHAR2(50) NOT NULL,
content CLOB,
regdate DATE NOT NULL
);

CREATE SEQUENCE b_num_seq;