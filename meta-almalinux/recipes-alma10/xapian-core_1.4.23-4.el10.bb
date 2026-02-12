
inherit dnf-bridge

PN = "xapian-core"
PE = "0"
PV = "1.4.23"
PR = "4.el10"
PACKAGES = "xapian-core xapian-core-libs xapian-core-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xapian-core-1.4.23-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xapian-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xapian-core-1.4.23-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xapian-core}"
RDEPENDS:xapian-core = " \
 libgcc \
 xapian-core-libs \
 libstdc++ \
 bash \
 glibc \
"

URI_xapian-core-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xapian-core-libs-1.4.23-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xapian-core-libs}"
RDEPENDS:xapian-core-libs = " \
 libuuid \
 zlib-ng-compat \
 libgcc \
 libstdc++ \
 glibc \
"

URI_xapian-core-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xapian-core-devel-1.4.23-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xapian-core-devel}"
RDEPENDS:xapian-core-devel = " \
 pkgconf-pkg-config \
 libuuid-devel \
 bash \
 xapian-core \
 xapian-core-libs \
"
