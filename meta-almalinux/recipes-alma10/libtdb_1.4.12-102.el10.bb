
PN = "libtdb"
PE = "0"
PV = "1.4.12"
PR = "102.el10"
PACKAGES = "libtdb python3-tdb tdb-tools libtdb-devel"


URI_libtdb = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtdb-1.4.12-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtdb = " \
 glibc \
"

URI_python3-tdb = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-tdb-1.4.12-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-tdb = " \
 glibc \
 python3 \
 libtdb \
"

URI_tdb-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tdb-tools-1.4.12-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tdb-tools = " \
 glibc \
 libtdb \
"

URI_libtdb-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtdb-devel-1.4.12-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtdb-devel = " \
 pkgconf-pkg-config \
 libtdb \
"
