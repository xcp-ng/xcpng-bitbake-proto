
PN = "zlib-ng"
PE = "0"
PV = "2.2.3"
PR = "1.el10"
PACKAGES = "zlib-ng-compat zlib-ng-compat-devel zlib-ng zlib-ng-compat-static zlib-ng-devel"


URI_zlib-ng-compat = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/zlib-ng-compat-2.2.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zlib-ng-compat = "
 glibc
"

URI_zlib-ng-compat-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/zlib-ng-compat-devel-2.2.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zlib-ng-compat-devel = "
 zlib-ng-compat
 cmake-filesystem
 pkgconf-pkg-config
"

URI_zlib-ng = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/zlib-ng-2.2.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zlib-ng = "
 glibc
"

URI_zlib-ng-compat-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/zlib-ng-compat-static-2.2.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zlib-ng-compat-static = "
 zlib-ng-compat-devel
"

URI_zlib-ng-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/zlib-ng-devel-2.2.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zlib-ng-devel = "
 zlib-ng
 cmake-filesystem
 pkgconf-pkg-config
"
