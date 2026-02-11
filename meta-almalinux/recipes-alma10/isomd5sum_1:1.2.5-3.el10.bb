
inherit dnf-bridge

PN = "isomd5sum"
PE = "1"
PV = "1.2.5"
PR = "3.el10"
PACKAGES = "isomd5sum isomd5sum-devel python3-isomd5sum"


URI_isomd5sum = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/isomd5sum-1.2.5-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:isomd5sum = " \
 glibc \
 popt \
"

URI_isomd5sum-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/isomd5sum-devel-1.2.5-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:isomd5sum-devel = " \
 isomd5sum \
 pkgconf-pkg-config \
"

URI_python3-isomd5sum = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-isomd5sum-1.2.5-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-isomd5sum = " \
 glibc \
 python3 \
"
