
inherit dnf-bridge

PN = "libzip"
PE = "0"
PV = "1.10.1"
PR = "5.el10"
PACKAGES = "libzip libzip-tools libzip-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libzip-1.10.1-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libzip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libzip-1.10.1-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libzip}"
RDEPENDS:libzip = " \
 zlib-ng-compat \
 bzip2-libs \
 openssl-libs \
 libzstd \
 glibc \
 xz-libs \
"

URI_libzip-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libzip-tools-1.10.1-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libzip-tools}"
RDEPENDS:libzip-tools = " \
 glibc \
 libzip \
 zlib-ng-compat \
"

URI_libzip-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libzip-devel-1.10.1-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libzip-devel}"
RDEPENDS:libzip-devel = " \
 libzip \
 cmake-filesystem \
 pkgconf-pkg-config \
"
