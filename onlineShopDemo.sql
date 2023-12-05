DROP DATABASE ONLINESHOP_1
CREATE DATABASE ONLINESHOP_1
USE ONLINESHOP_1


CREATE TABLE [dbo].[Users](
	[UserID] [int] IDENTITY(1,1) NOT NULL,
	[Password] varchar(20) NOT NULL,
	[Name] nvarchar(30) NULL,
	[Phone] varchar(24) NULL,
	[Email] varchar(255) NULL UNIQUE,
	[isAdmin] bit NULL,
CONSTRAINT [PK_Users] PRIMARY KEY CLUSTERED (UserID)
)


CREATE TABLE Categories(
	[CategoryID] int IDENTITY(1,1) PRIMARY KEY,
	[CategoryName] nvarchar(15) NOT NULL,
	[Picture] nvarchar(100) NULL
 )

  CREATE TABLE [dbo].[Products](
	[ProductID] [int] IDENTITY(1,1) NOT NULL,
	[ProductName] [nvarchar](200) NULL,
	[CategoryID] [int] NULL,
	[Price] [money] NULL,
	[UnitsInStock] [smallint] NULL,
	[Brand] [nvarchar](30) NULL,
	[ProductDetail] [nvarchar](max) NULL,
 CONSTRAINT [PK_Products] PRIMARY KEY CLUSTERED (ProductID),
 CONSTRAINT FK_Products FOREIGN KEY (categoryID) REFERENCES Categories(CategoryID)
 )


CREATE TABLE [dbo].[ProductImages](
	[ImageID] [int] IDENTITY(1,1) NOT NULL,
	[ProductID] [int] NOT NULL,
	[ImagePath] [nvarchar](100) NULL,
 CONSTRAINT [PK_ProductImages] PRIMARY KEY CLUSTERED (ImageID),
 CONSTRAINT [FK_ProductImages_Products] FOREIGN KEY([ProductID]) REFERENCES [dbo].[Products] ([ProductID])
)


CREATE TABLE [dbo].[Orders](
	[OrderID] [int] IDENTITY(1,1) NOT NULL,
	[UserID] [int] NOT NULL,
	[OrderDate] [date] NULL,
	[ShippedDate] [date] NULL,
	[ShipAddress] [nvarchar](60) NULL,
	[TotalMoney] [money] NULL,
	[OrderStatus] [smallint] NULL,
 CONSTRAINT [PK_Orders] PRIMARY KEY CLUSTERED (OrderID),
 CONSTRAINT [FK_Orders_Users] FOREIGN KEY([UserID]) REFERENCES [dbo].[Users] ([UserID])
)



CREATE TABLE [dbo].[OrderDetails](
	[OrderID] [int] NOT NULL,
	[ProductID] [int] NOT NULL,
	[UnitPrice] [money] NOT NULL,
	[Quantity] [smallint] NOT NULL,
 CONSTRAINT [PK_OrderLine] PRIMARY KEY CLUSTERED
(
[OrderID] ASC,
[ProductID] ASC
),
 CONSTRAINT [FK_OrderDetails_Orders] FOREIGN KEY([OrderID]) REFERENCES [dbo].[Orders] ([OrderID]),
 CONSTRAINT [FK_OrderDetails_Products] FOREIGN KEY([ProductID]) REFERENCES [dbo].[Products] ([ProductID])
 )

CREATE TABLE [dbo].[Feedbacks](
	[FeedbackID] [int] IDENTITY(1,1) PRIMARY KEY,
	[ProductID] [int] NOT NULL,
	[Content] nvarchar(max) NOT NULL,
	[UserID] [int] NOT NULL,
	[Star] [int] NOT NULL,
	[CreatedAt] [date] NULL,
CONSTRAINT [FK_Feedbacks_Products] FOREIGN KEY([ProductID]) REFERENCES [dbo].[Products] ([ProductID]),
CONSTRAINT [FK_Feedbacks_Users] FOREIGN KEY([UserID])
REFERENCES [dbo].[Users] ([UserID])
)

CREATE TABLE [dbo].[Notifications](
	[NotificationID] [int] IDENTITY(1,1) NOT NULL,
	[UserID] [int] NOT NULL,
	[Title] [nvarchar](200)NOT NULL,
	[Message] [nvarchar](500)NOT NULL,
	[CreatedAt] [date] NOT NULL DEFAULT GETDATE(),
	[Type] [smallint] NOT NULL,
 CONSTRAINT [PK_Notifications] PRIMARY KEY CLUSTERED (NotificationID),
 CONSTRAINT [FK_Notifications_Users] FOREIGN KEY([UserID]) REFERENCES [dbo].[Users] ([UserID])
 )

 CREATE TABLE [dbo].[Cart](
	[CartID] [int] IDENTITY(1,1) NOT NULL,
	[UserID] [int] NOT NULL,
	[ProductID] [int] NOT NULL,
	[Quantity] [smallint] NOT NULL,
 CONSTRAINT [PK_Cart] PRIMARY KEY CLUSTERED (CartID),
 CONSTRAINT [FK_Cart_Users] FOREIGN KEY([UserID]) REFERENCES [dbo].[Users] ([UserID]),
 CONSTRAINT [FK_Cart_Products] FOREIGN KEY([ProductID]) REFERENCES [dbo].[Products] ([ProductID])
)

 /*------------------------Them hinh phan loai san pham-----------------------*/

INSERT INTO Categories VALUES ('DEGREY', 'assets/img/logodegrey.png');
INSERT INTO Categories VALUES ('LEVENTS', 'assets/img/logolevents.png');
INSERT INTO Categories VALUES ('The North Face', 'assets/img/logothenorthface.png');
INSERT INTO Categories VALUES ('Ombre', 'assets/img/logoombre.jpg');
INSERT INTO Categories VALUES ('HERMES', 'assets/img/logohermes.png');


/*------------------------Them san pham-----------------------*/

INSERT INTO Products VALUES (N'DegreyRaglanLineTeeĐen', 1, 240000, 3, N'Áo Thun',N'- Chất liệu: 250gsm, cotton 2 chiều.- Họa tiết: Được In Cao.- Size: S/M/L');
INSERT INTO Products VALUES (N'Degrey Raglan Line Tee Kem', 1, 240000, 20, N'Áo Thun',N'- Chất liệu: 250gsm, cotton 2 chiều.- Họa tiết: Được In Cao.- Size: S/M/L');
INSERT INTO Products VALUES (N'Degrey.Theeight Quần Thun Thể Thao Đen', 1, 195000, 10, N'Quần Thun',N'- Chi tiết:. + Lưng thun co giãn, có dây rút đầu.đầu bọc hợp kim không gỉ.+ Design rã tổng cộng 8 mảnh, đi viền.bọc nhỏ có luông dây để làm nổi bật các đường rã.+ Túi xéo 2 bên, bọc viền miệng túi.+ Quần may 2 lớp: Lớp trong phối lưới.để thấm hút và thoáng khí, khi ngồi và hoạt động vải ngoài không ma sát dính vào người.');
INSERT INTO Products VALUES (N'Degrey Coffee Simili Bag', 1, 290000, 20, N'Túi Đeo',N'- Chất liệu: Simili.- Kích thước: 23x15x10.- Hoạ tiết: Logo dập chìm');
INSERT INTO Products VALUES (N'Colkids Tee Racing', 1, 139000, 20, N'Áo Thun',N'Chưa có mô tả cho sản phẩm này');

INSERT INTO Products VALUES (N'LEVENTS® KNIT POLO', 2, 530000, 2, N'Polo',N'Kích cỡ 1: Chiều cao từ 1m50 – 1m65, cân nặng trên 55kg.Kích cỡ 2: Chiều cao từ 1m65 – 1m72, cân nặng dưới 65kg.Kích cỡ 3: Chiều cao từ 1m70 – 1m77, cân nặng dưới 80kg.Kích cỡ 4: Chiều cao trên 1m72, cân nặng dưới 95kg.');
INSERT INTO Products VALUES (N'LEVENTS® | DORAEMON MINI CAT POLO', 2, 405000, 7, N'Polo',N'Kích cỡ 1: Chiều cao từ 1m50 – 1m65, cân nặng trên 55kg.Kích cỡ 2: Chiều cao từ 1m65 – 1m72, cân nặng dưới 65kg.Kích cỡ 3: Chiều cao từ 1m70 – 1m77, cân nặng dưới 80kg.Kích cỡ 4: Chiều cao trên 1m72, cân nặng dưới 95kg.');
INSERT INTO Products VALUES (N'Levents® Bichontour Tee', 2, 390000, 7, N'Áo thun',N'Kích cỡ 1: Chiều cao từ 1m50 – 1m65, cân nặng trên 55kg.Kích cỡ 2: Chiều cao từ 1m65 – 1m72, cân nặng dưới 65kg.Kích cỡ 3: Chiều cao từ 1m70 – 1m77, cân nặng dưới 80kg.Kích cỡ 4: Chiều cao trên 1m72, cân nặng dưới 95kg.');
INSERT INTO Products VALUES (N'Levents® Basic Sandal', 2, 530000, 7, N'Sandal',N'Kích cỡ 1: Chiều cao từ 1m50 – 1m65, cân nặng trên 55kg.Kích cỡ 2: Chiều cao từ 1m65 – 1m72, cân nặng dưới 65kg.Kích cỡ 3: Chiều cao từ 1m70 – 1m77, cân nặng dưới 80kg.Kích cỡ 4: Chiều cao trên 1m72, cân nặng dưới 95kg.');
INSERT INTO Products VALUES (N'LEVENTS® DEPARTMENT SPORTY SHORT', 2, 390000, 7, N'Quần thun',N'Kích cỡ 1: Chiều cao từ 1m50 – 1m65, cân nặng trên 55kg.Kích cỡ 2: Chiều cao từ 1m65 – 1m72, cân nặng dưới 65kg.Kích cỡ 3: Chiều cao từ 1m70 – 1m77, cân nặng dưới 80kg.Kích cỡ 4: Chiều cao trên 1m72, cân nặng dưới 95kg.');

INSERT INTO Products VALUES (N'The North Face - Áo liền quần Nữ Women Dune Sky Onesie', 3, 85000, 20, N'Áo liền quần',N'Made in Vietnam.Chất liệu: WOMEN knit ONE PIECE,80%Polyester,20%Elastane');
INSERT INTO Products VALUES (N'The North Face - Áo thun Nam', 3, 185000, 20, N'Áo thun',N'Made in China.Chất liệu: MEN Knit TEE,60%Cotton,40%Polyester');
INSERT INTO Products VALUES (N'The North Face - Áo thun Nam', 3, 230000, 8, N'Áo thun',N'Made in Jordan.Chất liệu: MEN KNIT SS TEE,92% Polyester, 8% Elastane');
INSERT INTO Products VALUES (N'The North Face - Quần short Nữ', 3, 190000, 20, N'Quần Short',N'Made in Indonesia.The North Face - Quần short Nữ Women’s Trailwear OKT Trail Shorts SS23-NF0A');
INSERT INTO Products VALUES (N'The North Face - Áo khoác Nam', 3, 480000, 7, N'Áo Khoác',N'Made in Cambodia.Vỏ DryVent ™ 2L không thấm nước, thoáng khí, kín đường may với lớp lót taffeta');

INSERT INTO Products VALUES (N'Ombre Sweater', 4, 2850000, 20, 'Sweater',N'Size M/L');
INSERT INTO Products VALUES (N'Ombre Titus Jacket', 4, 1850000, 20, 'Jacket',N'Size M/L');
INSERT INTO Products VALUES (N'Ombre Rowan Zip Hoodie', 4, 350000, 20, 'Hoodie',N'Size M/L');
INSERT INTO Products VALUES (N'Ombre Set Ticke Ver.2', 4, 2850000, 20, 'Set Ticke',N'Size M/L');
INSERT INTO Products VALUES (N'Ombre Zane Shirt', 4, 2150000, 20, N'Áo Thun',N'Size M/L');

INSERT INTO Products VALUES (N'Kềm Godhand', 5, 1020000, 20, 'Godhand',N'Kềm cao cấp nhất chuyên dùng cắt part mô hình ra khỏi runner.Thân kềm bọc cao su giúp tay cầm không bị trượt và êm ái hơn.Lực cắt nhẹ và mặt cắt đẹp');
INSERT INTO Products VALUES (N'Kềm Nanye', 5, 180000, 11, 'Ipliers',N'Kềm chuyên dụng dùng để cắt Mô hình.Sản phẩm có tay cầm bằng cao su giúp tay không bị trượt và êm ái trong quá trình sử dụng.Lực cắt nhẹ và bề mặt cắt đẹp');
INSERT INTO Products VALUES ('Dao Nine-sea', 5, 50000, 20, '9sea',N'Dụng cụ mô hình kĩ thuật dao dọc 9sea.Sử dụng cho giấy, nhựa, vải, kim loại mỏng.Bộ gồm cán dao + 12 lưỡi dão kèm theo.');
INSERT INTO Products VALUES ('Mr Hobby Top Coat', 5, 170000, 8, 'Mr Hobby',N'sơn phủ tạo hiệu ứng nhám.Bảo vệ cho bề mặt.Bình xịt dễ dùng');
INSERT INTO Products VALUES ('Gundam Maker', 5, 35000, 20, 'Mr Hobby',N'Giúp các chi tiết lằn chìm được nổi bật và khiến mô hình sống động hơn.Màu mực sắc nét, nhanh khô, dễ sử dụng.An toàn, không gây hại cho người sử dụng');


/*------------------------Them hinh anh cho tung san pham-----------------------*/

INSERT INTO ProductImages VALUES(1,'assets/img/DegreyRaglanLineTeeĐen1.png')
INSERT INTO ProductImages VALUES(1,'assets/img/DegreyRaglanLineTeeĐen2.png')
INSERT INTO ProductImages VALUES(1,'assets/img/DegreyRaglanLineTeeĐen3.png')

INSERT INTO ProductImages VALUES(2,'assets/img/DegreyRaglanLineTeeKem1.png')
INSERT INTO ProductImages VALUES(2,'assets/img/DegreyRaglanLineTeeKem2.png')
INSERT INTO ProductImages VALUES(2,'assets/img/DegreyRaglanLineTeeKem3.png')

INSERT INTO ProductImages VALUES(3,'assets/img/DegreyTheeight1.png')
INSERT INTO ProductImages VALUES(3,'assets/img/DegreyTheeight2.png')
INSERT INTO ProductImages VALUES(3,'assets/img/DegreyTheeight3.png')
INSERT INTO ProductImages VALUES(3,'assets/img/DegreyTheeight4.png')


INSERT INTO ProductImages VALUES(4,'assets/img/DegreyCoffeeSimiliBag1.png')
INSERT INTO ProductImages VALUES(4,'assets/img/DegreyCoffeeSimiliBag2.png')
INSERT INTO ProductImages VALUES(4,'assets/img/DegreyCoffeeSimiliBag3.png')

INSERT INTO ProductImages VALUES(5,'assets/img/ColkidsTeeRacing.png')
INSERT INTO ProductImages VALUES(5,'assets/img/ColkidsTeeRacing1.png')


/*------*/

INSERT INTO ProductImages VALUES(6,'assets/img/knitpolo1.jpg')
INSERT INTO ProductImages VALUES(6,'assets/img/knitpolo2.jpg')
INSERT INTO ProductImages VALUES(6,'assets/img/knitpolo3.jpg')
INSERT INTO ProductImages VALUES(6,'assets/img/knitpolo4.jpg')

INSERT INTO ProductImages VALUES(7,'assets/img/MINICATPOLO1.jpg')
INSERT INTO ProductImages VALUES(7,'assets/img/MINICATPOLO2.jpg')
INSERT INTO ProductImages VALUES(7,'assets/img/MINICATPOLO3.jpg')
INSERT INTO ProductImages VALUES(7,'assets/img/MINICATPOLO4.jpg')

INSERT INTO ProductImages VALUES(8,'assets/img/BichontourTee1.jpg')
INSERT INTO ProductImages VALUES(8,'assets/img/BichontourTee2.jpg')
INSERT INTO ProductImages VALUES(8,'assets/img/BichontourTee3.jpg')
INSERT INTO ProductImages VALUES(8,'assets/img/BichontourTee4.jpg')

INSERT INTO ProductImages VALUES(9,'assets/img/BasicSandal1.jpg')
INSERT INTO ProductImages VALUES(9,'assets/img/BasicSandal2.jpg')
INSERT INTO ProductImages VALUES(9,'assets/img/BasicSandal3.jpg')
INSERT INTO ProductImages VALUES(9,'assets/img/BasicSandal4.jpg')

INSERT INTO ProductImages VALUES(10,'assets/img/SPORTYSHORT1.jpg')
INSERT INTO ProductImages VALUES(10,'assets/img/SPORTYSHORT2.jpg')
INSERT INTO ProductImages VALUES(10,'assets/img/SPORTYSHORT3.jpg')
INSERT INTO ProductImages VALUES(10,'assets/img/SPORTYSHORT4.jpg')

/*--------*/

INSERT INTO ProductImages VALUES(11,'assets/img/OnesieSS231.jpg')
INSERT INTO ProductImages VALUES(11,'assets/img/OnesieSS232.jpg')
INSERT INTO ProductImages VALUES(11,'assets/img/OnesieSS233.jpg')
INSERT INTO ProductImages VALUES(11,'assets/img/OnesieSS234.jpg')

INSERT INTO ProductImages VALUES(12,'assets/img/Short-Sleeve1.jpg')
INSERT INTO ProductImages VALUES(12,'assets/img/Short-Sleeve2.jpg')
INSERT INTO ProductImages VALUES(12,'assets/img/Short-Sleeve3.jpg')
INSERT INTO ProductImages VALUES(12,'assets/img/Short-Sleeve4.jpg')

INSERT INTO ProductImages VALUES(13,'assets/img/SleeveTee1.jpg')
INSERT INTO ProductImages VALUES(13,'assets/img/SleeveTee2.jpg')
INSERT INTO ProductImages VALUES(13,'assets/img/SleeveTee3.jpg')
INSERT INTO ProductImages VALUES(13,'assets/img/SleeveTee4.jpg')

INSERT INTO ProductImages VALUES(14,'assets/img/TrailShorts1.jpg')
INSERT INTO ProductImages VALUES(14,'assets/img/TrailShorts2.jpg')
INSERT INTO ProductImages VALUES(14,'assets/img/TrailShorts3.jpg')
INSERT INTO ProductImages VALUES(14,'assets/img/TrailShorts4.jpg')

INSERT INTO ProductImages VALUES(15,'assets/img/Full-Zip1.jpg')
INSERT INTO ProductImages VALUES(15,'assets/img/Full-Zip2.jpg')
INSERT INTO ProductImages VALUES(15,'assets/img/Full-Zip3.jpg')
INSERT INTO ProductImages VALUES(15,'assets/img/Full-Zip4.jpg')

/*---------*/

INSERT INTO ProductImages VALUES(16,'assets/img/ombresweater1.jpg')
INSERT INTO ProductImages VALUES(16,'assets/img/ombresweater2.jpg')
INSERT INTO ProductImages VALUES(16,'assets/img/ombresweater3.jpg')

INSERT INTO ProductImages VALUES(17,'assets/img/OmbreTitusJacket1.jpg')
INSERT INTO ProductImages VALUES(17,'assets/img/OmbreTitusJacket2.jpg')
INSERT INTO ProductImages VALUES(17,'assets/img/OmbreTitusJacket3.jpg')

INSERT INTO ProductImages VALUES(18,'assets/img/rowan1.jpg')
INSERT INTO ProductImages VALUES(18,'assets/img/rowan2.jpg')

INSERT INTO ProductImages VALUES(19,'assets/img/setticket1.jpg')
INSERT INTO ProductImages VALUES(19,'assets/img/setticket2.jpg')
INSERT INTO ProductImages VALUES(19,'assets/img/setticket3.jpg')

INSERT INTO ProductImages VALUES(20,'assets/img/zaneshirt1.jpg')
INSERT INTO ProductImages VALUES(20,'assets/img/zaneshirt2.jpg')
INSERT INTO ProductImages VALUES(20,'assets/img/zaneshirt3.jpg')

/*----------*/

INSERT INTO ProductImages VALUES(21,'assets/img/kemgodhand1.jpg')
INSERT INTO ProductImages VALUES(22,'assets/img/kemnanye1.jpg')
INSERT INTO ProductImages VALUES(23,'assets/img/daonine-sea1.jpg')
INSERT INTO ProductImages VALUES(24,'assets/img/mrhobbytopcoat1.jpg')
INSERT INTO ProductImages VALUES(25,'assets/img/gundammaker1.jpg')



SELECT * FROM ORDERS 
SELECT * FROM OrderDetails
SELECT * FROM Users
delete from notifications  where notificationId = 1
SELECT * FROM Categories
SELECT * FROM Notifications
SELECT * FROM Products

SELECT * FROM ProductImages

SELECT SUM(Quantity) AS TotalQuantitySold
FROM OrderDetails
WHERE ProductID = 1;
SELECT * FROM ORDERS WHERE OrderStatus = 1 AND CAST(ShippedDate AS DATE) = CAST(GETDATE() AS DATE);

SELECT COUNT(*) FROM Users
SELECT COUNT(*) FROM ORDERS
SELECT COUNT(*) FROM Products
SELECT COUNT(*) FROM Products WHERE [UnitsInStock] <= 5


SELECT * FROM Products ORDER BY ProductID DESC;

SELECT * FROM Products WHERE Productname like '%e%'
/*------------------------Clone user--------------------*/
/*[UserID] [int] IDENTITY(1,1) NOT NULL,
	[Password] varchar(20) NOT NULL,
	[Name] nvarchar(30) NULL,
	[Phone] varchar(24) NULL,
	[Email] varchar(255) NULL UNIQUE,
	[isAdmin] bit NULL,
*/
INSERT INTO Users VALUES(123321,'Thanh', '0372343515', 'thanh@gmail.com', 1)
SELECT *  FROM Users

