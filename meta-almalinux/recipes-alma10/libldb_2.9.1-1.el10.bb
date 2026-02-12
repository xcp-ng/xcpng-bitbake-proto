
inherit dnf-bridge

PN = "libldb"
PE = "0"
PV = "2.9.1"
PR = "1.el10"
PACKAGES = "libldb libldb-devel python-ldb-devel-common python3-ldb python3-ldb-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/libldb-2.9.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libldb = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libldb-2.9.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libldb}"
RDEPENDS:libldb = " \
 lmdb-libs \
 libtevent \
 libtalloc \
 libtdb \
 glibc \
 openldap \
"

URI_libldb-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libldb-devel-2.9.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libldb-devel}"
RDEPENDS:libldb-devel = " \
 libldb \
 libldb \
 pkgconf-pkg-config \
 libtalloc-devel \
 libtdb-devel \
 libtevent-devel \
"

URI_python-ldb-devel-common = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-ldb-devel-common-2.9.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python-ldb-devel-common}"
RDEPENDS:python-ldb-devel-common = ""

URI_python3-ldb = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-ldb-2.9.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-ldb}"
RDEPENDS:python3-ldb = " \
 python3 \
 libldb \
 libldb \
 python3-libs \
 libtevent \
 libtalloc \
 libtdb \
 glibc \
 python3-tdb \
"

URI_python3-ldb-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-ldb-devel-2.9.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-ldb-devel}"
RDEPENDS:python3-ldb-devel = " \
 libldb-devel \
 python3-ldb \
 pkgconf-pkg-config \
 python-ldb-devel-common \
"
