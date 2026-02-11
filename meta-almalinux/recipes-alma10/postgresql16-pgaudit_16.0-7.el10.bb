
PN = "postgresql16-pgaudit"
PE = "0"
PV = "16.0"
PR = "7.el10"
PACKAGES = "pgaudit"


URI_pgaudit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pgaudit-16.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pgaudit = " \
 glibc \
 postgresql-server \
"
