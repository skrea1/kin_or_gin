create 
table record101(
cd_name varchar2(50),
cd_order varchar2(50),
cd_price number(7),
cd_date varchar2(10),
cd_soo number(5) constraint cd_soo_ck check(cd_soo>=0));

---

create table client101 (
    cli_name varchar2(30) not null,
   cli_id    varchar2(30) primary key,
   cli_pw   varchar2(30) not null,
   cli_phone varchar2(30) not null
);

insert into client101
values('������', 'admin', '12345', '01012345432');

create table admin101 (
    ad_name varchar2(30) not null,
   ad_id    varchar2(30) primary key,
   ad_pw   varchar2(30) not null,
   ad_phone varchar2(30) not null
);


commit;

---



insert into record101
values('PSYCHO','RED VELVET', 34000, '19/12/23', 20);

insert into record101
values('Russian Roulette','RED VELVET', 29900, '19/09/07', 17);

insert into record101
values('Snapping','û��', 29900, '19/06/24', 33);

insert into record101
values('Dynamite','BTS', 30000, '20/11/20', 50);

insert into record101
values('What is Love?','TWICE', 31000, '18/07/09', 21);
-------------------------
insert into record101
values('Kill thie love','BLACKPINK', 25000, '19/04/04', 40);

insert into record101
values('HIP','MAMAMOO', 24400, '19/11/24', 30);

insert into record101
values('Palette','IU', 31500, '17/04/21', 20);

insert into record101
values('Shape of you','Ed Sheeran', 20000, '17/03/03', 30);

insert into record101
values('���','�¿�', 31000, '19/03/24', 29);
---------------------
insert into record101
values('blueming','IU', 27600, '19/11/18', 15);

insert into record101
values('2002','Anne Marie', 20200, '18/04/27', 22);

insert into record101
values('ditto','NewJeans', 24900, '22/08/01', 80);

insert into record101
values('Feel my rhythm','RED VELVET', 41000, '22/03/21', 35);

insert into record101
values('After Like','IVE', 28500, '22/08/22', 45);
-----------------------------
insert into record101
values('Energitic','Wanna One', 32000, '17/11/13', 24);

insert into record101
values('�����ϴ� ���ε��� ����','�ܳ���', 21500, '19/03/13', 30);

insert into record101
values('2��','�����', 26600, '19/07/04', 2);

insert into record101
values('���ּҼ�','��������', 29000, '17/10/23', 34);

insert into record101
values('����Ʈ����','����', 32500, '22/03/30', 43);

insert into record101
values('bad girl good girl','miss a','6000','10/07/01',9);
insert into record101
values('�ܼҸ�','������','10000','10/06/03',58);
insert into record101
values('����','����','5000','10/01/18',20);
insert into record101
values('oh!','�ҳ�ô�','9000','10/01/28',60);
insert into record101
values('2 different tears','�����ɽ�','5000','10/05/16',3);
insert into record101
values('�� ������ ����','Ƽ�ƶ�','8000','10/01/23',21);
insert into record101
values('go away','2ne1','20000','10/09/09',1);
insert into record101
values('����','ī��','21000','10/02/17',43);
insert into record101
values('�ð��� �����','�ٺ�ġ','1700','10/05/06',20);
insert into record101
values('�׶� �׶� �׶�','��������','4000','10/10/01',100);
insert into record101
values('������','��������','4000','10/06/03',31);
insert into record101
values('����','2ne1','40000','10/09/09',12);
insert into record101
values('shock','��Ʈ','20000','10/03/01',13);
insert into record101
values('i need a girl','�¾�','8000','10/07/01',56);
insert into record101
values('���� �ٰ� �� ���','����','5000','11/01/18',38);
insert into record101
values('���������','ftisland','10000','10/08/25',900);
insert into record101
values('��ȥ���� �����߾�','�ּ�','8000','10/08/26',80);
insert into record101
values('�� ������','�����ͽ���','70000','09/11/25',1);
insert into record101
values('���� ��������','����','30000','09/12/11',0);
insert into record101
values('����� ���� ������','�̽±�','900','10/01/19',3);
insert into record101
values('���̵ɲ�','�����','800','10/11/01',28);



insert into record101 values ('����' , '���', '15000', '15/06/01', 6);

insert into record101 values ('BAE BAE' , '���', '15000', '16/01/14', 23);

insert into record101 values ('LOSER' , '���', '16500', '16/01/14', 1);

insert into record101 values ('CALL ME BABY' , 'EXO', '17000', '15/03/30', 4);

insert into record101 values ('�ڴ�' , '�����̸Ӹ�', '15000', '12/03/07', 77);

insert into record101 values ('SHAKE IT' , '����Ÿ', '17500', '15/06/22', 2);

insert into record101 values ('�͸�����' , '����', '19000', '15/05/28', 3);

insert into record101 values ('������' , '������', '18980', '15/10/23', 5);

insert into record101 values ('��, ��, ��' , '�¾�', '13000', '14/06/03', 33);

insert into record101 values ('�߻�ȭ' , '��ȿ��', '12500', '14/03/28', 27);

insert into record101 values ('�̸��� ������?' , '���̴�', '21000', '13/04/26', 2);

insert into record101 values ('������' , '����', '33000', '14/07/28', 4);

insert into record101 values ('�Ұݵ�' , '������(IU)', '18600', '14/10/02', 7);

insert into record101 values ('1440' , '�㰢', '15000', '13/02/05', 11);

insert into record101 values ('Rose' , '������', '8900', '13/03/28', 9);

insert into record101 values ('My Love' , '�̽�ö', '32700', '13/06/18', 12);

insert into record101 values ('���ϸ�����' , '������', '31000', '13/01/05', 1);

insert into record101 values ('�ź���' , '�ٺ�ġ', '27000', '13/03/04', 2);

insert into record101 values ('�ǵ�����' , '�̽±�', '15500', '12/11/22', 2);

insert into record101 values ('�ȴ�' , '������', '12500', '13/01/03', 4);

INSERT INTO record101
VALUES('�հ�����', '��ȿ��', 21000, '01/01/18', 30);
INSERT INTO record101
VALUES('����', '������', 21000, '01/02/01', 30);
INSERT INTO record101
VALUES('���', '�̽�ö', 21000, '01/07/11', 30);
INSERT INTO record101
VALUES('�ĵ�', '����', 21000, '01/07/11', 30);
INSERT INTO record101
VALUES('������ ����', '������', 21000, '01/11/20', 30);
INSERT INTO record101
VALUES('����ص� �ɱ��?', '��������', 21000, '01/12/01', 30);
INSERT INTO record101
VALUES('���', '�ڿ���', 22000, '02/03/15', 35);
INSERT INTO record101
VALUES('������ ���', '������', 22000, '02/03/29', 35);
INSERT INTO record101
VALUES('���������', 'ü������', 22000, '02/08/13', 30);
INSERT INTO record101
VALUES('���� ���', '��ȿ��', 22000, '02/09/13', 35);
INSERT INTO record101
VALUES('���޷���', '����', 23000, '03/02/27', 40);
INSERT INTO record101
VALUES('���� �� ��', '��â��', 23000, '03/06/05', 40);
INSERT INTO record101
VALUES('Stay', '��', 23000, '03/06/12', 40);
INSERT INTO record101
VALUES('�ٽ� ���� ��', '�ּ�', 23000, '03/08/21', 40);
INSERT INTO record101
VALUES('���� ����', 'ü������', 23000, '03/09/24', 40);
INSERT INTO record101
VALUES('����', '�迬��', 24000, '04/01/06', 45);
INSERT INTO record101
VALUES('�����', '�Ź�', 24000, '04/09/09', 45);
INSERT INTO record101
VALUES('�ͷ�', '����', 25000, '05/01/08', 50);
INSERT INTO record101
VALUES('���� ��', '��ȿ��', 25000, '05/06/02', 50);
INSERT INTO record101
VALUES('���������', '������', 25000, '05/07/01', 50 );
insert into record101
values ('ũ�ν�', '����ȭ', '12000', '99/12/28', 3);
insert into record101
values ('��Ʈ����̾�', '������', '12500', '00/09/09', 5);
insert into record101
values ('���ν�', '������', '11300', '00/08/11', 6);
insert into record101
values ('�θ޶�', '��Ǹ�', '12100', '99/11/20', 4);
insert into record101
values ('�����', '�̼���', '10700', '00/01/14', 9);
insert into record101
values ('���� �ʴ�', '������', '13000', '00/04/29', 13);
insert into record101
values ('�ٲ�', '������', '11100', '99/10/09', 2);
insert into record101
values ('����', '���ȣ', '13700', '00/07/07', 7);
insert into record101
values ('����ó��', '����', '14200', '00/04/21', 18);
insert into record101
values ('���', '�ڻ��', '10600', '00/06/23', 1);
insert into record101
values ('Love', '������', '11100', '00/01/01', 1);
insert into record101
values ('���', '������', '12800', '99/12/27', 8);
insert into record101
values ('�ߵ��� ���', '������', '11600', '00/06/16', 19);
insert into record101
values ('�ٺ�', '��ȿ��', '12900', '99/12/01', 10);
insert into record101
values ('����', '������', '10200', '99/11/16', 15);
insert into record101
values ('����', '������', '13300', '99/12/10', 12);
insert into record101
values ('��', '������', '11900', '00/05/22', 17);
insert into record101
values ('���� ����', '��â��', '10300', '00/02/11', 14);
insert into record101
values ('��鸰 ����', 'ȫ���', '12400', '00/06/18', 20);
insert into record101
values ('�ƽó���', '������', '13200', '00/09/01', 11);
commit;



