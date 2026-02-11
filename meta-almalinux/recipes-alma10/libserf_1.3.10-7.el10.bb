
PN = "libserf"
PE = "0"
PV = "1.3.10"
PR = "7.el10"
PACKAGES = "libserf libserf-devel"


URI_libserf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libserf-1.3.10-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libserf = " \
 zlib-ng-compat \
 openssl-libs \
 apr \
 apr-util \
 krb5-libs \
 glibc \
"

URI_libserf-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libserf-devel-1.3.10-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libserf-devel = " \
 libserf \
 openssl-devel \
 pkgconf-pkg-config \
 apr-devel \
"
