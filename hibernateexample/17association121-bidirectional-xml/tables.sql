DROP TABLE CITIZEN;

DROP TABLE PASSPORT;

CREATE TABLE PASSPORT (
  PID INT(5) PRIMARY KEY AUTO_INCREMENT,
  PNUMBER VARCHAR(30)
);

CREATE TABLE CITIZEN (
  CID INT(5) PRIMARY KEY AUTO_INCREMENT,
  CNAME VARCHAR(30),
  PID INT(5),
  CONSTRAINT FOREIGN KEY (PID) REFERENCES PASSPORT (PID)
);