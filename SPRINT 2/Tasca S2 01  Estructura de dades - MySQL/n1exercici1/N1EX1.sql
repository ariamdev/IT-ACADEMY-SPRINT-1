---------------------------------------------------------------------------------------------------------
-- ÓPTICA "CUL D'AMPOLLA
---------------------------------------------------------------------------------------------------------

CREATE DATABASE Optica;

CREATE TABLE address (
  `address_id` int NOT NULL AUTO_INCREMENT,
  `adress_street` varchar(100) NOT NULL,
  `adress_number` int DEFAULT NULL,
  `adress_floor` varchar(10) DEFAULT NULL,
  `adress_door` varchar(10) DEFAULT NULL,
  `adress_city` varchar(100) NOT NULL,
  `adress_pcode` varchar(10) NOT NULL,
  `adress_country` varchar(100) NOT NULL,
  PRIMARY KEY (`address_id`)

CREATE TABLE `brand` (
  `brand_id` int NOT NULL AUTO_INCREMENT,
  `brand_name` varchar(100) NOT NULL,
  PRIMARY KEY (`brand_id`)

CREATE TABLE `customer` (
  `customer_id` int NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(50) NOT NULL,
  `customer_surname` varchar(50) NOT NULL,
  `customer_postcode` varchar(10) DEFAULT NULL,
  `customer_telf` int DEFAULT NULL,
  `customer_email` varchar(50) DEFAULT NULL,
  `customer_datecreation` datetime DEFAULT CURRENT_TIMESTAMP,
  `customer_recommendedby` int DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  KEY `customer_recommendedby` (`customer_recommendedby`),
  CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`customer_recommendedby`) REFERENCES `customer` (`customer_id`)

CREATE TABLE `employees` (
  `employee_id` int NOT NULL AUTO_INCREMENT,
  `employee_name` varchar(50) DEFAULT NULL,
  `employee_surname` varchar(50) DEFAULT NULL,
  `employee_identifnum` varchar(10) DEFAULT NULL,
  `employee_telf` int DEFAULT NULL,
  `employee_email` varchar(50) DEFAULT NULL,
  `employee_recruitmentdate` date NOT NULL,
  PRIMARY KEY (`employee_id`),
  UNIQUE KEY `employee_identifnum` (`employee_identifnum`)

CREATE TABLE `glasses` (
  `glasses_id` int NOT NULL AUTO_INCREMENT,
  `glasses_prescription_right` float DEFAULT NULL,
  `glasses_prescription_left` float DEFAULT NULL,
  `glasses_frame` enum('floating','plastic','metallic') DEFAULT NULL,
  `glasses_framecolour` varchar(50) DEFAULT NULL,
  `glasses_colour` varchar(50) DEFAULT NULL,
  `glasses_price` decimal(5,2) DEFAULT NULL,
  `supplier_id` int DEFAULT NULL,
  `brand_id` int DEFAULT NULL,
  PRIMARY KEY (`glasses_id`),
  KEY `supplier_id` (`supplier_id`),
  KEY `brand_id` (`brand_id`),
  CONSTRAINT `glasses_ibfk_1` FOREIGN KEY (`supplier_id`) REFERENCES `suppliers` (`supplier_id`),
  CONSTRAINT `glasses_ibfk_2` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`brand_id`)

CREATE TABLE `sales` (
  `sales_id` int NOT NULL AUTO_INCREMENT,
  `sales_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `customer_id` int DEFAULT NULL,
  `employee_id` int DEFAULT NULL,
  `glasses_id` int DEFAULT NULL,
  PRIMARY KEY (`sales_id`),
  KEY `customer_id` (`customer_id`),
  KEY `employee_id` (`employee_id`),
  KEY `glasses_id` (`glasses_id`),
  CONSTRAINT `sales_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`),
  CONSTRAINT `sales_ibfk_2` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`),
  CONSTRAINT `sales_ibfk_3` FOREIGN KEY (`glasses_id`) REFERENCES `glasses` (`glasses_id`)

CREATE TABLE `suppliers` (
  `supplier_id` int NOT NULL AUTO_INCREMENT,
  `supplier_name` varchar(100) NOT NULL,
  `address_id` int DEFAULT NULL,
  `supplier_telf` int DEFAULT NULL,
  `supplier_fax` int DEFAULT NULL,
  `supplier_nif` varchar(10) NOT NULL,
  PRIMARY KEY (`supplier_id`),
  KEY `address_id` (`address_id`),
  CONSTRAINT `suppliers_ibfk_1` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`)