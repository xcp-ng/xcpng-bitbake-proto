
PN = "libtevent"
PE = "0"
PV = "0.16.1"
PR = "106.el10"
PACKAGES = "libtevent python3-tevent libtevent-devel"


URI_libtevent = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtevent-0.16.1-106.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtevent = "
 glibc
 libtalloc
"

URI_python3-tevent = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-tevent-0.16.1-106.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-tevent = "
 glibc
 python3
 libtalloc
 libtevent
"

URI_libtevent-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtevent-devel-0.16.1-106.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtevent-devel = "
 libtevent
 libtalloc-devel
 pkgconf-pkg-config
"
