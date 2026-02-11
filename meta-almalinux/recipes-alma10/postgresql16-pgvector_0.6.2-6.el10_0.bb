
PN = "postgresql16-pgvector"
PE = "0"
PV = "0.6.2"
PR = "6.el10_0"
PACKAGES = "pgvector"


URI_pgvector = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pgvector-0.6.2-6.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pgvector = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) postgresql16-server ( )"
RPROVIDES:pgvector = "pgvector-any ( ) pgvector ( =  0.6.2-6.el10_0) pgvector(x86-64) ( =  0.6.2-6.el10_0) postgresql-pgvector ( =  0.6.2-6.el10_0) postgresql16-pgvector ( =  0.6.2-6.el10_0)"
