
inherit dnf-bridge

PN = "oneapi-level-zero"
PE = "0"
PV = "1.15.13"
PR = "3.el10"
PACKAGES = "oneapi-level-zero oneapi-level-zero-devel"


URI_oneapi-level-zero = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/oneapi-level-zero-1.15.13-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:oneapi-level-zero = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_oneapi-level-zero-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/oneapi-level-zero-devel-1.15.13-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:oneapi-level-zero-devel = " \
 oneapi-level-zero \
 oneapi-level-zero-devel \
 pkgconf-pkg-config \
"
