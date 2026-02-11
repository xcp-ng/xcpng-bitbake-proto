
PN = "postgresql-odbc"
PE = "0"
PV = "16.00.0000"
PR = "5.el10"
PACKAGES = "postgresql-odbc postgresql-odbc-tests"


URI_postgresql-odbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-odbc-16.00.0000-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-odbc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpq.so.5()(64bit) ( ) libpq.so.5(RHPG_9.6)(64bit) ( ) libodbcinst.so.2()(64bit) ( )"
RPROVIDES:postgresql-odbc = "postgresql-odbc ( =  16.00.0000-5.el10) postgresql-odbc(x86-64) ( =  16.00.0000-5.el10) psqlodbc ( =  16.00.0000-5.el10)"

URI_postgresql-odbc-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/postgresql-odbc-tests-16.00.0000-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-odbc-tests = "/usr/bin/sh ( ) gcc ( ) make ( ) postgresql-test ( ) unixODBC-devel ( ) postgresql-odbc ( =  16.00.0000-5.el10)"
RPROVIDES:postgresql-odbc-tests = "postgresql-odbc-tests ( =  16.00.0000-5.el10) postgresql-odbc-tests(x86-64) ( =  16.00.0000-5.el10)"
