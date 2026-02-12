
inherit dnf-bridge

PN = "libblkio"
PE = "0"
PV = "1.5.0"
PR = "2.el10"
PACKAGES = "libblkio libblkio-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libblkio-1.5.0-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libblkio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblkio-1.5.0-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libblkio}"
RDEPENDS:libblkio = " \
 glibc \
 libgcc \
"

URI_libblkio-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libblkio-devel-1.5.0-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libblkio-devel}"
RDEPENDS:libblkio-devel = " \
 libblkio \
 pkgconf-pkg-config \
"
