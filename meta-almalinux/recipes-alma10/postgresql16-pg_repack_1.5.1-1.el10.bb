
PN = "postgresql16-pg_repack"
PE = "0"
PV = "1.5.1"
PR = "1.el10"
PACKAGES = "pg_repack"


URI_pg_repack = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pg_repack-1.5.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pg_repack = "
 glibc
 postgresql-server
 postgresql-private-libs
"
