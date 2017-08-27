-- 删除数据库
DROP DATABASE stockDB;
-- 创建数据库
CREATE DATABASE stockDB;
-- 创建表user
CREATE TABLE user (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(20),
    password VARCHAR(20)
);
-- 创建表stockTBL
CREATE TABLE stockTBL (
    code VARCHAR(10) PRIMARY KEY NOT NULL,  -- 股票代码
    shortName VARCHAR(20),  -- 股票简称
    marketType VARCHAR(20),  -- 股票市场类型
    marketValue DECIMAL(18 , 2 )  -- 流通市值
);
-- 检索
SELECT * FROM stockTBL;
select count(*) from stockTBL;
-- 创建表stockDataTBL
CREATE TABLE stockDataTBL (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    code VARCHAR(10),
    currentDate DATE,
    open DECIMAL(6 , 2 ),
    high DECIMAL(6 , 2 ),
    low DECIMAL(6 , 2 ),
    close DECIMAL(6 , 2 ),
    volume DECIMAL(18 , 0 ),
    adjClose DECIMAL(6 , 2 ),
    foreign key(code) references stockTBL(code)
);
-- 检索
SELECT * FROM stockDataTBL where code like'6002%';

select min(currentDate) from stockDataTBL where code = '000018';
select count(1) from stockDataTBL group by code;
-- 禁用外键约束
SET FOREIGN_KEY_CHECKS=0;
-- 删除数据
truncate table stockTBL;
truncate table stockDataTBL;
-- 启动外键约束
SET FOREIGN_KEY_CHECKS=1;
-- 查看当前FOREIGN_KEY_CHECKS的值，可用如下命令：
SELECT @@FOREIGN_KEY_CHECKS;

