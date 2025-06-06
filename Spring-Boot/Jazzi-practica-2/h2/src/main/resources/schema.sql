/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  IDS
 * Created: 14 may. 2025
 */

DROP TABLE IF EXISTS customers;
CREATE TABLE CUSTOMERS (CUSTOMER_NUMBER VARCHAR(8), NAME VARCHAR(10), LAST_NAME VARCHAR(10), SESSION BOOLEAN, PASSWORD VARCHAR(10), EMAIL VARCHAR(50), STATUS VARCHAR(1), CREATION VARCHAR(10), PRIMARY KEY (CUSTOMER_NUMBER));