
PN = "apr"
PE = "0"
PV = "1.7.5"
PR = "2.el10"
PACKAGES = "apr apr-devel"


URI_apr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-1.7.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr = " \
 glibc \
 libxcrypt \
 libuuid \
"

URI_apr-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-devel-1.7.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-devel = " \
 python3 \
 apr \
 bash \
 pkgconf-pkg-config \
"
