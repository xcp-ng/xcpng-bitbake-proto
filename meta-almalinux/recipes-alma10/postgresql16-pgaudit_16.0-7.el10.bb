
PN = "postgresql16-pgaudit"
PE = "0"
PV = "16.0"
PR = "7.el10"
PACKAGES = "pgaudit"


URI_pgaudit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pgaudit-16.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pgaudit = "postgresql-server ( >=  16) postgresql-server ( <  17) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:pgaudit = "pgaudit-any ( ) pgaudit ( =  16.0-7.el10) pgaudit(x86-64) ( =  16.0-7.el10) postgresql-pgaudit ( =  16.0-7.el10) postgresql16-pgaudit ( =  16.0-7.el10)"
