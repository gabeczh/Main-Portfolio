DROP TABLE SELECTION;
DROP TABLE VERIFICATION;
DROP TABLE PARTICIPANT;
DROP TABLE CATEGORY;
DROP TABLE CAR;




CREATE TABLE CAR (
    CarID      VARCHAR2(5) NOT NULL PRIMARY KEY,
    CarType    VARCHAR2(40) NOT NULL,
    CarNumber  VARCHAR2(15) NOT NULL
);

INSERT INTO CAR VALUES ('C0001','Sedan', 'MB1060');
INSERT INTO CAR VALUES ('C0002','Compact', 'VH1162');
INSERT INTO CAR VALUES ('C0003','Truck', 'MV1260');
INSERT INTO CAR VALUES ('C0004','Hatchback', 'VB1561');
INSERT INTO CAR VALUES ('C0005','SUV', 'AB1469');


CREATE TABLE CATEGORY (
    CategoryID    VARCHAR2(5) NOT NULL PRIMARY KEY,
    CategoryName  VARCHAR2(40) NOT NULL
);

INSERT INTO CATEGORY VALUES ('G0001','CANOES:PRO BOATS');
INSERT INTO CATEGORY VALUES ('G0002','CANOES:17 FOOT OPEN');
INSERT INTO CATEGORY VALUES ('G0003','CANOES:MENS RECREATIONAL');
INSERT INTO CATEGORY VALUES ('G0004','CANOES:WOMENS RECREATIONAL');
INSERT INTO CATEGORY VALUES ('G0005','CANOES:MIXED RECREATIONAL');
INSERT INTO CATEGORY VALUES ('G0006','CANOES:ADULT AND YOUTH');
INSERT INTO CATEGORY VALUES ('G0007','STUDENT CANOES:STUDENT MEN');
INSERT INTO CATEGORY VALUES ('G0008','STUDENT CANOES:STUDENT WOMEN');
INSERT INTO CATEGORY VALUES ('G0009','STUDENT CANOES:STUDENT MIXED');
INSERT INTO CATEGORY VALUES ('G0010','KAYAKS:SINGLE,OVER 14 FEET LONG');
INSERT INTO CATEGORY VALUES ('G0011','KAYAKS:SINGLE, 14 FEET AND UNDER');
INSERT INTO CATEGORY VALUES ('G0012','KAYAKS:SINGLE, STUDENT');
INSERT INTO CATEGORY VALUES ('G0013','KAYAKS:DOUBLE KAYAK');


CREATE TABLE PARTICIPANT (
    ParticipantID  VARCHAR2(5) NOT NULL PRIMARY KEY,
    TeamID         VARCHAR2(5),
    FullName       VARCHAR2(40) NOT NULL,
    StreetAddress  VARCHAR2(50) NOT NULL,
    ApartmentNo    VARCHAR2(10),
    City           VARCHAR2(25) NOT NULL,
    State          VARCHAR2(25),
    PostalCode     VARCHAR2(10) NOT NULL,
    HomePhone      VARCHAR2(25),
    WorkPhone      VARCHAR2(25),
    CellPhone      VARCHAR2(25) NOT NULL,
    Email          VARCHAR2(50) NOT NULL,
    EmergencyName  VARCHAR2(40),
    EmergencyNo    VARCHAR2(25),
    Age            INTEGER,
    Gender         CHAR(1),
    Highschool     VARCHAR2(50)
);

INSERT INTO PARTICIPANT(ParticipantID,FullName,StreetAddress,ApartmentNo,City,State,PostalCode,HomePhone,WorkPhone,CellPhone,Email,EmergencyName,EmergencyNo) 
VALUES ('P0001', 'Daniel Lewis', '5th Street', 'A4', 'Miami', 'Florida', '51100', '012-4545 8999', '012-5446 7865', '017-3322 1221', 'dan@gmail.com', 'Freddie Guy', '019-6577 8760');
INSERT INTO PARTICIPANT(ParticipantID,TeamID,FullName,Age,Gender,Highschool,Email,CellPhone,StreetAddress,City,PostalCode) 
VALUES ('P0002', 'B0001','Robert Miles', '18', 'M', 'New York High', 'robert@gmail.com', '015-4433 8989', '20th Street', 'Queens', '22001');
INSERT INTO PARTICIPANT(ParticipantID,FullName,StreetAddress,ApartmentNo,City,State,PostalCode,HomePhone,WorkPhone,CellPhone,Email,EmergencyName,EmergencyNo) 
VALUES ('P0003', 'Craig Lewis', '11th Street', 'A11', 'San Juan', 'Puerto Rico', '53300', '016-4577 4499', '018-6546 7895', '012-3362 5221', 'craig@gmail.com', 'Thomas Lee', '012-1577 7760');
INSERT INTO PARTICIPANT(ParticipantID,TeamID,FullName,Age,Gender,Highschool,Email,CellPhone,StreetAddress,City,PostalCode) 
VALUES ('P0004', 'B0001','Bradley Ryan', '18', 'M', 'New York High', 'bradley@gmail.com', '019-2253 9785', '10th Street', 'Queens', '22001');
INSERT INTO PARTICIPANT(ParticipantID,FullName,StreetAddress,ApartmentNo,City,State,PostalCode,HomePhone,WorkPhone,CellPhone,Email,EmergencyName,EmergencyNo) 
VALUES ('P0005', 'Steve Churchill', '4th Street', 'B14', 'Las Vegas', 'Nevada', '55200', '018-3515 5959', '013-1426 9865', '011-5222 8281', 'steve@gmail.com', 'Daniel Bob', '014-7577 1160');
INSERT INTO PARTICIPANT(ParticipantID,TeamID,FullName,Age,Gender,Highschool,Email,CellPhone,StreetAddress,City,PostalCode)
VALUES ('P0006', 'B0002','Mary Jane', '18', 'F', 'Deans High', 'mary@gmail.com', '012-2423 1981', '5th Street', 'Brooklyn', '22033');
INSERT INTO PARTICIPANT(ParticipantID,FullName,StreetAddress,ApartmentNo,City,State,PostalCode,HomePhone,WorkPhone,CellPhone,Email,EmergencyName,EmergencyNo) 
VALUES ('P0007', 'Daniel Rau', '3rd Street', 'D1', 'Austin', 'Texas', '52100', '011-4555 8999', '015-2246 7667', '016-8822 3231', 'rau@gmail.com', 'Herbert Hughes', '018-2277 8722');
INSERT INTO PARTICIPANT(ParticipantID,TeamID,FullName,Age,Gender,Highschool,Email,CellPhone,StreetAddress,City,PostalCode)
VALUES ('P0008', 'B0002','Jake Shields', '18', 'M', ' Yorkshire High', 'jake@gmail.com', '011-3433 8779', '11th Street', 'Yorkshire', '22201');
INSERT INTO PARTICIPANT(ParticipantID,FullName,StreetAddress,ApartmentNo,City,State,PostalCode,HomePhone,WorkPhone,CellPhone,Email,EmergencyName,EmergencyNo) 
VALUES ('P0009', 'Jason Smith', '1st Street', 'S9', 'Los Angeles', 'California', '52210', '019-6565 8289', '012-1162 7899', '014-1122 9291', 'jason@gmail.com', 'Vincent James', '011-5555 8969');
INSERT INTO PARTICIPANT(ParticipantID,TeamID,FullName,Age,Gender,Highschool,Email,CellPhone,StreetAddress,City,PostalCode) 
VALUES ('P0010', NULL,'Melissa Giles', '18', 'F', 'New York High', 'melissa@gmail.com', '016-5453 8111', '2nd Street', 'Manhattan', '22211');


CREATE TABLE SELECTION (
    CATEGORY_CategoryID      VARCHAR2(5) NOT NULL,
    PARTICIPANT_ParticipantID  VARCHAR2(5) NOT NULL,
    
    CONSTRAINT SELECTION_PK PRIMARY KEY ( CATEGORY_CategoryID, PARTICIPANT_ParticipantID ),
    CONSTRAINT SELECTION_CATEGORY_FK FOREIGN KEY ( CATEGORY_CategoryID )
    REFERENCES CATEGORY ( CategoryID ),
    CONSTRAINT SELECTION_PARTICIPANT_FK FOREIGN KEY ( PARTICIPANT_ParticipantID )
    REFERENCES PARTICIPANT ( ParticipantID )
);

INSERT INTO SELECTION VALUES ('G0001','P0002');
INSERT INTO SELECTION VALUES ('G0001','P0004');
INSERT INTO SELECTION VALUES ('G0013','P0006');
INSERT INTO SELECTION VALUES ('G0013','P0008');
INSERT INTO SELECTION VALUES ('G0008','P0010');


CREATE TABLE VERIFICATION (
    PARTICIPANT_ParticipantID  VARCHAR2(5) NOT NULL,
    CAR_CarID                  VARCHAR2(5) NOT NULL,
    
    CONSTRAINT VERIFICATION_PK PRIMARY KEY ( PARTICIPANT_ParticipantID, CAR_CarID ),
    CONSTRAINT VERIFICATION_CAR_FK FOREIGN KEY ( CAR_CarID )
    REFERENCES CAR ( CarID ),
    CONSTRAINT VERIFICATION_PARTICIPANT_FK FOREIGN KEY ( PARTICIPANT_ParticipantID )
    REFERENCES PARTICIPANT ( ParticipantID )
);

INSERT INTO VERIFICATION VALUES ('P0001','C0001');
INSERT INTO VERIFICATION VALUES ('P0003','C0002');
INSERT INTO VERIFICATION VALUES ('P0005','C0003');
INSERT INTO VERIFICATION VALUES ('P0007','C0004');
INSERT INTO VERIFICATION VALUES ('P0009','C0005');

