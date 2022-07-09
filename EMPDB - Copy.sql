
USE [master]
GO
/****** Object:  Database [EMPDB]    Script Date: 7/24/2020 1:22:47 PM ******/
CREATE DATABASE [EMPDB]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'EMPDB', FILENAME = N'D:\SOF203 - Lap trinh Java 3\Database\EMPDB.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'EMPDB_log', FILENAME = N'D:\SOF203 - Lap trinh Java 3\Database\EMPDB_log.ldf' , SIZE = 3456KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [EMPDB] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [EMPDB].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [EMPDB] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [EMPDB] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [EMPDB] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [EMPDB] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [EMPDB] SET ARITHABORT OFF 
GO
ALTER DATABASE [EMPDB] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [EMPDB] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [EMPDB] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [EMPDB] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [EMPDB] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [EMPDB] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [EMPDB] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [EMPDB] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [EMPDB] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [EMPDB] SET  DISABLE_BROKER 
GO
ALTER DATABASE [EMPDB] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [EMPDB] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [EMPDB] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [EMPDB] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [EMPDB] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [EMPDB] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [EMPDB] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [EMPDB] SET RECOVERY FULL 
GO
ALTER DATABASE [EMPDB] SET  MULTI_USER 
GO
ALTER DATABASE [EMPDB] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [EMPDB] SET DB_CHAINING OFF 
GO
ALTER DATABASE [EMPDB] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [EMPDB] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [EMPDB] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'EMPDB', N'ON'
GO
ALTER DATABASE [EMPDB] SET QUERY_STORE = OFF
GO
USE [EMPDB]
GO
ALTER DATABASE SCOPED CONFIGURATION SET IDENTITY_CACHE = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION SET LEGACY_CARDINALITY_ESTIMATION = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET LEGACY_CARDINALITY_ESTIMATION = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET MAXDOP = 0;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET MAXDOP = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET PARAMETER_SNIFFING = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET PARAMETER_SNIFFING = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET QUERY_OPTIMIZER_HOTFIXES = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET QUERY_OPTIMIZER_HOTFIXES = PRIMARY;
GO
USE [EMPDB]
GO
/****** Object:  Table [dbo].[Books]    Script Date: 7/24/2020 1:22:47 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Books](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](50) NULL,
	[price] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[emp]    Script Date: 7/24/2020 1:22:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[emp](
	[uname] [varchar](20) NULL,
	[umail] [varchar](30) NULL,
	[upass] [varchar](20) NULL,
	[ucountry] [varchar](20) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Employees]    Script Date: 7/24/2020 1:22:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Employees](
	[id] [int] NOT NULL,
	[first] [nvarchar](255) NULL,
	[last] [nvarchar](255) NULL,
	[age] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Books] ON 

INSERT [dbo].[Books] ([ID], [title], [price]) VALUES (1, N'Lập trình C', 100)
INSERT [dbo].[Books] ([ID], [title], [price]) VALUES (2, N'Lập trình Java', 200)
INSERT [dbo].[Books] ([ID], [title], [price]) VALUES (3, N'Lập trình C#', 150)
SET IDENTITY_INSERT [dbo].[Books] OFF
INSERT [dbo].[emp] ([uname], [umail], [upass], [ucountry]) VALUES (N'Teo', N'teo@gmail.com', N'welcome', N'Vung Tau')
INSERT [dbo].[emp] ([uname], [umail], [upass], [ucountry]) VALUES (N'Ngan', N'ngan@gmail.com', N'123', N'Phan Thiet')
INSERT [dbo].[emp] ([uname], [umail], [upass], [ucountry]) VALUES (N'Trung', N'trung@gmail.com', N'abc', N'Nha Trang')
INSERT [dbo].[emp] ([uname], [umail], [upass], [ucountry]) VALUES (N'Hieu', N'hieu@gmail.com', N'456', N'Binh DInh')
INSERT [dbo].[emp] ([uname], [umail], [upass], [ucountry]) VALUES (N'Bich', N'bich@gmail.com', N'123', N'Ninh Thuan')
INSERT [dbo].[emp] ([uname], [umail], [upass], [ucountry]) VALUES (N'Gai', N'gai@gmail.com', N'abc', N'Vinh Long')
INSERT [dbo].[Employees] ([id], [first], [last], [age]) VALUES (1, N'Vy', N'Nguyen Thi Tuong', 35)
INSERT [dbo].[Employees] ([id], [first], [last], [age]) VALUES (2, N'Phung', N'Le Van', 40)
INSERT [dbo].[Employees] ([id], [first], [last], [age]) VALUES (3, N'Kien', N'Le Phung Hieu', 10)
INSERT [dbo].[Employees] ([id], [first], [last], [age]) VALUES (4, N'An', N'Le Phung Hieu', 20)
/****** Object:  StoredProcedure [dbo].[getEmpName]    Script Date: 7/24/2020 1:22:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[getEmpName] 
 @EMP_ID INT, @EMP_FIRST NVARCHAR(255) OUTPUT
AS
BEGIN
 SELECT @EMP_FIRST = first
 FROM Employees
 WHERE ID = @EMP_ID
END
GO
USE [master]
GO
ALTER DATABASE [EMPDB] SET  READ_WRITE 
GO
