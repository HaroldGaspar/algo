USE db;
GO
CREATE TABLE Producto(
                         Id INT AUTO_,
                         Nombre varchar(30) null,
                         Descripcion varchar(50) null,
                         Precio DEC(10,2) null,
                         Stock INT null,
						constraint Producto_pk
							primary key (Id)
);

CREATE TABLE Libro(
                      Id INT AUTO_INCREMENT,
                      Nombre VARCHAR(30),
                      Descripcicon VARCHAR(50),
                      Autor VARCHAR(30),
                      Editorial VARCHAR(30),
                      Precio DEC(10,2),
                      Stock INT,
					  constraint Libro_pk
						primary key (Id)
);