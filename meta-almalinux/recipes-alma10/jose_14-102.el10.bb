
PN = "jose"
PE = "0"
PV = "14"
PR = "102.el10"
PACKAGES = "jose libjose libjose-devel"


URI_jose = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jose-14-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jose = " \
 glibc \
 libgcc \
 libjose \
 jansson \
"

URI_libjose = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libjose-14-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjose = " \
 zlib-ng-compat \
 jansson \
 openssl-libs \
 libgcc \
 glibc \
"

URI_libjose-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libjose-devel-14-102.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libjose-devel = " \
 zlib-ng-compat-devel \
 pkgconf-pkg-config \
 openssl-devel \
 jansson-devel \
 libjose \
"
