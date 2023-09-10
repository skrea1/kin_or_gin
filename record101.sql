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
values('관리자', 'admin', '12345', '01012345432');

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
values('Snapping','청하', 29900, '19/06/24', 33);

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
values('사계','태연', 31000, '19/03/24', 29);
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
values('주저하는 연인들을 위해','잔나비', 21500, '19/03/13', 30);

insert into record101
values('2월','쏜애플', 26600, '19/07/04', 2);

insert into record101
values('연애소설','에픽하이', 29000, '17/10/23', 34);

insert into record101
values('오르트구름','윤하', 32500, '22/03/30', 43);

insert into record101
values('bad girl good girl','miss a','6000','10/07/01',9);
insert into record101
values('잔소리','아이유','10000','10/06/03',58);
insert into record101
values('못해','포맨','5000','10/01/18',20);
insert into record101
values('oh!','소녀시대','9000','10/01/28',60);
insert into record101
values('2 different tears','원더걸스','5000','10/05/16',3);
insert into record101
values('너 때문에 미쳐','티아라','8000','10/01/23',21);
insert into record101
values('go away','2ne1','20000','10/09/09',1);
insert into record101
values('루팡','카라','21000','10/02/17',43);
insert into record101
values('시간아 멈춰라','다비치','1700','10/05/06',20);
insert into record101
values('그땐 그땐 그땐','슈프림팀','4000','10/10/01',100);
insert into record101
values('땡땡땡','슈프림팀','4000','10/06/03',31);
insert into record101
values('아파','2ne1','40000','10/09/09',12);
insert into record101
values('shock','비스트','20000','10/03/01',13);
insert into record101
values('i need a girl','태양','8000','10/07/01',56);
insert into record101
values('꺼져 줄게 잘 살아','지나','5000','11/01/18',38);
insert into record101
values('사랑사랑사랑','ftisland','10000','10/08/25',900);
insert into record101
values('결혼까지 생각했어','휘성','8000','10/08/26',80);
insert into record101
values('너 때문에','애프터스쿨','70000','09/11/25',1);
insert into record101
values('오늘 헤어졌어요','윤하','30000','09/12/11',0);
insert into record101
values('사랑이 술을 가르쳐','이승기','900','10/01/19',3);
insert into record101
values('별이될께','디셈버','800','10/11/01',28);



insert into record101 values ('뱅뱅뱅' , '빅뱅', '15000', '15/06/01', 6);

insert into record101 values ('BAE BAE' , '빅뱅', '15000', '16/01/14', 23);

insert into record101 values ('LOSER' , '빅뱅', '16500', '16/01/14', 1);

insert into record101 values ('CALL ME BABY' , 'EXO', '17000', '15/03/30', 4);

insert into record101 values ('자니' , '프라이머리', '15000', '12/03/07', 77);

insert into record101 values ('SHAKE IT' , '씨스타', '17500', '15/06/22', 2);

insert into record101 values ('와리가리' , '혁오', '19000', '15/05/28', 3);

insert into record101 values ('스물셋' , '아이유', '18980', '15/10/23', 5);

insert into record101 values ('눈, 코, 입' , '태양', '13000', '14/06/03', 33);

insert into record101 values ('야생화' , '박효신', '12500', '14/03/28', 27);

insert into record101 values ('이름이 뭐예요?' , '포미닛', '21000', '13/04/26', 2);

insert into record101 values ('빨개요' , '현아', '33000', '14/07/28', 4);

insert into record101 values ('소격동' , '아이유(IU)', '18600', '14/10/02', 7);

insert into record101 values ('1440' , '허각', '15000', '13/02/05', 11);

insert into record101 values ('Rose' , '이하이', '8900', '13/03/28', 9);

insert into record101 values ('My Love' , '이승철', '32700', '13/06/18', 12);

insert into record101 values ('강북멋쟁이' , '정형돈', '31000', '13/01/05', 1);

insert into record101 values ('거북이' , '다비치', '27000', '13/03/04', 2);

insert into record101 values ('되돌리다' , '이승기', '15500', '12/11/22', 2);

insert into record101 values ('싫다' , '백지영', '12500', '13/01/03', 4);

INSERT INTO record101
VALUES('먼곳에서', '박효신', 21000, '01/01/18', 30);
INSERT INTO record101
VALUES('인형', '이지훈', 21000, '01/02/01', 30);
INSERT INTO record101
VALUES('고백', '이승철', 21000, '01/07/11', 30);
INSERT INTO record101
VALUES('파도', '유엔', 21000, '01/07/11', 30);
INSERT INTO record101
VALUES('봄날은 간다', '김윤아', 21000, '01/11/20', 30);
INSERT INTO record101
VALUES('사랑해도 될까요?', '유리상자', 21000, '01/12/01', 30);
INSERT INTO record101
VALUES('비몽', '코요태', 22000, '02/03/15', 35);
INSERT INTO record101
VALUES('마지막 약속', '포지션', 22000, '02/03/29', 35);
INSERT INTO record101
VALUES('낭만고양이', '체리필터', 22000, '02/08/13', 30);
INSERT INTO record101
VALUES('좋은 사람', '박효신', 22000, '02/09/13', 35);
INSERT INTO record101
VALUES('진달래꽃', '마야', 23000, '03/02/27', 40);
INSERT INTO record101
VALUES('소주 한 잔', '임창정', 23000, '03/06/05', 40);
INSERT INTO record101
VALUES('Stay', '넬', 23000, '03/06/12', 40);
INSERT INTO record101
VALUES('다시 만난 날', '휘성', 23000, '03/08/21', 40);
INSERT INTO record101
VALUES('오리 날다', '체리필터', 23000, '03/09/24', 40);
INSERT INTO record101
VALUES('연인', '김연우', 24000, '04/01/06', 45);
INSERT INTO record101
VALUES('기억상실', '거미', 24000, '04/09/09', 45);
INSERT INTO record101
VALUES('귀로', '나얼', 25000, '05/01/08', 50);
INSERT INTO record101
VALUES('눈의 꽃', '박효신', 25000, '05/06/02', 50);
INSERT INTO record101
VALUES('사랑스러워', '김종국', 25000, '05/07/01', 50 );
insert into record101
values ('크로스', '엄정화', '12000', '99/12/28', 3);
insert into record101
values ('울트라맨이야', '서태지', '12500', '00/09/09', 5);
insert into record101
values ('성인식', '박지윤', '11300', '00/08/11', 6);
insert into record101
values ('부메랑', '김건모', '12100', '99/11/20', 4);
insert into record101
values ('서방님', '이소은', '10700', '00/01/14', 9);
insert into record101
values ('요즘 너는', '이현우', '13000', '00/04/29', 13);
insert into record101
values ('바꿔', '이정현', '11100', '99/10/09', 2);
insert into record101
values ('와인', '김경호', '13700', '00/07/07', 7);
insert into record101
values ('어제처럼', '제이', '14200', '00/04/21', 18);
insert into record101
values ('상실', '박상민', '10600', '00/06/23', 1);
insert into record101
values ('Love', '윤현석', '11100', '00/01/01', 1);
insert into record101
values ('고백', '박혜경', '12800', '99/12/27', 8);
insert into record101
values ('중독된 사랑', '조장혁', '11600', '00/06/16', 19);
insert into record101
values ('바보', '박효신', '12900', '99/12/01', 10);
insert into record101
values ('영원', '최진영', '10200', '99/11/16', 15);
insert into record101
values ('연가', '유승준', '13300', '99/12/10', 12);
insert into record101
values ('멍', '김현정', '11900', '00/05/22', 17);
insert into record101
values ('나의 연인', '임창정', '10300', '00/02/11', 14);
insert into record101
values ('흔들린 우정', '홍경민', '12400', '00/06/18', 20);
insert into record101
values ('아시나요', '조성모', '13200', '00/09/01', 11);
commit;



