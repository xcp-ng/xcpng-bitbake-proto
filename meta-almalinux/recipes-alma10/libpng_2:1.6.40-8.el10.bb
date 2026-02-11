
inherit dnf-bridge

PN = "libpng"
PE = "2"
PV = "1.6.40"
PR = "8.el10"
PACKAGES = "libpng libpng-devel libpng-static libpng-tools"


URI_libpng = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpng-1.6.40-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpng = " \
 glibc \
 zlib-ng-compat \
"

URI_libpng-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpng-devel-1.6.40-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpng-devel = " \
 zlib-ng-compat \
 libpng \
 zlib-ng-compat-devel \
 pkgconf-pkg-config \
 bash \
 glibc \
"

URI_libpng-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpng-static-1.6.40-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpng-static = " \
 libpng-devel \
"

URI_libpng-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpng-tools-1.6.40-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpng-tools = " \
 glibc \
 zlib-ng-compat \
 libpng \
"
