
PN = "libmaxminddb"
PE = "0"
PV = "1.9.1"
PR = "4.el10"
PACKAGES = "libmaxminddb libmaxminddb-devel"


URI_libmaxminddb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmaxminddb-1.9.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmaxminddb = "
 glibc
"

URI_libmaxminddb-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmaxminddb-devel-1.9.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmaxminddb-devel = "
 libmaxminddb
 pkgconf-pkg-config
"
