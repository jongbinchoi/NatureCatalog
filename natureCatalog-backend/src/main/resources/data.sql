INSERT INTO nature(title, content) VALUES('가가가가', '1111');
INSERT INTO nature(title, content) VALUES('나나나123나', '2222');
INSERT INTO nature(title, content) VALUES('다다다다', '3333');

-- article 테이블에 데이터 추가
INSERT INTO nature(title, content) VALUES('당신의 인생 영화는?', '댓글 고');
INSERT INTO nature(title, content) VALUES('당신의 소울 푸드는?', '댓글 고고');
INSERT INTO nature(title, content) VALUES('당신의 취미는?', '댓글 고고고');

-- 4번 게시글의 댓글 추가
INSERT INTO comment(nature_id, nickname, body) VALUES(3, 'Park', '굿 윌 헌팅');
INSERT INTO comment(nature_id, nickname, body) VALUES(3, 'Kim', '아이 엠 샘');
INSERT INTO comment(nature_id, nickname, body) VALUES(3, 'Choi', '쇼생크 탈출');

-- 5번 게시글의 댓글 추가
INSERT INTO comment(nature_id, nickname, body) VALUES(5, 'Park', '치킨');
INSERT INTO comment(nature_id, nickname, body) VALUES(5, 'Kim', '샤브샤브');
INSERT INTO comment(nature_id, nickname, body) VALUES(5, 'Choi', '초밥');

-- 6번 게시글의 댓글 추가
INSERT INTO comment(nature_id, nickname, body) VALUES(6, 'Park', '조깅');
INSERT INTO comment(nature_id, nickname, body) VALUES(6, 'Kim', '유튜브 시청');
INSERT INTO comment(nature_id, nickname, body) VALUES(6, 'Choi', '독서');
