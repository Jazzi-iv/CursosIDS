/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  IDS
 * Created: 9 may. 2025
 */

CREATE TABLE CUSTOMERS (CUSTOMER_NUMBER VARCHAR(8), PASSWORD VARCHAR(8), EMAIL VARCHAR(50), STATUS VARCHAR(1), CREATION VARCHAR(10), PRIMARY KEY (CUSTOMER_NUMBER));
INSERT INTO CUSTOMERS (CUSTOMER_NUMBER, PASSWORD, EMAIL, STATUS, CREATION) VALUES ('00000001','contraxd','jazzi@test.com','A','2024-05-09');