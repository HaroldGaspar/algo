USE db;
CREATE TABLE Docente(
                      Id INT AUTO_INCREMENT,
                      Nombre VARCHAR(30),
                      Apellido VARCHAR(30),
                      Dni VARCHAR(10),
                      Correo VARCHAR(30),
					  constraint Docente_pk
						primary key (Id)
);
CREATE TABLE Supplier(
                      Id INT AUTO_INCREMENT,
                      RazonSocial VARCHAR(30),
                      Ruc VARCHAR(30),
                      Producto VARCHAR(10),
                      Direccion VARCHAR(30),
					  constraint Proveedor_pk
						primary key (Id)
);