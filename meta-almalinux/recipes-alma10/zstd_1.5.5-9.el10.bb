
PN = "zstd"
PE = "0"
PV = "1.5.5"
PR = "9.el10"
PACKAGES = "libzstd zstd libzstd-devel libzstd-static"


URI_libzstd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libzstd-1.5.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libzstd = "
 glibc
"

URI_zstd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/zstd-1.5.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zstd = "
 zlib-ng-compat
 lz4-libs
 libgcc
 libstdc++
 bash
 glibc
 xz-libs
"

URI_libzstd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libzstd-devel-1.5.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libzstd-devel = "
 libzstd
 pkgconf-pkg-config
"

URI_libzstd-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libzstd-static-1.5.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libzstd-static = "
 libzstd-devel
"
