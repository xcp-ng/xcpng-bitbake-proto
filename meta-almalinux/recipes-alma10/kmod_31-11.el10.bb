
PN = "kmod"
PE = "0"
PV = "31"
PR = "11.el10"
PACKAGES = "kmod kmod-libs kmod-devel"


URI_kmod = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kmod-31-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kmod = " \
 zlib-ng-compat \
 openssl-libs \
 libgcc \
 libzstd \
 bash \
 glibc \
 xz-libs \
"

URI_kmod-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kmod-libs-31-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kmod-libs = " \
 zlib-ng-compat \
 openssl-libs \
 libgcc \
 libzstd \
 glibc \
 xz-libs \
"

URI_kmod-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/kmod-devel-31-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kmod-devel = " \
 kmod-libs \
 pkgconf-pkg-config \
"
