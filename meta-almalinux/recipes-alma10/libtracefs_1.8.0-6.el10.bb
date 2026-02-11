
PN = "libtracefs"
PE = "0"
PV = "1.8.0"
PR = "6.el10"
PACKAGES = "libtracefs libtracefs-devel"


URI_libtracefs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtracefs-1.8.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtracefs = " \
 glibc \
 libtraceevent \
"

URI_libtracefs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtracefs-devel-1.8.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtracefs-devel = " \
 libtraceevent-devel \
 libtracefs \
 pkgconf-pkg-config \
"
