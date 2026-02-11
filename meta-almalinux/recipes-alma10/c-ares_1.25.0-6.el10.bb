
PN = "c-ares"
PE = "0"
PV = "1.25.0"
PR = "6.el10"
PACKAGES = "c-ares c-ares-devel"


URI_c-ares = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/c-ares-1.25.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:c-ares = " \
 glibc \
"

URI_c-ares-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/c-ares-devel-1.25.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:c-ares-devel = " \
 cmake-filesystem \
 pkgconf-pkg-config \
 c-ares \
"
