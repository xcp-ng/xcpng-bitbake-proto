
PN = "mariadb-connector-odbc"
PE = "0"
PV = "3.2.4"
PR = "1.el10"
PACKAGES = "mariadb-connector-odbc"


URI_mariadb-connector-odbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-connector-odbc-3.2.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mariadb-connector-odbc = " \
 libgcc \
 pkgconf-pkg-config \
 libstdc++ \
 mariadb-connector-c \
 unixODBC \
 glibc \
"
