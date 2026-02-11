
PN = "sombok"
PE = "0"
PV = "2.4.0"
PR = "23.el10"
PACKAGES = "sombok sombok-devel"


URI_sombok = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sombok-2.4.0-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sombok = " \
 glibc \
 libthai \
"

URI_sombok-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sombok-devel-2.4.0-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sombok-devel = " \
 sombok \
 pkgconf-pkg-config \
"
