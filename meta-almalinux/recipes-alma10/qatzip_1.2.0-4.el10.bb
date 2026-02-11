
PN = "qatzip"
PE = "0"
PV = "1.2.0"
PR = "4.el10"
PACKAGES = "qatzip qatzip-libs qatzip-devel"


URI_qatzip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qatzip-1.2.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatzip = " \
 glibc \
 lz4-libs \
 qatlib \
 zlib-ng-compat \
"

URI_qatzip-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qatzip-libs-1.2.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatzip-libs = " \
 glibc \
 lz4-libs \
 qatlib \
 zlib-ng-compat \
"

URI_qatzip-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qatzip-devel-1.2.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qatzip-devel = " \
 zlib-ng-compat-devel \
 lz4-devel \
 pkgconf-pkg-config \
 qatzip-libs \
"
