
create database onlinereservation;

use onlinereservation;

CREATE TABLE `busdata` (
  `busId` varchar(20) NOT NULL,
  `source` varchar(15) NOT NULL,
  `destination` varchar(15) NOT NULL,
  `busType` varchar(10) NOT NULL,
  `onwardDate` varchar(15) NOT NULL,
  `returnDate` varchar(15) NOT NULL,
  `departure` datetime NOT NULL,
  `arrival` datetime NOT NULL,
  `fare` varchar(20) DEFAULT NULL,
  `seat` int(11) DEFAULT NULL,
  PRIMARY KEY (`busId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `registration` (
  `userID` varchar(15) NOT NULL,
  `firstName` varchar(40) DEFAULT NULL,
  `lastName` varchar(20) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `dateOfBirth` varchar(40) DEFAULT NULL,
  `mobileNumber` int(13) DEFAULT NULL,
  `emailID` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `reenterPassword` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `travellerdetails` (
  `firstName` varchar(15) DEFAULT NULL,
  `lastName` varchar(15) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `emailId` varchar(50) NOT NULL,
  `contactNumber` int(20) DEFAULT NULL,
  `numberOfSeats` int(11) DEFAULT NULL,
  `busId` int(11) DEFAULT NULL,
  PRIMARY KEY (`emailId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into busdata values("4", "Chicago", "Kansas", "AC", "29/07/2017", "29/08/2017","2017-04-18 12:30:00", "2017-04-18 12:00:00","500","50");

insert into busdata values("5", "Chicago", "Kansas", "AC", "29/07/2017", "29/08/2017","2017-04-18 12:30:00", "2017-04-18 12:00:00","500","50");

insert into busdata values("6", "Chicago", "Kansas", "AC", "29/07/2017", "29/08/2017","2017-04-18 12:30:00", "2017-04-18 12:00:00","500","50")