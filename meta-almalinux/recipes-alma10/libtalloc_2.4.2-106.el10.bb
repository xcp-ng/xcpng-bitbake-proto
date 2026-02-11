
PN = "libtalloc"
PE = "0"
PV = "2.4.2"
PR = "106.el10"
PACKAGES = "libtalloc python3-talloc libtalloc-devel python3-talloc-devel"


URI_libtalloc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtalloc-2.4.2-106.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtalloc = " \
 glibc \
"

URI_python3-talloc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-talloc-2.4.2-106.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-talloc = " \
 glibc \
 python3 \
 libtalloc \
 python3-libs \
"

URI_libtalloc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtalloc-devel-2.4.2-106.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtalloc-devel = " \
 pkgconf-pkg-config \
 libtalloc \
"

URI_python3-talloc-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-talloc-devel-2.4.2-106.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-talloc-devel = " \
 python3-talloc \
 pkgconf-pkg-config \
"
