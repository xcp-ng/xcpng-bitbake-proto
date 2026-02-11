
PN = "postgresql16-pg_repack"
PE = "0"
PV = "1.5.1"
PR = "1.el10"
PACKAGES = "pg_repack"


URI_pg_repack = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pg_repack-1.5.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pg_repack = "postgresql-server ( >=  16) postgresql-server ( <  17) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpq.so.private16-5()(64bit) ( )"
RPROVIDES:pg_repack = "pg_repack-any ( ) pg_repack ( =  1.5.1-1.el10) pg_repack(x86-64) ( =  1.5.1-1.el10) postgresql-pg_repack ( =  1.5.1-1.el10) postgresql16-pg_repack ( =  1.5.1-1.el10)"
