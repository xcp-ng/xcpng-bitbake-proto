
inherit dnf-bridge

PN = "lz4"
PE = "0"
PV = "1.9.4"
PR = "8.el10"
PACKAGES = "lz4 lz4-libs lz4-devel lz4-static"


URI_lz4 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lz4-1.9.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lz4 = " \
 glibc \
"

URI_lz4-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lz4-libs-1.9.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lz4-libs = " \
 glibc \
"

URI_lz4-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lz4-devel-1.9.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lz4-devel = " \
 lz4-libs \
 pkgconf-pkg-config \
"

URI_lz4-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lz4-static-1.9.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lz4-static = ""
