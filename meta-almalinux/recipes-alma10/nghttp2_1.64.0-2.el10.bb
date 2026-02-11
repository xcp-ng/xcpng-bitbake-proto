
inherit dnf-bridge

PN = "nghttp2"
PE = "0"
PV = "1.64.0"
PR = "2.el10"
PACKAGES = "libnghttp2 libnghttp2-devel nghttp2"


URI_libnghttp2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnghttp2-1.64.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnghttp2 = " \
 glibc \
"

URI_libnghttp2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnghttp2-devel-1.64.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnghttp2-devel = " \
 pkgconf-pkg-config \
 libnghttp2 \
"

URI_nghttp2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nghttp2-1.64.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nghttp2 = " \
 python3 \
 systemd \
 zlib-ng-compat \
 libev \
 c-ares \
 libgcc \
 openssl-libs \
 libxml2 \
 libstdc++ \
 bash \
 libnghttp2 \
 glibc \
"
