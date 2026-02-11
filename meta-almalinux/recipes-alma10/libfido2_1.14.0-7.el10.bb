
inherit dnf-bridge

PN = "libfido2"
PE = "0"
PV = "1.14.0"
PR = "7.el10"
PACKAGES = "libfido2 fido2-tools libfido2-devel"


URI_libfido2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libfido2-1.14.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfido2 = " \
 zlib-ng-compat \
 systemd-libs \
 openssl-libs \
 libcbor \
 glibc \
"

URI_fido2-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fido2-tools-1.14.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fido2-tools = " \
 zlib-ng-compat \
 libfido2 \
 openssl-libs \
 libcbor \
 glibc \
"

URI_libfido2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfido2-devel-1.14.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfido2-devel = " \
 libfido2 \
 openssl-devel \
 pkgconf-pkg-config \
"
