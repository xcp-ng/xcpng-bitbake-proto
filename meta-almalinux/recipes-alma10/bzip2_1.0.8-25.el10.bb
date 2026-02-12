
inherit dnf-bridge

PN = "bzip2"
PE = "0"
PV = "1.0.8"
PR = "25.el10"
PACKAGES = "bzip2 bzip2-libs bzip2-devel bzip2-static"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/bzip2-1.0.8-25.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_bzip2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bzip2-1.0.8-25.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bzip2}"
RDEPENDS:bzip2 = " \
 glibc \
 bash \
 bzip2-libs \
"

URI_bzip2-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bzip2-libs-1.0.8-25.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bzip2-libs}"
RDEPENDS:bzip2-libs = " \
 glibc \
"

URI_bzip2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bzip2-devel-1.0.8-25.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bzip2-devel}"
RDEPENDS:bzip2-devel = " \
 bzip2-libs \
 pkgconf-pkg-config \
"

URI_bzip2-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bzip2-static-1.0.8-25.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bzip2-static}"
RDEPENDS:bzip2-static = ""
